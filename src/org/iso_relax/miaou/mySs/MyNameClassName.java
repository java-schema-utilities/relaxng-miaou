package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.NameClassName;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassName
  extends NameClassName
  implements IMyNameClassChoice, Cloneable {
    /*
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy() {
    try {
      return SimpleSyntaxFactory.getFactory().createNameClassName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassName(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    NameClassName copy = (NameClassName)super.clone();
    return copy;
  }

  public INameClassChoice deepCopy() {
    NameClassName copy = SimpleSyntaxFactory.getFactory().createNameClassName();
    copy.setNs(getNs());
    copy.setContent(getContent());
    return copy;
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    org.iso_relax.miaou.btg.NameClassName copy =
      BinaryTreeGrammarFactory.getFactory().createNameClassName();
    copy.setNs(getNs());
    copy.setContent(getContent());
    return copy;
  }
}
