package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyData extends AbstractData {
  public void compactPrint(PrintWriter writer) {
    writer.print("{\"");
    writer.print(getDatatypeLibrary());
    writer.print("\",");
    writer.print(getType());
    writer.print("}");
    if (getParamCount() != 0) {
      writer.print("{");
      for (int i = 0; i < getParamCount(); i++) {
        writer.print(getParam(i).getName());
        writer.print("=\"");
	LiteralPrinter.print(getParam(i).getContent(),writer);
        writer.print("\" ");
      }
      writer.print("}");
    }
    if (getContentCount() != 0) {
      writer.print(" - (");
      ((IDataOrValue)getContent(0)).compactPrint(writer);
      for (int i = 1; i < getContentCount(); i++) {
        writer.print(" | ");
	((IDataOrValue)getContent(i)).compactPrint(writer);
      }
      writer.print(")");
    }
  }
}