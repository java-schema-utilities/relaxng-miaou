package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.NameClassAnyName;
import org.iso_relax.miaou.ss.ExceptNameClass;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;

import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassAnyName
  extends NameClassAnyName
  implements IMyNameClassChoice, Cloneable {

    /*
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy() {
    try {
      return SimpleSyntaxFactory.getFactory().createNameClassAnyName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassAnyName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    */
  public Object clone() throws CloneNotSupportedException {
    NameClassAnyName copy = (NameClassAnyName)super.clone();
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass((ExceptNameClass)except.clone());
    }
    return copy;
  }

  public INameClassChoice deepCopy() {
    NameClassAnyName copy = SimpleSyntaxFactory.getFactory().createNameClassAnyName();
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass(except.deepCopy());
    }
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    org.iso_relax.miaou.btg.NameClassAnyName copy =
      BinaryTreeGrammarFactory.getFactory().createNameClassAnyName();
      if (getExceptNameClass() != null) {
        MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
        copy.setExceptNameClass(except.convert());
      }
    return copy;
  }
}
