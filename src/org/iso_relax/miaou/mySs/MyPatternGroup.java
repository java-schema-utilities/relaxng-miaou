package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternGroup;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternGroup extends PatternGroup
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    BtrExpProduct pr = BinaryTreeGrammarFactory.getFactory().createBtrExpProduct();
    pr.setBtrExp1(((IMyPatternChoice)getPattern2()).binarize(defineHash));
    pr.setBtrExp2(((IMyPatternChoice)getPattern1()).binarize(defineHash));
    return pr;
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternGroup(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

  public IPatternChoice deepCopy() {
    PatternGroup copy = SimpleSyntaxFactory.getFactory().createPatternGroup();
    copy.setPattern1(((IMyPatternChoice)getPattern1()).deepCopy());
    copy.setPattern2(((IMyPatternChoice)getPattern2()).deepCopy());
    return copy;
  }
}
