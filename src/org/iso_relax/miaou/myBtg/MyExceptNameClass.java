package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.ExceptNameClass;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyExceptNameClass
  extends ExceptNameClass
  implements Cloneable {

  public Object clone() throws CloneNotSupportedException {
    MyExceptNameClass copy = (MyExceptNameClass)super.clone();
    IMyNameClassChoice copiedNameClass =
      (IMyNameClassChoice)((IMyNameClassChoice)getNameClass()).clone();
    copy.setNameClass(copiedNameClass);
    return copy;
  }


  public org.iso_relax.miaou.bta.ExceptNameClass convert() {
    org.iso_relax.miaou.bta.ExceptNameClass copy =
      BinaryTreeAutomatonFactory.getFactory().createExceptNameClass();
    IMyNameClassChoice origNameClass =  (IMyNameClassChoice)getNameClass();
    org.iso_relax.miaou.bta.INameClassChoice convertedNameClass = origNameClass.convert();
    copy.setNameClass(convertedNameClass);
    return copy;
  }
}