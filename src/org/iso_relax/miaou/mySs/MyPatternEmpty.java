package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternEmpty;
import org.iso_relax.miaou.ss.PatternNotAllowed;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternEmpty extends PatternEmpty
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    return BinaryTreeGrammarFactory.getFactory().createBtrExpVariable();
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)makeDocument();
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
    PatternEmpty copy =
      SimpleSyntaxFactory.getFactory().createPatternEmpty();
    return copy;
  }
}
