package org.iso_relax.miaou.mySs;
import org.iso_relax.miaou.houseKeeping.SymbolTables;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.4
 *
 */

public interface IMyNameClassChoice extends org.iso_relax.miaou.ss.INameClassChoice {
  public Object clone() throws CloneNotSupportedException;
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy();
  public int getID(SymbolTables symbolTables);
}