package org.iso_relax.miaou.driver;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.iso_relax.miaou.mySs.AttributeNormalizer;
import org.iso_relax.miaou.mySs.InterleaveNormalizer;
import org.iso_relax.miaou.mySs.GroupNormalizer;
import org.iso_relax.miaou.mySs.MyRootGrammar;
import org.iso_relax.miaou.mySs.MyDefaultSimpleSyntaxFactory;
import org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar;
import org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton;
import org.iso_relax.miaou.houseKeeping.SymbolTables;
import org.xml.sax.InputSource;
import com.thaiopensource.relaxng.util.ErrorHandlerImpl;
import org.kohsuke.rng2srng.Translator;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class Driver {
  public static void main(String[] args) throws Exception {

    String schemaName = "";
    String tableName = "";
    boolean compact = false;
    boolean binary = true;
    URL grammar = null;
    Node docNode;

    org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton bta;

    org.iso_relax.miaou.ss.SimpleSyntaxFactory.setFactory(
      new MyDefaultSimpleSyntaxFactory());

    org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.setFactory(
        new org.iso_relax.miaou.myBtg.MyDefaultBinaryTreeGrammarFactory());

    org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory.setFactory(
        new org.iso_relax.miaou.myBta.MyDefaultBinaryTreeAutomatonFactory());

    switch (args.length) {
      case 2:
        schemaName = args[0];
        tableName = args[1];
        compact = false;
      break;
      case 3:
        if (args[0].equals("-c")) {
          schemaName = args[1];
          tableName = args[2];
          compact = true;
        }
        else if (args[0].equals("-a")) {
          schemaName = args[1];
          tableName = args[2];
          compact = false;
	  binary = false;
        }
	else  {
          printUsage();
          System.exit(-1);
        }
      break;
      case 4:
        if (args[0].equals("-a") && args[1].equals("-c")) {
          schemaName = args[2];
          tableName = args[3];
          compact = true;
	  binary = false;
        }
      default:
        printUsage();
        System.exit(-1);
    }

    checkSchema(schemaName);
    checkTable(tableName);
    grammar = new File(schemaName).toURL();
    System.err.print("Rng2srng...");
    if (compact)
      docNode = Translator.translateCompactToDOM(
		        new InputSource(grammar.toExternalForm()),
		        new ErrorHandlerImpl());
    else
      docNode = Translator.translateXMLToDOM(
			new InputSource(grammar.toExternalForm()),
			new ErrorHandlerImpl());
    System.err.println("Done");

    if (docNode == null) System.exit(-1);
    //Printer.singleInstance().print((Document)docNode, new java.io.FileOutputStream("debug"));

    SymbolTables symbolTables = new SymbolTables ();
    bta = automatize(docNode, symbolTables);

    System.err.print("Now printing...");
    try {
      if (binary) {
        org.iso_relax.miaou.houseKeeping.BinaryPrinter.write(bta, symbolTables,
          new DataOutputStream(new FileOutputStream (tableName)));
      }
      else {
	Printer.singleInstance().printTable(bta, symbolTables, new java.io.FileOutputStream(tableName));
      }
      System.err.print("Done");
    }
    catch (IOException ioe) {
      ioe.printStackTrace(System.err);
    }
  }

  private static AbstractBinaryTreeAutomaton automatize(
    Node docNode,
    SymbolTables symbolTables) throws Exception {

    Document doc = (Document)docNode;


    System.err.print("Relaxer...");
    org.iso_relax.miaou.mySs.MyRootGrammar mrg =
       (MyRootGrammar)org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory().create(doc.getDocumentElement());
    System.err.println("Done");

    System.err.print("Scanning for creating symbol table ...");
    org.iso_relax.miaou.ss.URVisitor.traverse(mrg, symbolTables);
    System.err.println("done");

    System.err.print("Normalization...");
    AttributeNormalizer attributeNormalizer = new AttributeNormalizer(symbolTables);
    attributeNormalizer.normalize(mrg);
    System.err.println("done");

    System.err.print("Interleave simplification ...");
    InterleaveNormalizer interleaveNormalizer = new InterleaveNormalizer();
    interleaveNormalizer.simplify(mrg);
    System.err.println("done");

    System.err.print("Group normalization ...");
    GroupNormalizer groupNormalizer = new GroupNormalizer();
    groupNormalizer.simplify(mrg);
    System.err.println("done");

    System.err.print("Binarization ...");
    MyBinaryTreeGrammar btg =
      (org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)mrg.binarize();
    System.err.println("done");

    System.err.print("Automatizaion ...");
    AbstractBinaryTreeAutomaton bta =
      (org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton)btg.automatize();
    System.err.println("done");

    return bta;
  }

  private static void checkSchema(String schemaName) {
    File schema = new File(schemaName);
    if (!schema.canRead()) {
      System.err.println("cannot read a schema");
      System.exit(-1);
    }
  }

  private static void checkTable(String tableName) {
    File table = new File(tableName);
    if (table.exists() && !table.canWrite()) {
      System.err.println("cannot write a table");
      System.exit(-1);
    }
  }


  private static void printUsage() {
     System.err.println(
            "Options: [-c] <grammar file>  <table file>\n"+
            "  translates RELAX NG into a binary tree automaton\n"+
            "\n"+
            "  -c : use the compact syntax as the input");
        System.exit(-1);
    }

}