package org.iso_relax.miaou.bta;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>IDataChoice</b> is generated from binaryTreeAutomaton.rngby Relaxer.
 *
 * @version binaryTreeAutomaton.rng (Sat Oct 19 02:26:41 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IDataChoice extends IRVisitable, IRNode {
    /**
     * Creates a DOM representation of the object.
     * Result is appended to the Node <code>parent</code>.
     *
     * @param parent
     */
    void makeElement(Node parent);

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    void makeTextElement(StringBuffer buffer);

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    void makeTextElement(PrintWriter buffer);

    /**
     * @param doc
     */
    void setup(Document doc);

    /**
     * @param element
     */
    void setup(Element element);

    /**
     * @param stack
     */
    void setup(RStack stack);

    /**
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    void setup(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * @exception ParserConfigurationException
     * @return Document
     */
    Document makeDocument() throws ParserConfigurationException;

    /**
     * @return RNSContext
     */
    RNSContext getRNSContext();

    /**
     * @param rNSContext
     */
    void setRNSContext(RNSContext rNSContext);

    /**
     * @return String
     */
    String getType();

    /**
     * @param type
     */
    void setType(String type);

    /**
     * @return int
     */
    int getDatatypeLibrary();

    /**
     * @param datatypeLibrary
     */
    void setDatatypeLibrary(int datatypeLibrary);

    /**
     * @return String
     */
    String makeTextDocument();

    /**
     * @return String
     */
    String getTypeAsString();

    /**
     * @return String
     */
    String getDatatypeLibraryAsString();

    /**
     * @param string
     */
    void setTypeByString(String string);

    /**
     * @param string
     */
    void setDatatypeLibraryByString(String string);

    /**
     * @return String
     */
    String toString();
}
