package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.NameClassName;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassName
  extends NameClassName
  implements IMyNameClassChoice, Cloneable {

  public Object clone() throws CloneNotSupportedException {
    MyNameClassName copy = (MyNameClassName)super.clone();
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice deepCopy() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
/*
  public org.iso_relax.bta.INameClassChoice convert() {
    try {
      return BinaryTreeAutomatonFactory.getFactory().createNameClassName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
  */

  public org.iso_relax.miaou.bta.INameClassChoice convert() {
    org.iso_relax.miaou.bta.NameClassName copy =
      BinaryTreeAutomatonFactory.getFactory().createNameClassName();
    copy.setNs(getNs());
    copy.setContent(getContent());
    return copy;
  }
}