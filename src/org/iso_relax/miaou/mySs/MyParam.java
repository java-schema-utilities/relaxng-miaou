package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.Param;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyParam extends Param implements Cloneable {

  public Object clone() throws CloneNotSupportedException {
    Param copy = (Param)super.clone();
    return copy;
  }

  public Param deepCopy() {
    Param copy = SimpleSyntaxFactory.getFactory().createParam();
    copy.setName(getName());
    copy.setContent(getContent());
    return copy;
  }

  public org.iso_relax.miaou.btg.Param convert() {
    org.iso_relax.miaou.btg.Param copy = BinaryTreeGrammarFactory.getFactory().createParam();
    copy.setName(getName());
    copy.setContent(getContent());
    return copy;
  }
}