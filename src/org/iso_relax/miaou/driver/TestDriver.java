package org.iso_relax.miaou.driver;
import org.iso_relax.miaou.btg.*;
import org.iso_relax.miaou.bta.*;
import org.iso_relax.miaou.mySs.*;
import org.iso_relax.miaou.myBta.*;
import org.iso_relax.miaou.myBtg.*;
import org.iso_relax.miaou.test.*;
import org.iso_relax.miaou.houseKeeping.SymbolTables;
import org.xml.sax.InputSource;
import com.thaiopensource.relaxng.util.ErrorHandlerImpl;
import org.kohsuke.rng2srng.Translator;
import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.net.URL;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class TestDriver {

  org.iso_relax.miaou.mySs.MyRootGrammar mrg;
  org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar btg;
  SymbolTables symbolTables;
  String rncName;
  String rngName;
  String ssName;
  String nssName;
  String btgName;
  String btaName;
  String cbtaName;

  public static void main(String[] args) throws FileNotFoundException {

    if (args.length == 0) {
      System.err.println("specify the list of test data");
      return;
    }

    org.iso_relax.miaou.ss.SimpleSyntaxFactory.setFactory(
      new MyDefaultSimpleSyntaxFactory());

    org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.setFactory(
        new org.iso_relax.miaou.myBtg.MyDefaultBinaryTreeGrammarFactory());

    org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory.setFactory(
        new org.iso_relax.miaou.myBta.MyDefaultBinaryTreeAutomatonFactory());


    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
      try {
        RootTestData rtd = new RootTestData(args[i]);

        TestDriver testDriver = new TestDriver();
        testDriver.test(rtd);

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  private void test (RootTestData rtd) throws Exception {
    for (int i = 0; i < rtd.getRootTestDataCaseCount(); i++)
      try {
        test(rtd.getRootTestDataCase(i));
      } catch (Exception e) {
        e.printStackTrace();
      }
  }

  private void test (RootTestDataCase testCase) throws Exception {

    rncName = testCase.getRnc();
    rngName = testCase.getRng();
    ssName  = testCase.getSs();
    nssName = testCase.getNss();
    btgName = testCase.getBtg();
    btaName = testCase.getBta();
    cbtaName = testCase.getCbta();

    if (rncName != null) {
      System.out.println(rncName);
      readRnc();
      convertFromSs2Nss();
      convertFromNss2Btg();
      convertFromBtg2Bta();
    }
    else if (rngName != null) {
      System.out.println(rngName);
      readRng();
      convertFromSs2Nss();
      convertFromNss2Btg();
      convertFromBtg2Bta();
    }
    else if (ssName != null) {
      System.out.println(ssName);
      readSs();
      convertFromSs2Nss();
      convertFromNss2Btg();
      convertFromBtg2Bta();
    }
    else if (btgName != null) {
      System.out.println(btgName);
      readBtg();
      convertFromBtg2Bta();
    }
  }

  private void readRnc () throws Exception {
    URL grammar = new File(rncName).toURL();
    Node docNode = Translator.translateCompactToDOM(
		        new InputSource(grammar.toExternalForm()),
		        new ErrorHandlerImpl());
    convertRngDOM2SS(docNode);
  }

  private void readRng () throws Exception {
    URL grammar = new File(rngName).toURL();
    Node docNode = Translator.translateXMLToDOM(
		        new InputSource(grammar.toExternalForm()),
		        new ErrorHandlerImpl());
    convertRngDOM2SS(docNode);
  }

  private void convertRngDOM2SS (Node docNode)  throws Exception {
    Document doc = (Document)docNode;
    mrg =
       (MyRootGrammar)org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory().create(doc.getDocumentElement());
    if (mrg == null) {
      System.err.println("failed to read a schema");
      throw new Exception();
    }
    if (ssName != null)
      Printer.singleInstance().print(mrg, new java.io.FileOutputStream(ssName));
  }

  private void readSs () throws Exception {
    mrg =
       (MyRootGrammar)org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory().create(ssName);

    if (mrg == null) {
      System.err.println("failed to read a schema");
      throw new Exception();
    }
  }

  private void readBtg()  throws Exception {
    org.iso_relax.miaou.btg.IBinaryTreeGrammarFactory factory =
        org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.getFactory();
    btg =
       (org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)factory.create(btgName);
    if (btg == null) {
      System.err.println("failed to read a schema");
      throw new Exception();
    }
  }


  private void convertFromSs2Nss() throws Exception {

    symbolTables = new SymbolTables ();
    org.iso_relax.miaou.ss.URVisitor.traverse(mrg, symbolTables);

    AttributeNormalizer attributeNormalizer = new AttributeNormalizer(symbolTables);
    attributeNormalizer.normalize(mrg);
    InterleaveNormalizer interleaveNormalizer = new InterleaveNormalizer();
    interleaveNormalizer.simplify(mrg);
    GroupNormalizer groupNormalizer = new GroupNormalizer();
    groupNormalizer.simplify(mrg);
    if (nssName != null)
      Printer.singleInstance().print(mrg, new java.io.FileOutputStream(nssName));
  }

  private void convertFromNss2Btg() throws FileNotFoundException {

    btg = (org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)mrg.binarize();

    if (btgName != null)
      Printer.singleInstance().print(btg, new java.io.FileOutputStream(btgName));
  }

  private void convertFromBtg2Bta() throws FileNotFoundException {

    org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton bta =
      (org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton)btg.automatize();

    if (btaName != null)
      Printer.singleInstance().print(bta, new java.io.FileOutputStream(btaName));
    if (cbtaName != null)
      Printer.singleInstance().printTable(bta, symbolTables, new java.io.FileOutputStream(cbtaName));
  }
}
