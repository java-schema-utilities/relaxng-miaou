package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternNotAllowed;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternNotAllowed extends PatternNotAllowed
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {
    return BinaryTreeGrammarFactory.getFactory().createBtrExpNotAllowed();
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternNotAllowed(makeDocument());
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
    PatternNotAllowed copy =
      SimpleSyntaxFactory.getFactory().createPatternNotAllowed();
    return copy;
  }
}
