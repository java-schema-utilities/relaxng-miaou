package org.iso_relax.miaou.abstractBta;

import org.iso_relax.miaou.bta.ExceptNameClass;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public abstract class AbstractExceptNameClass extends ExceptNameClass {
  public abstract void compactPrint(PrintWriter writer);
}