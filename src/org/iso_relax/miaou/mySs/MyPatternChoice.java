package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternChoice;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternChoice extends PatternChoice
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    BtrExpChoice cho = factory.createBtrExpChoice();
    cho.setBtrExp1(((IMyPatternChoice)getPattern1()).binarize(defineHash));
    cho.setBtrExp2(((IMyPatternChoice)getPattern2()).binarize(defineHash));
    return cho;
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternChoice(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    PatternChoice copy = (PatternChoice)super.clone();
    IPatternChoice copiedPattern1 =
      (IPatternChoice)((IMyPatternChoice)getPattern1()).clone();
    copy.setPattern1(copiedPattern1);
    IPatternChoice copiedPattern2 =
      (IPatternChoice)((IMyPatternChoice)getPattern2()).clone();
    copy.setPattern2(copiedPattern2);
    return copy;
  }

  public IPatternChoice deepCopy() {
    PatternChoice copy = SimpleSyntaxFactory.getFactory().createPatternChoice();
    copy.setPattern1(((IMyPatternChoice)getPattern1()).deepCopy());
    copy.setPattern2(((IMyPatternChoice)getPattern2()).deepCopy());
    return copy;
  }
}
