package org.iso_relax.miaou.mySs;
import org.iso_relax.miaou.ss.PatternGroup;
import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.ss.URVisitor;

/**
 * This class reorders operands of groups so that
 * attributes precede non-attributes.
 *
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class GroupNormalizer {

  private org.iso_relax.miaou.ss.ISimpleSyntaxFactory factory;

  public GroupNormalizer() {
    factory = org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory();
  }

  /**
   * Group normalization for an entire grammar.
   */
  public void simplify(RootGrammar grammar) {

    URVisitor.traverse(grammar, new GroupGetter(this));

  }
  /**
   * Group normalization for a group.
   * This function is invoked by GroupGetter.
   * @param group
   */
  public void simplify(PatternGroup group) {
    IMyPatternChoice patternOne = (IMyPatternChoice)group.getPattern1();
    IMyPatternChoice patternTwo = (IMyPatternChoice)group.getPattern2();

    AtomOccurrenceChecker checkerOne = new AtomOccurrenceChecker();
    AtomOccurrenceChecker checkerTwo = new AtomOccurrenceChecker();

    URVisitor.traverse(patternOne, checkerOne);
    URVisitor.traverse(patternTwo, checkerTwo);

    if (checkerOne.nonAttributeless() || checkerTwo.nonAttributeless()) {
      if (checkerOne.attributeless() && !checkerTwo.attributeless()) {

        PatternGroup  newGroup   = factory.createPatternGroup();
        newGroup.setPattern1(patternTwo.deepCopy());
        newGroup.setPattern2(patternOne.deepCopy());

        Object parent = group.getParentRNode();

        PatternRewriter.singleInstance().replace(parent, group, newGroup);
      }
    }
  }
}