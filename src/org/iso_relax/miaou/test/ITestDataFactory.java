package org.iso_relax.miaou.test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * ITestDataFactory is generated by Relaxer based on testData.rng.
 *
 * @version testData.rng 1.0 (Sat Sep 07 22:04:57 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface ITestDataFactory {
    /**
     * Sets a error handler to handle parsing error.
     *
     * @param handler
     */
    void setErrorHandler(org.xml.sax.ErrorHandler handler);

    /**
     * Creates a <code>Object</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Document <code>dom</code>.
     *
     * @param doc
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(Document doc) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Document <code>doc</code>.
     *
     * @param doc
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(Document doc) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Element <code>element</code>.
     *
     * @param element
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode create(Element element) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>Object</code> by the Element <code>element</code>.
     *
     * @param element
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return IRNode
     */
    IRNode createWithContext(Element element) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(File file) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(String uri) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(URL url) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(InputStream in) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(InputSource is) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestData(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestDataCase</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(Reader reader) throws IOException, SAXException, ParserConfigurationException;

    /**
     * Creates a <code>RootTestData</code>.
     *
     * @return RootTestData
     */
    RootTestData createRootTestData();

    /**
     * Creates a <code>RootTestDataCase</code>.
     *
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase();

    /**
     * Creates a <code>RootTestData</code>.
     *
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext();

    /**
     * Creates a <code>RootTestDataCase</code>.
     *
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext();

    /**
     * Creates a <code>RootTestData</code> by the Document <code>doc</code>.
     *
     * @param doc
     * @return RootTestData
     */
    RootTestData createRootTestData(Document doc);

    /**
     * Creates a <code>RootTestDataCase</code> by the Document <code>doc</code>.
     *
     * @param doc
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(Document doc);

    /**
     * Creates a <code>RootTestData</code> by the Document <code>doc</code>.
     *
     * @param doc
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(Document doc);

    /**
     * Creates a <code>RootTestDataCase</code> by the Document <code>doc</code>.
     *
     * @param doc
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(Document doc);

    /**
     * Creates a <code>RootTestData</code> by the Element <code>element</code>.
     *
     * @param element
     * @return RootTestData
     */
    RootTestData createRootTestData(Element element);

    /**
     * Creates a <code>RootTestDataCase</code> by the Element <code>element</code>.
     *
     * @param element
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(Element element);

    /**
     * Creates a <code>RootTestData</code> by the Element <code>element</code>.
     *
     * @param element
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(Element element);

    /**
     * Creates a <code>RootTestDataCase</code> by the Element <code>element</code>.
     *
     * @param element
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(Element element);

    /**
     * Creates a <code>RootTestData</code> by the Stack <code>stack</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return RootTestData
     */
    RootTestData createRootTestData(RStack stack);

    /**
     * Creates a <code>RootTestDataCase</code> by the Stack <code>stack</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCase(RStack stack);

    /**
     * Creates a <code>RootTestData</code> by the Stack <code>stack</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return RootTestData
     */
    RootTestData createRootTestDataWithContext(RStack stack);

    /**
     * Creates a <code>RootTestDataCase</code> by the Stack <code>stack</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return RootTestDataCase
     */
    RootTestDataCase createRootTestDataCaseWithContext(RStack stack);

    /**
     * Creates a <code>RContext</code>.
     *
     * @return RContext
     */
    RContext createRContext();
}
