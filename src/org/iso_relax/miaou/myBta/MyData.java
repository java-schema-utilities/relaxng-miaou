package org.iso_relax.miaou.myBta;

import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.*;
import java.io.DataOutputStream;
import java.io.IOException;

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

  public void binPrint(DataOutputStream dos) throws IOException {
    dos.writeShort(getDatatypeLibrary());
    dos.writeUTF(getType());
//  we also have to support parameters and exceptions (data and value).
//  Well, this is still a research prototype.
  }
}