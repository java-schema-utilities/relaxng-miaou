package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternAttribute;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternAttribute extends PatternAttribute
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {
      System.err.println("Normalization should remove all <attribute/>!");
      return null;
  }

  public IPatternChoice deepCopy() {
    MyPatternAttribute copy =  new MyPatternAttribute();
    copy.setSyntaxExtensionNc(getSyntaxExtensionNc());
    copy.setPattern(((IMyPatternChoice)getPattern()).deepCopy());
    copy.setSyntaxExtensionNc(getSyntaxExtensionNc());
    return copy;
  }


  public Object clone() throws CloneNotSupportedException {
    PatternAttribute copy = (PatternAttribute)super.clone();
    IPatternChoice copiedPattern =
      (IPatternChoice)((IMyPatternChoice)getPattern()).clone();
    copy.setPattern(copiedPattern);
    return copy;
  }
/*
  public IPatternChoice deepCopy() {
    PatternAttribute copy = SimpleSyntaxFactory.getFactory().createPatternAttribute();
    copy.setPattern(((IMyPatternChoice)getPattern()).deepCopy());
    return copy;
  }
  */
}
