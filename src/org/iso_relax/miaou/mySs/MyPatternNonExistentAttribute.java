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

  public IMyNameClassChoice getMyNameClass() {
    return (IMyNameClassChoice)getNameClass();
  }

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    BtrExpNonExistentAttribute nea =
      BinaryTreeGrammarFactory.getFactory().createBtrExpNonExistentAttribute();
    nea.setNameClass(getMyNameClass().convert());
    if (getExceptNameClass() != null)
      nea.setExceptNameClass(((MyExceptNameClass)getExceptNameClass()).convert());
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
    IMyNameClassChoice origNameclass = getMyNameClass();
    copy.setNameClass((IMyNameClassChoice)origNameclass.clone());
    if (getExceptNameClass() != null) {
      MyExceptNameClass origExceptNameClass =
        (MyExceptNameClass)getExceptNameClass();
      MyExceptNameClass copiedExceptNameClass =
        (MyExceptNameClass)origExceptNameClass.clone();
      copy.setExceptNameClass(copiedExceptNameClass);
    }
    return copy;
  }
  public IPatternChoice deepCopy() {
    PatternNonExistentAttribute copy =
      SimpleSyntaxFactory.getFactory().createPatternNonExistentAttribute();
    copy.setNameClass(((IMyNameClassChoice)getNameClass()).deepCopy());
    if (getExceptNameClass() != null)
      copy.setExceptNameClass(((MyExceptNameClass)getExceptNameClass()).deepCopy());
    return copy;
  }
}
