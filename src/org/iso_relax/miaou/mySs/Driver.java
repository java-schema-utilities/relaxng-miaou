package org.iso_relax.miaou.mySs;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class Driver {
  public static void main(String[] args) {
    if (args.length < 4)
      return;
    String ssName = args[0];
    String nssName = args[1];
    String btgName = args[2];
    String btaName = args[3];

    OutputFormat formatter = new OutputFormat();
    formatter.setIndenting(true);
    formatter.setIndent(2);

    XMLSerializer serializerSs = null;
    XMLSerializer serializerBtg = null;
    XMLSerializer serializerBta = null;

    try {
      serializerSs = new XMLSerializer (new java.io.FileOutputStream(nssName), formatter);
      serializerBtg = new XMLSerializer (new java.io.FileOutputStream(btgName), formatter);
      serializerBta = new XMLSerializer (new java.io.FileOutputStream(btaName), formatter);
    } catch (java.io.FileNotFoundException e) {
      e.printStackTrace();
    }

//    org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.setFactory(
//      new org.iso_relax.miaou.myBtg.MyB

    org.iso_relax.miaou.ss.SimpleSyntaxFactory.setFactory(new MyDefaultSimpleSyntaxFactory());
    org.iso_relax.miaou.btg.BinaryTreeGrammarFactory.setFactory(
        new org.iso_relax.miaou.myBtg.MyDefaultBinaryTreeGrammarFactory());
    org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory.setFactory(
        new org.iso_relax.miaou.myBta.MyDefaultBinaryTreeAutomatonFactory());


    try {
      MyRootGrammar mrg =
       (MyRootGrammar)org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory().create(ssName);

      if (mrg == null) {
        System.err.println("failed to read a schema");
        return;
      }

      new AttributeNormalizer().normalize(mrg);
      serializerSs.serialize(mrg.makeDocument());


      org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar btg =
        (org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)mrg.binarize();
      serializerBtg.serialize(btg.makeDocument());

      org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton bta =
        ((org.iso_relax.miaou.myBtg.MyBinaryTreeGrammar)btg).automatize();
      serializerBta.serialize(bta.makeDocument());

    } catch (java.io.IOException ioe) {
      System.err.println("IOException");
    } catch (org.xml.sax.SAXException se) {
      System.err.println("SAXException");
    } catch (javax.xml.parsers.ParserConfigurationException pce) {
      System.err.println("ParserConfigurationException");
    }

  }
}