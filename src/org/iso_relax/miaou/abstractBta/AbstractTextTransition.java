package org.iso_relax.miaou.abstractBta;

import org.iso_relax.miaou.bta.TextTransition;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public abstract class AbstractTextTransition
  extends TextTransition
  implements ITransition {

  /**
   * @return a clone (an Object)
   * @throws CloneNotSupportedException
   */
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}