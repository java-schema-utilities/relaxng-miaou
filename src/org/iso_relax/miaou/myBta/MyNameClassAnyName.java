package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.AbstractNameClassAnyName;
import org.iso_relax.miaou.abstractBta.IAbstractNameClassChoice;
import org.iso_relax.miaou.abstractBta.AbstractExceptNameClass;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassAnyName extends AbstractNameClassAnyName {

  public void compactPrint(PrintWriter writer) {
    if (getExceptNameClass() != null) {
      writer.print("({*, *} - (");
      ((AbstractExceptNameClass)getExceptNameClass()).compactPrint(writer);
      writer.print("))");
    }
    else
      writer.print("{*, *}");
  }
}