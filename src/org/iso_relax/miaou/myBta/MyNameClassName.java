package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassName extends AbstractNameClassName {

  public void compactPrint(PrintWriter writer) {
    writer.print("{\"");
    writer.print(getNs());
    writer.print("\", ");
    writer.print(getContent());
    writer.print("}");
  }
}