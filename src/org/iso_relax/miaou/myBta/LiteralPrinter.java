package org.iso_relax.miaou.myBta;
import java.io.PrintWriter;

/**
 * This class provides backslash escaping of " and \.
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class LiteralPrinter {

  public static void print(String str, PrintWriter writer) {
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      switch (ch) {
	case '\\': writer.print("\\\\"); break;
	case '"': writer.print("\\\""); break;
	default: writer.print(ch); break;
      }
    }
  }
}