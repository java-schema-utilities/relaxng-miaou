package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.NameClassChoice;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassChoice
  extends NameClassChoice
  implements IMyNameClassChoice, Cloneable {

  public Object clone() throws CloneNotSupportedException {
    MyNameClassChoice copy = (MyNameClassChoice)super.clone();
    IMyNameClassChoice nc1 =
      (IMyNameClassChoice)((IMyNameClassChoice)getNameClass1()).clone();
    IMyNameClassChoice nc2 =
      (IMyNameClassChoice)((IMyNameClassChoice)getNameClass2()).clone();
    copy.setNameClass1(nc1);
    copy.setNameClass2(nc2);
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice deepCopy() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassChoice(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    /*
  public org.iso_relax.bta.INameClassChoice convert() {
    try {
      return BinaryTreeAutomatonFactory.getFactory().createNameClassChoice(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    */

  public org.iso_relax.miaou.bta.INameClassChoice convert() {
    org.iso_relax.miaou.bta.NameClassChoice copy =
      BinaryTreeAutomatonFactory.getFactory().createNameClassChoice();
    copy.setNameClass1(((IMyNameClassChoice)getNameClass1()).convert());
    copy.setNameClass2(((IMyNameClassChoice)getNameClass2()).convert());
    return copy;
  }

}
