package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassChoice extends AbstractNameClassChoice {

  public void compactPrint(PrintWriter writer) {
    ((IAbstractNameClassChoice)getNameClass1()).compactPrint(writer);
    writer.print(" | ");
    ((IAbstractNameClassChoice)getNameClass2()).compactPrint(writer);
  }
}