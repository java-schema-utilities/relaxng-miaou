package org.iso_relax.miaou.driver;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
    URL grammar = null;
    Node docNode;

    org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton bta;

    org.iso_relax.miaou.ss.SimpleSyntaxFactory.setFactory(
      new MyDefaultSimpleSyntaxFactory());

    org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.setFactory(
        new org.iso_relax.miaou.myBtg.MyDefaultBinaryTreeGrammarFactory());

    org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory.setFactory(
        new org.iso_relax.miaou.myBta.MyDefaultBinaryTreeAutomatonFactory());


    if ((args.length == 3) && args[0].equals("-c")) {
      schemaName = args[1];
      tableName = args[2];
      compact = true;
    }
    else if (args.length == 2) {
      schemaName = args[0];
      tableName = args[1];
      compact = false;
    }
    else {
      printUsage();
      System.exit(-1);
    }

    checkSchema(schemaName);
    checkTable(tableName);
    grammar = new File(schemaName).toURL();
    if (compact)
      docNode = Translator.translateCompactToDOM(
		        new InputSource(grammar.toExternalForm()),
		        new ErrorHandlerImpl());
    else
      docNode = Translator.translateXMLToDOM(
			new InputSource(grammar.toExternalForm()),
			new ErrorHandlerImpl());

    if (docNode == null) System.exit(-1);
    //Printer.singleInstance().print((Document)docNode, new java.io.FileOutputStream("debug"));

    bta = automatize(docNode);
    Printer.singleInstance().printTable(bta, new java.io.FileOutputStream(tableName));
  }

  private static AbstractBinaryTreeAutomaton automatize(Node docNode)
    throws Exception {

    Document doc = (Document)docNode;

    org.iso_relax.miaou.mySs.MyRootGrammar mrg =
       (MyRootGrammar)org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory().create(doc.getDocumentElement());

    AttributeNormalizer attributeNormalizer = new AttributeNormalizer();
    attributeNormalizer.normalize(mrg);

    InterleaveNormalizer interleaveNormalizer = new InterleaveNormalizer();
    interleaveNormalizer.simplify(mrg);

    GroupNormalizer groupNormalizer = new GroupNormalizer();
    groupNormalizer.simplify(mrg);

    MyBinaryTreeGrammar btg =
      (org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)mrg.binarize();

    AbstractBinaryTreeAutomaton bta =
      (org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton)btg.automatize();

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