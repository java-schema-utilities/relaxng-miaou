package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.Value;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory;
import org.iso_relax.miaou.bta.IBinaryTreeAutomatonFactory;
import org.iso_relax.miaou.myBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyValue extends Value implements IMyDataChoice, Cloneable  {

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public org.iso_relax.miaou.bta.IAtomicTransitionChoice convert() {
    IBinaryTreeAutomatonFactory factory =
      BinaryTreeAutomatonFactory.getFactory();
    org.iso_relax.miaou.bta.Value copy = factory.createValue();
    copy.setContent(getContent());
    copy.setDatatypeLibrary(getDatatypeLibrary());
    copy.setNs(getNs());
    copy.setType(getType());
    return copy;
  }
}