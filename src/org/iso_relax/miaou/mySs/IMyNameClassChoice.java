package org.iso_relax.miaou.mySs;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IMyNameClassChoice extends org.iso_relax.miaou.ss.INameClassChoice {
  public Object clone() throws CloneNotSupportedException;
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy();
  public org.iso_relax.miaou.btg.INameClassChoice convert();
}