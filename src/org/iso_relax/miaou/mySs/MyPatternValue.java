package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternValue;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternValue
  extends PatternValue
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory =
      BinaryTreeGrammarFactory.getFactory();
    BtrExpAtomic atomic = factory.createBtrExpAtomic();
    atomic.setContent(convert());
    atomic.setBtrExp(factory.createBtrExpVariable());
    return atomic;
  }

  public Value convert() {
    IBinaryTreeGrammarFactory factory =
      BinaryTreeGrammarFactory.getFactory();
    Value copy = factory.createValue();
    copy.setContent(getContent());
    copy.setDatatypeLibrary(getDatatypeLibrary());
    copy.setNs(getNs());
    copy.setType(getType());
    return copy;
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternValue(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    PatternValue copy = (PatternValue)super.clone();
    return copy;
  }

  public IPatternChoice deepCopy() {
    PatternValue copy = SimpleSyntaxFactory.getFactory().createPatternValue();
    copy.setContent(getContent());
    copy.setDatatypeLibrary(getDatatypeLibrary());
    copy.setNs(getNs());
    copy.setType(getType());
    return copy;
  }
}
