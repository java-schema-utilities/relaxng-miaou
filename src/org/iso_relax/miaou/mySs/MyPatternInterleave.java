package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternInterleave;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternInterleave extends PatternInterleave
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    BtrExpInterleave inter = factory.createBtrExpInterleave();

    inter.setBtrExp1(((IMyPatternChoice)getPattern1()).binarize(defineHash));
    inter.setBtrExp2(((IMyPatternChoice)getPattern1()).binarize(defineHash));
    inter.setBtrExp3(factory.createBtrExpVariable());

    return inter;
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternInterleave(makeDocument());
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
    PatternInterleave copy = SimpleSyntaxFactory.getFactory().createPatternInterleave();
    copy.setPattern1(((IMyPatternChoice)getPattern1()).deepCopy());
    copy.setPattern2(((IMyPatternChoice)getPattern2()).deepCopy());
    return copy;
  }
}
