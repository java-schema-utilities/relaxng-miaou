package org.iso_relax.miaou.test;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;

/**
 * UJAXP
 *
 * @since   Feb. 20, 2000
 * @version Jul. 14, 2002
 * @author  ASAMI, Tomoharu (asami@relaxer.org)
 */
public final class UJAXP {
    public final static int FLAG_NONE = 0x00;
    public final static int FLAG_VALIDATION = 0x01;
    public final static int FLAG_NAMESPACE_AWARE = 0x02;
    public final static int FLAG_WHITESPACE = 0x04;
    public final static int FLAG_EXPAND_ENTITY_REF = 0x08;
    public final static int FLAG_IGNORE_COMMENTS = 0x10;
    public final static int FLAG_COALESCING = 0x20;

    private static ErrorHandler errorHandler;
    private static EntityResolver entityResolver;
    private static Map entityMap;

    public static Document getDocument(File file, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(file.toURL(), flags));
    }

    public static Document getDocument(String uri, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(uri, flags, getErrorHandler()));
    }

    public static Document getDocument(URL url, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(url, flags, getErrorHandler()));
    }

    public static Document getDocument(InputStream in, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(in, flags, getErrorHandler()));
    }

    public static Document getDocument(InputSource is, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(is, flags, getErrorHandler()));
    }

    public static Document getDocument(Reader reader, int flags)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(reader, flags, getErrorHandler()));
    }

    public static Document getDocument(
	File file,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	return (getDocument(file.toURL(), flags, handler));
    }

    public static Document getDocument(
	String uri,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
	_setup(factory, flags);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(adjustURI(uri));
        return (doc);
    }

    public static Document getDocument(
	URL url,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
	_setup(factory, flags);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(url.toString());
        return (doc);
    }

    public static Document getDocument(
	InputStream in,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
	_setup(factory, flags);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(in);
        return (doc);
    }

    public static Document getDocument(
	InputSource is,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
	_setup(factory, flags);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(is);
        return (doc);
    }

    public static Document getDocument(
	Reader reader,
	int flags,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
	_setup(factory, flags);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(new InputSource(reader));
        return (doc);
    }

    private static void _setup(DocumentBuilderFactory factory, int flags) {
	if ((flags & FLAG_VALIDATION) != 0) {
	    factory.setValidating(true);
	}
	if ((flags & FLAG_NAMESPACE_AWARE) != 0) {
	    factory.setNamespaceAware(true);
	}
    }

    //
    public static Document getDocument(File file)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(file.toURL()));
    }

    public static Document getDocument(String uri)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(uri, getErrorHandler()));
    }

    public static Document getDocument(URL url)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(url, getErrorHandler()));
    }

    public static Document getDocument(InputStream in)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(in, getErrorHandler()));
    }

    public static Document getDocument(InputSource is)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(is, getErrorHandler()));
    }

    public static Document getDocument(Reader reader)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(reader, getErrorHandler()));
    }

    public static Document getDocument(File file, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	return (getDocument(file.toURL(), handler));
    }

    public static Document getDocument(String uri, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(adjustURI(uri));
        return (doc);
    }

    public static Document getDocument(URL url, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(url.toString());
        return (doc);
    }

    public static Document getDocument(InputStream in, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(in);
        return (doc);
    }

    public static Document getDocument(InputSource is, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(is);
        return (doc);
    }

    public static Document getDocument(Reader reader, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(new InputSource(reader));
        return (doc);
    }

    public static Document getValidDocument(File file)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(file.toURL()));
    }

    public static Document getValidDocument(String uri)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(uri, getErrorHandler()));
    }

    public static Document getValidDocument(URL url)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(url, getErrorHandler()));
    }

    public static Document getValidDocument(InputStream in)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(in, getErrorHandler()));
    }

    public static Document getValidDocument(InputSource is)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(is, getErrorHandler()));
    }

    public static Document getValidDocument(Reader reader)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(reader, getErrorHandler()));
    }

    public static Document getValidDocument(File file, ErrorHandler handler)
	throws IOException, SAXException, ParserConfigurationException {

	return (getValidDocument(file.toURL(), handler));
    }

    public static Document getValidDocument(
	String uri,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(adjustURI(uri));
        return (doc);
    }

    public static Document getValidDocument(
	URL url,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(url.toString());
        return (doc);
    }

    public static Document getValidDocument(
	InputStream in,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(in);
        return (doc);
    }

    public static Document getValidDocument(
	InputSource is,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(is);
        return (doc);
    }

    public static Document getValidDocument(
	Reader reader,
	ErrorHandler handler
    ) throws IOException, SAXException, ParserConfigurationException {
	if (handler == null) {
	    handler = getErrorHandler();
	}
        DocumentBuilderFactory factory
            = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
        Document doc = builder.parse(new InputSource(reader));
        return (doc);
    }

    public static Document makeDocument()
	throws ParserConfigurationException {

	return (makeDocument(getErrorHandler()));
    }

    public static Document makeDocument(ErrorHandler handler)
	throws ParserConfigurationException {

	DocumentBuilderFactory factory
	    = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	builder.setErrorHandler(handler);
	builder.setEntityResolver(getEntityResolver());
	Document doc = builder.newDocument();
	return (doc);
    }

    public static ErrorHandler getErrorHandler() {
	if (errorHandler == null) {
	    errorHandler = new DefaultErrorHandler();
	}
	return (errorHandler);
    }

    public static EntityResolver getEntityResolver() {
	if (entityResolver == null) {
	    entityResolver = new DefaultEntityResolver();
	}
	return (entityResolver);
    }

    static class DefaultErrorHandler implements ErrorHandler {
	public void error(SAXParseException e) {
	    System.err.print("error : ");
	    System.err.println(e.getMessage());
	}

	public void fatalError(SAXParseException e) {
	    System.err.print("fatal error : ");
	    System.err.println(e.getMessage());
	}

	public void warning(SAXParseException e) {
	    System.err.print("warning : ");
	    System.err.println(e.getMessage());
	}
    }

    static class DefaultEntityResolver implements EntityResolver {
	public InputSource resolveEntity(
	    String publicId,
	    String systemId
	) {
	    if (!systemId.endsWith(".dtd")) {
		URL url = getEntityResource(systemId);
		if (url != null) {
		    return (new InputSource(url.toExternalForm()));
		} else {
		    return (null);
		}
	    }
	    if (canAccess(systemId)) {
		return (new InputSource(systemId));
	    } else {
		URL url = getEntityResource(systemId);
		if (url != null) {
		    return (new InputSource(url.toExternalForm()));
		} else {
		    StringReader reader = new StringReader("");
		    return (new InputSource(reader));
		}
	    }
	}
    }

    static String adjustURI(String uri) {
	try {
	    URL url = makeURL(uri);
	    return (url.toExternalForm());
	} catch (MalformedURLException e) {
	    return (uri);
	}
    }

    static URL makeURL(String uri) throws MalformedURLException {
	try {
	    return (new URL(uri));
	} catch (MalformedURLException e) {
	    return (new File(uri).toURL());
	}
    }

    static boolean canAccess(String uri) {
	try {
	    URL url = makeURL(uri);
	    if ("file".equals(url.getProtocol())) {
		String fileName = url.getFile();
		return (new File(fileName).exists());
	    }
	    return (false);	// skip http uri
	} catch (IOException e) {
	    return (false);
	}
    }

    public static void setErrorHandler(ErrorHandler handler) {
	errorHandler = handler;
    }

    public static void setEntityResolver(EntityResolver resolver) {
	entityResolver = resolver;
    }

    public static void setEntityResource(String systemId, URL resource) {
	if (entityMap == null) {
	    entityMap = new HashMap();
	}
	entityMap.put(systemId, resource);
    }

    public static URL getEntityResource(String systemId) {
	if (entityMap == null) {
	    return (null);
	} else {
	    return ((URL)entityMap.get(systemId));
	}
    }

    //
    public static boolean isMatchDataComplex(
	Element element,
	String typeExpr
    ) {
	String data = URelaxer.getElementPropertyAsValue(element, "string");
	return (URelaxer.isMatchDataComplex(data, typeExpr));
    }

    public static boolean isMatchDataComplexAttr(
	Element element,
	String attrName,
	String typeExpr
    ) {
	String data = URelaxer.getAttributePropertyAsValue(
	    element,
	    attrName,
	    "string"
	);
	if (data == null) {
	    return (false);
	}
	return (isMatchDataComplex(data, typeExpr));
    }

    public static boolean isMatchDataComplex(String data, String typeExpr) {
	try {
	    Document doc = getDocument(new java.io.StringReader(typeExpr));
	    return (_isMatchData(data, doc.getDocumentElement()));
	} catch (Exception e) {
	    throw (new InternalError());
	}
    }

    private static boolean _isMatchData(String data, Element expr) {
	String tagName = expr.getTagName();
	if ("value".equals(tagName)) {
	    return (_isMatchDataValue(data, expr));
	} else if ("data".equals(tagName)) {
	    return (_isMatchDataData(data, expr));
	} else if ("choice".equals(tagName)) {
	    return (_isMatchDataChoice(data, expr));
	} else if ("list".equals(tagName)) {
	    return (_isMatchDataList(data, expr));
	} else if ("optional".equals(tagName)) {
	    return (_isMatchDataOptional(data, expr));
	} else if ("oneOrMore".equals(tagName)) {
	    return (_isMatchDataOneOrMore(data, expr));
	} else if ("zeroOrMore".equals(tagName)) {
	    return (_isMatchDataZeroOrMore(data, expr));
	} else {
	    throw (new InternalError());
	}
    }

    private static boolean _isMatchDataValue(String data, Element value) {
	String typeName = value.getAttribute("type");
	String text = URelaxer.getElementPropertyAsString(value);
	if ("string".equals(typeName)) {
	    return (data.equals(text));
	} else {
	    return (data.equals(text.trim()));
	}
    }

    private static boolean _isMatchDataData(String data, Element dataInfo) {
	String typeName = dataInfo.getAttribute("type");
	// XXX
	return (true);
    }

    private static boolean _isMatchDataChoice(String data, Element choice) {
	Element[] children = URelaxer.getElements(choice);
	for (int i = 0;i < children.length;i++) {
	    Element child = children[i];
	    if (_isMatchData(data, child)) {
		return (true);
	    }
	}
	return (false);
    }

    private static boolean _isMatchDataList(String data, Element listInfo) {
	Element[] children = URelaxer.getElements(listInfo);
	String[] texts = URelaxer.getStringList(data);
	List list = new ArrayList();
	list.addAll(Arrays.asList(texts));
	for (int i = 0;i < children.length;i++) {
	    Element child = children[i];
	    String tagName = child.getTagName();
	    if ("value".equals(tagName)) {
		if (list.size() == 0) {
		    return (false);
		}
		String text = (String)list.get(0);
		if (!_isMatchDataValue(text, child)) {
		    return (false);
		}
		list.remove(0);
	    } else if ("data".equals(tagName)) {
		if (list.size() == 0) {
		    return (false);
		}
		String text = (String)list.get(0);
		if (!_isMatchDataData(text, child)) {
		    return (false);
		}
		list.remove(0);
	    } else if ("choice".equals(tagName)) {
		if (list.size() == 0) {
		    return (false);
		}
		String text = (String)list.get(0);
		if (!_isMatchDataChoice(text, child)) {
		    return (false);
		}
		list.remove(0);
	    } else if ("list".equals(tagName)) {
		return (_isMatchDataList(data, child));
	    } else if ("optional".equals(tagName)) {
		if (list.size() > 0) {
		    String text = (String)list.get(0);
		    if (_isMatchDataOptional(text, child)) {
			list.remove(0);
		    }
		}
	    } else if ("oneOrMore".equals(tagName)) {
		throw (new UnsupportedOperationException());
	    } else if ("zeroOrMore".equals(tagName)) {
		throw (new UnsupportedOperationException());
	    } else {
		throw (new InternalError());
	    }
	}
	return (true);
    }

    private static boolean _isMatchDataOptional(
	String data,
	Element optional
    ) {
	throw (new UnsupportedOperationException());
    }

    private static boolean _isMatchDataOneOrMore(
	String data,
	Element oneOrMore
    ) {
	throw (new UnsupportedOperationException());
    }

    private static boolean _isMatchDataZeroOrMore(
	String data,
	Element zeroOrMore
    ) {
	throw (new UnsupportedOperationException());
    }

    // test driver
    public static void main(String[] args) throws Exception {
	String className = args[0];
	File file = new File(args[1]);
	Class clazz = Class.forName(className);
	Method setupMethod = clazz.getMethod(
	    "setup",
	    new Class[] { File.class }
	);
	Method makeMethod = clazz.getMethod(
	    "makeDocument",
	    new Class[0]
	);
	Object object = clazz.newInstance();
	setupMethod.invoke(object, new Object[] { file });
	Document doc = (Document)makeMethod.invoke(object, new Object[0]);
	System.out.println(URelaxer.doc2String4Data(doc));
    }
}
