package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternOneOrMore;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternOneOrMore extends PatternOneOrMore
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    BtrExpOneOrMore oneOrMore =
       BinaryTreeGrammarFactory.getFactory().createBtrExpOneOrMore();
    oneOrMore.setBtrExp(((IMyPatternChoice)getPattern()).binarize(defineHash));
    return oneOrMore;
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternOneOrMore(makeDocument());
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
    PatternOneOrMore copy =
      SimpleSyntaxFactory.getFactory().createPatternOneOrMore();
    copy.setPattern(((IMyPatternChoice)getPattern()).deepCopy());
    return copy;
  }
}
