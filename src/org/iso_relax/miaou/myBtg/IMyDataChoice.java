package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.IDataChoice;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IMyDataChoice extends IDataChoice {
  public org.iso_relax.miaou.bta.IAtomicTransitionChoice convert();
  public Object clone() throws CloneNotSupportedException;
}