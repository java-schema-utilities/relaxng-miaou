package org.iso_relax.miaou.abstractBta;
import org.iso_relax.miaou.bta.INameClassChoice;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IAbstractNameClassChoice extends INameClassChoice{
  public void compactPrint(PrintWriter writer);
}