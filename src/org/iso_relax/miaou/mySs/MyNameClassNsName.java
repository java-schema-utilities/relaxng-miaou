package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.NameClassNsName;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassNsName
  extends NameClassNsName
  implements IMyNameClassChoice, Cloneable {
    /*
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy() {
    try {
      return SimpleSyntaxFactory.getFactory().createNameClassNsName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassNsName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    NameClassNsName copy = (NameClassNsName)super.clone();
    return copy;
  }

  public INameClassChoice deepCopy() {
    NameClassNsName copy = SimpleSyntaxFactory.getFactory().createNameClassNsName();
    copy.setNs(getNs());
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass(except.deepCopy());
    }
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    org.iso_relax.miaou.btg.NameClassNsName copy =
      BinaryTreeGrammarFactory.getFactory().createNameClassNsName();
    copy.setNs(getNs());
    if (getExceptNameClass() != null) {
      MyExceptNameClass except = (MyExceptNameClass)getExceptNameClass();
      copy.setExceptNameClass(except.convert());
    }
    return copy;
  }
}
