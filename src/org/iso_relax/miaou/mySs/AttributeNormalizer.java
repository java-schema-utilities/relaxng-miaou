package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternAttribute;
import java.util.LinkedList;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.PatternChoice;
import org.iso_relax.miaou.ss.PatternGroup;
import org.iso_relax.miaou.ss.PatternInterleave;
import org.iso_relax.miaou.ss.PatternOneOrMore;
import org.iso_relax.miaou.ss.PatternOneOrMoreAttribute;
import org.iso_relax.miaou.ss.PatternEmpty;
import org.iso_relax.miaou.ss.DefineElement;
import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.NameClassName;
import org.iso_relax.miaou.ss.ExceptNameClass;
import org.iso_relax.miaou.ss.PatternNonExistentAttribute;

/**
 *
 * This class converts &lt;attribute&gt; to &lt;oneOrMoreAttribute&gt;
 * and introduces &lt;nonExistentAttribute&gt;.
 *
 * <ul>
 * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )+</li>
 * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )*</li>
 * <li>@{a1,a2,...,an}[p] outside of &lt;oneOrMore&gt;</li>
 * <li>&lt;choice&gt;p1 p2 &lt;/choice&gt;</li>
 * </ul>
 *
 * Case 1: (p1 | p2 | ... | pi | @n1[p1] | @n2[p2] | ... | @nj[pj] )+
 *
 * 1) j = 0
 *
 * original = (p1 | p2 | ... | pi)+
 *
 * 2) i = 0
 *
 * normalizeOneOrMoreAttributes({@n1[p1], @n2[p2], ..., @nj[pj]})
 *
 * 3) otherwise
 *
 * normalizeOneOrMoreAttributes({@n1[p1], @n2[p2], ... , @nj[pj]})
 *   | ((@n1[p1]* |  @n2[p2]* | ... | @nj[pj]*) (p1 | p2 | ... | pi)+)
 *
 *
 * Case 2: (p1 | p2 | ... | pi | @n1[p1] | @n2[p2] | ... | @nj[pj] )*
 *
 * 1) j = 0
 *
 * original = (p1 | p2 | ... | pi)*
 *
 * 2) i = 0
 *
 * @n1[p1]* |  @n2[p2]* | ... | @nj[pj]*
 *
 * 3) otherwise
 *
 * (@n1[p1]* |  @n2[p2]* | ... | @nj[pj]*) (p1 | p2 | ... | pi)*
 *
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class AttributeNormalizer {

  private org.iso_relax.miaou.ss.ISimpleSyntaxFactory factory;

  public AttributeNormalizer() {
    factory = org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory();
  }

  /**
   * top-level function
   */
  public void normalize(RootGrammar grammar) {
    normalizeOneOrMore(grammar);
    normalizeAttributesOutsideOneOrMore(grammar);
    introduceNonExistentAttribute(grammar);
  }

  /**
   * normalizes &lt;attribute&gt; to &lt;oneOrMoreAttribute&gt;.
   * <ul>
   * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )+</li>
   * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )*</li>
   * </ul>
   */
  private void normalizeOneOrMore(RootGrammar grammar) {

    LinkedList oneOrMores = new LinkedList();
    OneOrMoreGetter oneOrMoreGetter   =
      new OneOrMoreGetter(oneOrMores);
    org.iso_relax.miaou.ss.URVisitor.traverse(grammar, oneOrMoreGetter);
    for (int i = 0; i< oneOrMores.size(); i++) {
      convertOneOrMore((PatternOneOrMore)oneOrMores.get(i));
    }
  }

  /**
   * normalizes @n[p] outside of &lt;oneOrMore&gt;.
   */

  private void normalizeAttributesOutsideOneOrMore(RootGrammar grammar) {

      LinkedList attributesOutsideOneOrMore  = new LinkedList();
      AttributeGetter attributeGetter   =
        new AttributeGetter(attributesOutsideOneOrMore);
      org.iso_relax.miaou.ss.URVisitor.traverse(grammar, attributeGetter);
      for (int i = 0; i < attributesOutsideOneOrMore.size(); i++) {
        convertAttributeOutsideOneOrMore(
          (PatternAttribute)attributesOutsideOneOrMore.get(i));
      }
  }

  /**
   * introduces nonExistent attribute declarations.
   */

  private void introduceNonExistentAttribute(RootGrammar grammar) {

    org.iso_relax.miaou.ss.URVisitor.traverse(grammar, new ChoiceGetter(this));
    org.iso_relax.miaou.ss.URVisitor.traverse(grammar, new ElementVisitor(this));

  }

  /**
   * converts a &lt;oneOrMore&gt;, which may contain &lt;attribute&gt;
   */

  private void convertOneOrMore(PatternOneOrMore oneOrMore) {

    LinkedList attributesUnderChoice = new LinkedList();
    LinkedList nonAttributesUnderChoice  = new LinkedList();
    OneOrMoreScanner oneOrMoreScanner   =
      new OneOrMoreScanner(attributesUnderChoice, nonAttributesUnderChoice);

    org.iso_relax.miaou.ss.URVisitor.traverse(oneOrMore, oneOrMoreScanner);

    if (attributesUnderChoice.isEmpty())
      convertOneOrMoreWhenNonAttributesOnly(oneOrMore);
    else if (nonAttributesUnderChoice.isEmpty())
      convertOneOrMoreWhenAttributesOnly(oneOrMore, attributesUnderChoice);
    else
      convertOneOrMoreWhenBoth(oneOrMore,
                                attributesUnderChoice,
                                nonAttributesUnderChoice);
  }

  /**
   * converts &lt;oneOrMore&gt; not containing any attributes.
   *
   * <p>input  (p1 | p2 | ... | pi)+</p>
   * <p>output (p1 | p2 | ... | pi)+</p>
   */

  private void convertOneOrMoreWhenNonAttributesOnly(PatternOneOrMore oneOrMore) {
  }

  /**
   * converts &lt;oneOrMore&gt; not containing non-attributes as siblings of
   * &lt;attribute&gt;.
   *
   * <p>input   (@n1[q1] | @n2[q2] | ... | @nj[qj] )+</p>
   * @param attributesUnderChoice list of &lt;attribute&gt;s below the oneOrMore
   */

  private void convertOneOrMoreWhenAttributesOnly(PatternOneOrMore oneOrMore,
       LinkedList attributesUnderChoice) {

    if ((oneOrMore.getParentRNode() instanceof PatternChoice) &&
        ((((PatternChoice)oneOrMore.getParentRNode()).getPattern1()
            instanceof PatternEmpty) ||
         (((PatternChoice)oneOrMore.getParentRNode()).getPattern2()
            instanceof PatternEmpty)  )) {

        convertOneOrMoreWhenAttributesOnlyInsideZeroOrMore(oneOrMore,
                attributesUnderChoice);
    }
    else {
        convertOneOrMoreWhenAttributesOnlyOutsideZeroOrMore(oneOrMore,
                attributesUnderChoice);
    }
  }

  /**
   * converts &lt;oneOrMore&gt; that does not contain non-attributes as siblings of
   * &lt;attribute&gt; and is not directly under &lt;optional&gt;.
   *
   * <p>input (@n1[q1] | @n2[q2] | ... | @nj[qj])*</p>
   * <p>output @n1[q1]* | @n2[q2]* | ... | @nj[qj]*</p>
   *
   * @param attributesUnderChoice a list of &lt;attribute&gt;s.
   *
   */

  private void convertOneOrMoreWhenAttributesOnlyInsideZeroOrMore(
                  PatternOneOrMore  oneOrMore,
                  LinkedList        attributesUnderChoice) {

    IPatternChoice rewrittenPattern =
      normalizeZeroOrMoreAttributes((LinkedList)attributesUnderChoice.clone());

    replace(oneOrMore.getParentRNode().getParentRNode(),
              (IPatternChoice)oneOrMore.getParentRNode(),
              rewrittenPattern);
  }

  /**
   * converts &lt;oneOrMore&gt; that does not contain non-attributes as
   * siblings of &lt;attribute&gt; and is not directly under &lt;optional&gt;.
   *
   * <p>input  (@n1[q1] | @n2[q2] | ... | @nj[qj] )+</p>
   * <p>output  normalizeOneOrMoreAttributes({@n1[q1], @n2[q2], ..., @nj[qj]})</p>
   *
   * @param attributesUnderChoice a list of &lt;attribute&gt;s.
   */

  private void convertOneOrMoreWhenAttributesOnlyOutsideZeroOrMore(
                  PatternOneOrMore  oneOrMore,
                  LinkedList        attributesUnderChoice) {

    IPatternChoice rewrittenPattern =
      normalizeOneOrMoreAttributes((LinkedList)attributesUnderChoice.clone());

    replace(oneOrMore.getParentRNode(), oneOrMore, rewrittenPattern);

  }

  /**
   * converts &lt;oneOrMore&gt; that contains both attributes and non-attributes.
   *
   * <ul>
   * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )+</li>
   * <li>(p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )*</li>
   * </ul>
   *
   * @param attributesUnderChoice a list of &lt;attribute&gt;s.
   * @param nonAttributesUnderChoice a list of non-&lt;attribute&gt;s.
   *
   */

  private void convertOneOrMoreWhenBoth(
                PatternOneOrMore oneOrMore,
                LinkedList attributesUnderChoice,
                LinkedList nonAttributesUnderChoice) {

    if ((oneOrMore.getParentRNode() instanceof PatternChoice) &&
        ((((PatternChoice)oneOrMore.getParentRNode()).getPattern1()
            instanceof PatternEmpty) ||
         (((PatternChoice)oneOrMore.getParentRNode()).getPattern2()
            instanceof PatternEmpty)  )) {

        convertOneOrMoreWhenBothInsideZeroOrMore(oneOrMore,
                                                          attributesUnderChoice,
                                                          nonAttributesUnderChoice);
    }
    else {
        convertOneOrMoreWhenBothOutsideZeroOrMore(oneOrMore,
                                                          attributesUnderChoice,
                                                          nonAttributesUnderChoice);
    }
  }

  /**
   * converts &lt;oneOrMore&gt; that contains both attributes and non-attributes
   * and is directly under &lt;optional&gt;.
   *
   * (p1 | p2 | ...| pi | @n1[q1] | @n2[q2] | ...| @nj[qj] )*
   *
   * @param attributesUnderChoice a list of &lt;attribute&gt;s.
   * @param nonAttributesUnderChoice a list of non-&lt;attribute&gt;s.
   *
   */

  private void convertOneOrMoreWhenBothInsideZeroOrMore(
                PatternOneOrMore oneOrMore,
                LinkedList attributesUnderChoice,
                LinkedList nonAttributesUnderChoice) {

    PatternGroup     group     = factory.createPatternGroup();
    PatternChoice    choice    = factory.createPatternChoice();
    PatternOneOrMore newOneOrMore = factory.createPatternOneOrMore();

    IPatternChoice patternForAttributes =
      normalizeZeroOrMoreAttributes(
        (LinkedList)attributesUnderChoice.clone());

    IPatternChoice patternForNonAttributes =
      normalizeZeroOrMoreNonAttributes(
        (LinkedList)nonAttributesUnderChoice.clone());

    group.setPattern1(patternForAttributes);
    group.setPattern2(choice);
    choice.setPattern1(newOneOrMore);
    newOneOrMore.setPattern(patternForNonAttributes);
    choice.setPattern2(factory.createPatternEmpty());

    Object grandParent = oneOrMore.getParentRNode().getParentRNode();
    replace(grandParent,
            (IPatternChoice)oneOrMore.getParentRNode(), group);
  }

  /**
   * converts &lt;oneOrMore&gt; that contains both attributes and non-attributes
   * and is not directly under &lt;optional&gt;.
   *
   * (p1 | p2 | ... | pi | @n1[q1] | @n2[q2] | ... | @nj[qj] )+
   *
   * @param attributesUnderChoice a list of &lt;attribute&gt;s.
   * @param nonAttributesUnderChoice a list of non-&lt;attribute&gt;s.
   *
   */

  private void convertOneOrMoreWhenBothOutsideZeroOrMore(
                PatternOneOrMore oneOrMore,
                LinkedList attributesUnderChoice,
                LinkedList nonAttributesUnderChoice) {

    PatternChoice    choice       = factory.createPatternChoice();
    PatternGroup     group        = factory.createPatternGroup();
    PatternOneOrMore newOneOrMore = factory.createPatternOneOrMore();

    IPatternChoice patternForOneOrMoreAttributes =
      normalizeOneOrMoreAttributes(
        (LinkedList)attributesUnderChoice.clone());

    IPatternChoice patternForZeroOrMoreAttributes =
      normalizeZeroOrMoreAttributes(
        (LinkedList)attributesUnderChoice.clone());

    IPatternChoice patternForNonAttributes =
      normalizeOneOrMoreNonAttributes(
        (LinkedList)nonAttributesUnderChoice.clone());

    choice.setPattern1(patternForOneOrMoreAttributes);
    choice.setPattern2(group);
    group.setPattern1(patternForZeroOrMoreAttributes);
    group.setPattern2(newOneOrMore);
    newOneOrMore.setPattern(patternForNonAttributes);

    replace(oneOrMore.getParentRNode(), oneOrMore, choice);
  }

  /**
   * normalize attribute-only &lt;oneOrMore&gt;.
   *
   * @param atts @n1[q1],  @n2[q2], ..., @nj[qj]
   * @return normalizeOneOrMoreAttributes({@n2[q2], ..., @nj[qj]}) | (@n1[q1]+  (@n2[q2]*, ..., @nj[qj]*))
   */

  private IPatternChoice normalizeOneOrMoreAttributes(LinkedList atts) {

    PatternAttribute att = (PatternAttribute)atts.removeFirst();

    if (atts.isEmpty()) {
      return convertAttribute(att);
    }
    else {
      PatternChoice choice1 = factory.createPatternChoice();
      PatternGroup  group   = factory.createPatternGroup();
      PatternChoice choice2 = factory.createPatternChoice();

      choice1.setPattern1(convertAttribute(att));
      choice1.setPattern2(group);
      group.setPattern1(choice2);
      choice2.setPattern1(convertAttribute(att));
      choice2.setPattern2(factory.createPatternEmpty());
      group.setPattern2(normalizeOneOrMoreAttributes(atts));
      return choice1;
    }
  }

  /**
   * converts &lt;attribute...&gt; to &lt;oneOrMoreAttribute...&gt;.
   *
   * @param &lt;attribute...&gt;
   * @return &lt;oneOrMoreAttribute...&gt;
   */

  private IPatternChoice convertAttribute (PatternAttribute attribute) {

    PatternOneOrMoreAttribute oneOrMoreAttribute
      = factory.createPatternOneOrMoreAttribute();
    oneOrMoreAttribute.setNameClass(((MyPatternAttribute)attribute).getMyNameClass().deepCopy());
    oneOrMoreAttribute.setPattern(((IMyPatternChoice)attribute.getPattern()).deepCopy());
    return oneOrMoreAttribute;
  }

  /**
   * normalize attribute-only &lt;zeroOrMore&gt;.
   *
   * @param atts  @n1[q1],  @n2[q2], ..., @nj[qj]
   * @return (@n1[q1]*,  @n2[q2]*, ..., @nj[qj]*)
   */

  private IPatternChoice normalizeZeroOrMoreAttributes (LinkedList atts) {

    PatternAttribute att = (PatternAttribute)atts.removeFirst();
    PatternChoice choice = factory.createPatternChoice();
    PatternEmpty empty = factory.createPatternEmpty();

    choice.setPattern1(convertAttribute(att));
    choice.setPattern2(empty);

    if (atts.isEmpty()) {
      return choice;
    }
    else {
      PatternGroup group = factory.createPatternGroup();
      group.setPattern1(choice);
      group.setPattern2(normalizeZeroOrMoreAttributes(atts));
      return group;
    }
  }

  /**
   * creates a &lt;zeroOrMore&gt; of non-attribute patterns.
   * @param nonAtts {p1, p2, ..., pi}
   * @return (p1 | p2 | ... | pi)?
   */

  private IPatternChoice normalizeZeroOrMoreNonAttributes (LinkedList nonAtts) {
    PatternChoice choice = factory.createPatternChoice();
    choice.setPattern1(normalizeOneOrMoreNonAttributes(nonAtts));
    choice.setPattern2(factory.createPatternEmpty());
    return choice;
  }

  /**
   * normalizes a non-attribute-only &lt;oneOrMore&gt;.
   * @param nonAtts {p1, p2, ..., pi}
   * @return (p1 | p2 | ... | pi)
   */

  private IPatternChoice normalizeOneOrMoreNonAttributes (LinkedList nonAtts) {

    IPatternChoice nonAtt = (IPatternChoice)nonAtts.removeFirst();
    if (nonAtts.isEmpty()) {
      return nonAtt;
    }
    else {
      PatternChoice choice = factory.createPatternChoice();
      choice.setPattern1(nonAtt);
      choice.setPattern2(normalizeOneOrMoreNonAttributes(nonAtts));
      return choice;
    }
  }

  /**
   * converts an &lt;attribute&gt; outside of &lt;oneOrMore&gt;.
   *
   * @{a1,a2,...,an}[p] = @a1[p]+ | @a2[p]+ | ... | @an[p]+
   */

  private void convertAttributeOutsideOneOrMore (PatternAttribute attribute) {

    LinkedList names = new LinkedList();
    NameClassNameGetter nameClassNameGetter = new NameClassNameGetter(names);
    org.iso_relax.miaou.ss.URVisitor.traverse(attribute, nameClassNameGetter);

    IPatternChoice rewrittenPattern =
      oneAttribute2oneOrMoreAttribute(names, attribute.getPattern());

    replace(attribute.getParentRNode(), attribute, rewrittenPattern);
  }

  /**
   * converts @{a1, a2, ..., an}[p] to @a1[p]+ | @a2[p]+ | ...| @an[p]+}.
   * @param names @a1, @a2, ..., @an
   * @param pattern p
   * @return @a1[p]+ | @a2[p]+ | ... | @an[p]+}
   */

  private IPatternChoice oneAttribute2oneOrMoreAttribute(
            LinkedList names,
            IPatternChoice pattern) {

    NameClassName firstName = (NameClassName)names.removeFirst();

    PatternOneOrMoreAttribute oneOrMoreAttribute
      = factory.createPatternOneOrMoreAttribute();
    oneOrMoreAttribute.setNameClass(((IMyNameClassChoice)firstName).deepCopy());
    oneOrMoreAttribute.setPattern(((IMyPatternChoice)pattern).deepCopy());

    if (names.isEmpty()) {
      return oneOrMoreAttribute;
    }
    else{
      PatternChoice choice = factory.createPatternChoice();
      choice.setPattern1(oneOrMoreAttribute);
      choice.setPattern2(oneAttribute2oneOrMoreAttribute(names, pattern));
      return choice;
    }
  }

  /**
   * Introduce non-existent attribute declarations to &lt;element&gt;.
   *
   * @param &lt;element&gt;nameClass p&lt;/element&gt;
   */

  void introduceNonExistentAttributeForDefineElement(DefineElement element) {

    IMyPatternChoice pattern = (IMyPatternChoice)element.getPattern();

    IMyNameClassChoice nameClass =
      (IMyNameClassChoice)getAttributeNameClasses(pattern);

    PatternNonExistentAttribute nea =
       factory.createPatternNonExistentAttribute();

    PatternGroup group = factory.createPatternGroup();

    group.setPattern1(nea);
    group.setPattern2(pattern.deepCopy()); //deepCopying should precede replacement

    nea.setNameClass(factory.createNameClassAnyName());
    ExceptNameClass enc = factory.createExceptNameClass();
    if (nameClass != null) {
      enc.setNameClass(nameClass.deepCopy());
      nea.setExceptNameClass(enc);
    }

    if (pattern instanceof PatternEmpty)
      replace(element, pattern, nea);
    else
      replace(element, pattern, group);
  }

  /**
   * Introduce non-existent attribute declarations to alternatives of &lt;choice&gt;.
   *
   * @param &lt;choice&gt;p1 p2 &lt;/choice&gt;
   */

  void introduceNonExistentAttributeForChoice(PatternChoice choice) {
    IMyPatternChoice patternOne = (IMyPatternChoice)choice.getPattern1();
    IMyPatternChoice patternTwo = (IMyPatternChoice)choice.getPattern2();

    IMyNameClassChoice nameClassOne =
      (IMyNameClassChoice)getAttributeNameClasses(patternOne);
    IMyNameClassChoice nameClassTwo =
      (IMyNameClassChoice)getAttributeNameClasses(patternTwo);

    PatternNonExistentAttribute nea1 =
       factory.createPatternNonExistentAttribute();
    PatternNonExistentAttribute nea2 =
      factory.createPatternNonExistentAttribute();

    PatternGroup group1 = factory.createPatternGroup();

    group1.setPattern1(nea1);
    group1.setPattern2(patternOne.deepCopy()); //deepCopying should precede replacement

    PatternGroup group2 = factory.createPatternGroup();
    group2.setPattern1(nea2);
    group2.setPattern2(patternTwo.deepCopy()); //deepCopying should precede replacement

    if ((nameClassOne == null) && (nameClassTwo == null))
      return;
    else if ((nameClassOne == null)  && (nameClassTwo != null)){
      nea1.setNameClass(nameClassTwo.deepCopy());
      if (patternOne instanceof PatternEmpty)
        replace(choice, patternOne, nea1);
      else
        replace(choice, patternOne, group1);
    }
    else if ((nameClassOne != null) && (nameClassTwo == null)) {
      nea2.setNameClass(nameClassOne.deepCopy());
      if (patternTwo instanceof PatternEmpty)
        replace(choice, patternTwo, nea2);
      else
        replace(choice, patternTwo, group2);
    }
    else {
      nea1.setNameClass(nameClassTwo.deepCopy());
      ExceptNameClass enc1 = factory.createExceptNameClass();
      enc1.setNameClass(nameClassOne.deepCopy());
      nea1.setExceptNameClass(enc1);
      if (patternOne instanceof PatternEmpty)
        replace(choice, patternOne, nea1);
      else
        replace(choice, patternOne, group1);

      nea2.setNameClass(nameClassOne.deepCopy());
      ExceptNameClass enc2 = factory.createExceptNameClass();
      enc2.setNameClass(nameClassTwo.deepCopy());
      nea2.setExceptNameClass(enc2);
      if (patternTwo instanceof PatternEmpty)
        replace(choice, patternTwo, nea2);
      else
        replace(choice, patternTwo, group2);
    }
  }

  /**
   * creates the choice of the nameclasses of all descendant &lt;attribute&gt;.
   * @param pattern a pattern
   * @return &lt;choice&gt; of all nameclasses.
   */

  private INameClassChoice getAttributeNameClasses(IPatternChoice pattern) {
    AttributeNameClassGetter attributeNameClassGetter =
      new AttributeNameClassGetter();
    org.iso_relax.miaou.ss.URVisitor.traverse(pattern,
                                          attributeNameClassGetter);
    return attributeNameClassGetter.getNameClass();
  }


  /**
   * replaces an old pattern with a new pattern.
   */
  private void replace(Object parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

    if (parent instanceof PatternGroup)
       replace((PatternGroup)parent, oldPattern, newPattern);
    else if (parent instanceof PatternChoice)
       replace((PatternChoice)parent, oldPattern, newPattern);
    else if (parent instanceof PatternInterleave)
       replace((PatternInterleave)parent, oldPattern, newPattern);
    else if (parent instanceof DefineElement)
       replace((DefineElement)parent, oldPattern, newPattern);
    else
      System.out.println("strange parent");
  }

  private void replace(PatternGroup parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

    if (parent.getPattern1() == oldPattern)
      parent.setPattern1(newPattern);
    else if (parent.getPattern2() == oldPattern)
      parent.setPattern2(newPattern);
    else
      System.err.println("cannot be replaced");
  }

   private void replace(PatternChoice parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

     if (parent.getPattern1() == oldPattern)
       parent.setPattern1(newPattern);
     else if (parent.getPattern2() == oldPattern)
       parent.setPattern2(newPattern);
     else
       System.err.println("cannot be replaced");
  }

   private void replace(PatternInterleave parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {
     if (parent.getPattern1() == oldPattern)
       parent.setPattern1(newPattern);
     else if (parent.getPattern2() == oldPattern)
       parent.setPattern2(newPattern);
     else
       System.err.println("cannot be replaced");
  }


  private void replace(DefineElement parent,
                  IPatternChoice oldPattern,
                  IPatternChoice newPattern) {
    if (parent.getPattern() == oldPattern)
      parent.setPattern(newPattern);
    else
      System.err.println("cannot be replaced");
  }

}
