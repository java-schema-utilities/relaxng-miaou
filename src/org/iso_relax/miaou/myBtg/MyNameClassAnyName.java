package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.NameClassAnyName;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassAnyName
  extends NameClassAnyName
  implements IMyNameClassChoice, Cloneable {


  public Object clone() throws CloneNotSupportedException {
    MyNameClassAnyName copy = (MyNameClassAnyName)super.clone();
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass((MyExceptNameClass)except.clone());
    }
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice deepCopy() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassAnyName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
/*
  public org.iso_relax.bta.INameClassChoice convert() {
    try {
      return BinaryTreeAutomatonFactory.getFactory().createNameClassAnyName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
  */

  public org.iso_relax.miaou.bta.INameClassChoice convert() {
    org.iso_relax.miaou.bta.NameClassAnyName copy =
      BinaryTreeAutomatonFactory.getFactory().createNameClassAnyName();
      if (getExceptNameClass() != null) {
        MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
        copy.setExceptNameClass(except.convert());
      }
    return copy;
  }
}