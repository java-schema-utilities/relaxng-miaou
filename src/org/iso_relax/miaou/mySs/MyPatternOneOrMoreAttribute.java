package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternOneOrMoreAttribute;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternOneOrMoreAttribute
  extends PatternOneOrMoreAttribute
  implements IMyPatternChoice, Cloneable {


  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    BtrExpOneOrMoreAttribute oneOrMoreAttr =
      factory.createBtrExpOneOrMoreAttribute();
    BtrExpProduct product = factory.createBtrExpProduct();

    oneOrMoreAttr.setNameClass(getSyntaxExtensionNc());
    oneOrMoreAttr.setBtrExp1(product);
    oneOrMoreAttr.setBtrExp2(factory.createBtrExpVariable());

    product.setBtrExp1(factory.createBtrExpEnd());
    product.setBtrExp2(((IMyPatternChoice)getPattern()).binarize(defineHash));

    return oneOrMoreAttr;
  }

  public Object clone() throws CloneNotSupportedException {
    PatternOneOrMoreAttribute copy = (PatternOneOrMoreAttribute)super.clone();
    IMyPatternChoice origPattern = (IMyPatternChoice)getPattern();
    org.iso_relax.miaou.ss.IPatternChoice copiedPattern =
      (org.iso_relax.miaou.ss.IPatternChoice)origPattern.clone();
    copy.setPattern(copiedPattern);
    return copy;
  }

  public IPatternChoice deepCopy() {
    PatternOneOrMoreAttribute copy =
      SimpleSyntaxFactory.getFactory().createPatternOneOrMoreAttribute();
    copy.setPattern(((IMyPatternChoice)getPattern()).deepCopy());
    copy.setSyntaxExtensionNc(getSyntaxExtensionNc());
    return copy;;
  }
}