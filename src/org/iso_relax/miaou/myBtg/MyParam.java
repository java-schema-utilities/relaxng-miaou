package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.Param;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyParam extends Param implements Cloneable {

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public org.iso_relax.miaou.bta.Param convert() {
    org.iso_relax.miaou.bta.Param copy = BinaryTreeAutomatonFactory.getFactory().createParam();
    copy.setName(getName());
    copy.setContent(getContent());
    return copy;
  }
}