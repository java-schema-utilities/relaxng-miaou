package org.iso_relax.miaou.driver;

import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.btg.BinaryTreeGrammar;
import org.iso_relax.miaou.bta.BinaryTreeAutomaton;
import org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton;
import org.iso_relax.miaou.houseKeeping.SymbolTables;
import java.io.OutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class Printer {

  static Printer printer ;

  private Printer() {
  }

  static public Printer singleInstance() {
    if (printer == null)
      printer = new Printer();
    return printer;
  }

  public static void printTable(
    AbstractBinaryTreeAutomaton bta,
    SymbolTables symbolTables,
    OutputStream os) {

    try {
      PrintWriter writer = new PrintWriter (new OutputStreamWriter(os, "UTF-8"));
      symbolTables.print(writer);
      bta.compactPrint(writer);
      writer.close();
      os.close();
    }
    catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }

  public void print(BinaryTreeGrammar btg, OutputStream os) {
    try {
      print(btg.makeDocument(), os);
    } catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      System.exit(-1);
    }
  }

  public void print(BinaryTreeAutomaton bta, OutputStream os) {
    try {
      print(bta.makeDocument(), os);
    } catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      System.exit(-1);
    }
  }

  public void print(RootGrammar grammar, OutputStream os) {
    try {
      print(grammar.makeDocument(), os);
    } catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      System.exit(-1);
    }
  }

  public void print(org.w3c.dom.Document doc, OutputStream os) {

    OutputFormat formatter = new OutputFormat();
    formatter.setIndenting(true);
    formatter.setIndent(2);

    XMLSerializer serializer = null;
    try {

      serializer =
        new XMLSerializer (os, formatter);

      serializer.serialize(doc);

    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }
}