package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassNsName extends AbstractNameClassNsName {

  public void compactPrint(PrintWriter writer) {
    if (getExceptNameClass() != null) {
      writer.print("({");
      writer.print(getNs());
      writer.print(", *} - (");
      ((IAbstractNameClassChoice)getExceptNameClass()).compactPrint(writer);
      writer.print("))");
    }
    else  {
      writer.print("{");
      writer.print(getNs());
      writer.print(", *}");
    }
  }
}