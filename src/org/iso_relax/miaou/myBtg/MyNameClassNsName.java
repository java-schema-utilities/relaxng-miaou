package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.NameClassNsName;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassNsName
  extends NameClassNsName
  implements IMyNameClassChoice, Cloneable {

  public Object clone() throws CloneNotSupportedException {
    MyNameClassNsName copy = (MyNameClassNsName)super.clone();
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice deepCopy() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassNsName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }

  /*
  public org.iso_relax.bta.INameClassChoice convert() {
    try {
      return BinaryTreeAutomatonFactory.getFactory().createNameClassNsName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
  */

    public org.iso_relax.miaou.bta.INameClassChoice convert() {
    org.iso_relax.miaou.bta.NameClassNsName copy =
      BinaryTreeAutomatonFactory.getFactory().createNameClassNsName();
    copy.setNs(getNs());
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass(except.convert());
    }
    return copy;
  }
}
