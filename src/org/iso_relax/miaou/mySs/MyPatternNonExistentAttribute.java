package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternNonExistentAttribute;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternNonExistentAttribute extends PatternNonExistentAttribute
  implements IMyPatternChoice, Cloneable {


  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    BtrExpNonExistentAttribute nea =
      BinaryTreeGrammarFactory.getFactory().createBtrExpNonExistentAttribute();
    nea.setNameClass(this.getSyntaxExtensionNc());
    nea.setExceptNameClass(this.getSyntaxExtensionExceptNc());
    nea.setBtrExp(BinaryTreeGrammarFactory.getFactory().createBtrExpVariable());
    return nea;
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternNonExistentAttribute(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    PatternNonExistentAttribute copy = (PatternNonExistentAttribute)super.clone();
    return copy;
  }

  public IPatternChoice deepCopy() {
    PatternNonExistentAttribute copy =
      SimpleSyntaxFactory.getFactory().createPatternNonExistentAttribute();
    copy.setSyntaxExtensionNc(getSyntaxExtensionNc());
    copy.setSyntaxExtensionExceptNc(getSyntaxExtensionExceptNc());
    return copy;
  }
}
