package org.iso_relax.miaou.test;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.w3c.dom.*;

/**
 * RNSContext
 *
 * @since   Jan. 14, 2001
 * @version Jul. 29, 2002
 * @author  ASAMI, Tomoharu (asami@relaxer.org)
 */
public class RNSContext implements Serializable {
    private IRNode rnode_;
    private String namespaceUri_;
    private Map prefixByUri_ = new HashMap();
    private Map uriByPrefix_ = new HashMap();

    public RNSContext(IRNode rnode, String uri) {
	rnode_ = rnode;
	namespaceUri_ = uri;
    }

    // DOM input
    public void declareNamespace(Element element) {
	NamedNodeMap attrs = element.getAttributes();
	int size = attrs.getLength();
	for (int i = 0;i < size;i++) {
	    Attr attr = (Attr)attrs.item(i);
	    String qName = attr.getName();
	    if (qName.startsWith("xmlns:")) {
		String uri = attr.getValue();
		String prefix = qName.substring("xmlns:".length());
		declareNamespace(prefix, uri);
	    } else if (qName.startsWith("xmlns")) {
		String uri = attr.getValue();
		declareNamespace("", uri);
	    }
	}
    }

    // SAX input
    public void declareNamespace(String prefix, String uri) {
	prefixByUri_.put(uri, prefix);
	uriByPrefix_.put(prefix, uri);
    }

    // DOM output
    public void setupNamespace(Element element) {
	String uri = element.getNamespaceURI();
	String myPrefix = getPrefixByUri(uri);
	if (myPrefix != null) {
	    if (!"".equals(myPrefix)) {
		element.setPrefix(myPrefix);
	    }
	    IRNSContainer parent = (IRNSContainer)rnode_.getParentRNode();
	    if (parent == null) {
		addPrefixDecl(element, myPrefix, uri);
		return;
	    }
	    RNSContext parentContext = parent.getRNSContext();
	    String parentPrefix = parentContext.getPrefixByUri(uri);
	    if (!myPrefix.equals(parentPrefix)) {
		addPrefixDecl(element, myPrefix, uri);
	    }
	} else {
	    IRNSContainer parent = (IRNSContainer)rnode_.getParentRNode();
	    if (parent == null) {
		addPrefixDecl(element, null, uri);
		return;
	    }
	    RNSContext parentContext = parent.getRNSContext();
	    if (!uri.equals(parentContext.getNamespaceUri())) {
		addPrefixDecl(element, myPrefix, uri);
		return;
	    }
	    String parentPrefix = parentContext.getPrefixByUri(uri);
	    if (parentPrefix != null) {
		addPrefixDecl(element, myPrefix, uri);
	    }
	}
    }

    // DOM output
    public void addPrefixDecl(Element element, String prefix, String uri) {
	try {
	    _addPrefixDeclDOM2(element, prefix, uri);
	} catch (DOMException e) {
	    _addPrefixDeclXerces(element, prefix, uri);	// XXX
	}
    }

    private void _addPrefixDeclXerces(
	Element element,
	String prefix,
	String uri
    ) {
	if (uri == null || "".equals(uri)) {
	    return;
	}
	if (prefix == null || "".equals(prefix)) {
	    Document doc = element.getOwnerDocument();
	    Attr attr = doc.createAttribute("xmlns");
	    attr.setValue(uri);
	    element.setAttributeNode(attr);
	} else {
	    Document doc = element.getOwnerDocument();
	    Attr attr = doc.createAttribute("xmlns:" + prefix);
	    attr.setValue(uri);
	    element.setAttributeNode(attr);
	}
    }

    private void _addPrefixDeclDOM2(
	Element element,
	String prefix,
	String uri
    ) {
	if (uri == null || "".equals(uri)) {
	    return;
	}
	if (prefix == null || "".equals(prefix)) {
	    Document doc = element.getOwnerDocument();
	    Attr attr = doc.createAttributeNS(
		"http://www.w3.org/XML/2000/xmlns/",
		"xmlns"
	    );
	    attr.setValue(uri);
	    element.setAttributeNode(attr);
	} else {
	    Document doc = element.getOwnerDocument();
	    Attr attr = doc.createAttributeNS(
		"http://www.w3.org/XML/2000/xmlns/",
		"xmlns:" + prefix
	    );
	    attr.setValue(uri);
	    element.setAttributeNode(attr);
	}
    }

