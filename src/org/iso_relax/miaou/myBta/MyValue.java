package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyValue extends AbstractValue {
  public void compactPrint(PrintWriter writer) {
    writer.print("{\"");
    writer.print(getDatatypeLibrary());
    writer.print("\",");
    writer.print(getType());
    writer.print("}\"");
    LiteralPrinter.print(getContent(),writer);
    writer.print("\"");
//    this.getNs();
//    we also have to print the namespace map, but rng2srng does not support
//    namespace maps yet.
  }
}