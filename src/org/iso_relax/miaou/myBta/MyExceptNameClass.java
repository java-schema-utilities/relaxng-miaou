package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import java.io.PrintWriter;


/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyExceptNameClass extends AbstractExceptNameClass {
  public void compactPrint(PrintWriter writer) {
    ((IAbstractNameClassChoice)getNameClass()).compactPrint(writer);
  }
}