    // SAX output
    public void startNSMappings(ContentHandler handler) {
	Set keys = prefixByUri_.keySet();
	Iterator iter = keys.iterator();
	while (iter.hasNext()) {
	    String uri = (String)iter.next();
	    String prefix = (String)prefixByUri_.get(uri);
	    try {
		handler.startPrefixMapping(prefix, uri);
	    } catch (SAXException e) {
	    }
	}
    }

    // SAX output
    public void endNSMappings(ContentHandler handler) {
	Set keys = prefixByUri_.keySet();
	Iterator iter = keys.iterator();
	while (iter.hasNext()) {
	    String uri = (String)iter.next();
	    String prefix = (String)prefixByUri_.get(uri);
	    try {
		handler.endPrefixMapping(prefix);
	    } catch (SAXException e) {
	    }
	}
    }

    // Text output
    public void makeNSMappings(StringBuffer buffer) {
	Set keys = prefixByUri_.keySet();
	Iterator iter = keys.iterator();
	while (iter.hasNext()) {
	    String uri = (String)iter.next();
	    buffer.append(makeNSMapping(uri));
	}
    }

    public void makeNSMappings(PrintWriter buffer) {
	Set keys = prefixByUri_.keySet();
	Iterator iter = keys.iterator();
	while (iter.hasNext()) {
	    String uri = (String)iter.next();
	    buffer.print(makeNSMapping(uri));
	}
    }

    public String makeQName(String uri, String localName) {
	return (URelaxer.getQName(getPrefixByUri(uri), localName));
    }

    public void makeQName(String uri, String localName, StringBuffer buffer) {
	URelaxer.makeQName(getPrefixByUri(uri), localName, buffer);
    }

    public void makeQName(String uri, String localName, PrintWriter buffer) {
	URelaxer.makeQName(getPrefixByUri(uri), localName, buffer);
    }

    public String makeNSMapping(String uri) {
	String prefix = (String)prefixByUri_.get(uri);
	if (prefix == null) {
	    return ("");
	}
	return (URelaxer.getNSMapping(prefix, uri));
    }

    public String getNamespaceUri() {
	return (namespaceUri_);
    }

    public String getPrefix() {
	return (getPrefixByUri(namespaceUri_));
    }

    public void setPrefix(String prefix) {
	declareNamespace(prefix, namespaceUri_);
    }

    public String getPrefixByUri(String uri) {
	if ("http://www.w3.org/XML/1998/namespace".equals(uri)) {
	    return ("xml");
	}
	if ("http://www.w3.org/XML/2000/xmlns/".equals(uri)) {
	    return ("xmlns");
	}
	String prefix = (String)prefixByUri_.get(uri);
	if (prefix != null) {
	    return (prefix);
	}
	IRNSContainer parent = (IRNSContainer)rnode_.getParentRNode();
	if (parent == null) {
	    return (null);
	}
	return (parent.getRNSContext().getPrefixByUri(uri));
    }

    public String getUriByPrefix(String prefix) {
	if ("xml".equals(prefix)) {
	    return ("http://www.w3.org/XML/1998/namespace");
	}
	if ("xmlns".equals(prefix)) {
	    return ("http://www.w3.org/XML/2000/xmlns/");
	}
	String uri = (String)uriByPrefix_.get(prefix);
	if (uri != null) {
	    return (uri);
	}
	IRNSContainer parent = (IRNSContainer)rnode_.getParentRNode();
	if (parent == null) {
	    return (null);
	}
	return (parent.getRNSContext().getUriByPrefix(prefix));
    }

    public String getDefaultNamespace() {
	return (getUriByPrefix(""));
    }
}
