package org.iso_relax.miaou.myBtg;
import org.iso_relax.miaou.btg.INameClassChoice;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IMyNameClassChoice extends INameClassChoice {
  public Object clone() throws CloneNotSupportedException;
  public INameClassChoice deepCopy();
  public org.iso_relax.miaou.bta.INameClassChoice convert();
}
