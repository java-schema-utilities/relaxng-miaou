package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>PatternNonExistentAttribute</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="syntaxExtension:nonExistentAttribute">
 *   <ref name="nameClassID"/>
 *   <ref name="exceptNameClassID"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="syntaxExtension:nonExistentAttribute"&gt;
 *   &lt;ref name="nameClassID"/&gt;
 *   &lt;ref name="exceptNameClassID"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class PatternNonExistentAttribute implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode, IPatternChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/syntaxExtension");
    private int syntaxExtensionNc_;
    private int syntaxExtensionExceptNc_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>PatternNonExistentAttribute</code>.
     *
     */
    public PatternNonExistentAttribute() {
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public PatternNonExistentAttribute(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public PatternNonExistentAttribute(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public PatternNonExistentAttribute(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>PatternNonExistentAttribute</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternNonExistentAttribute(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public void setup(RStack stack) {
        init(stack.popElement());
    }

    /**
     * @param element
     */
    private void init(Element element) {
        ISimpleSyntaxFactory factory = SimpleSyntaxFactory.getFactory();
        RStack stack = new RStack(element);
        rNSContext_.declareNamespace(element);
        syntaxExtensionNc_ = URelaxer.getAttributePropertyAsInt(element, "syntaxExtension:nc");
        syntaxExtensionExceptNc_ = URelaxer.getAttributePropertyAsInt(element, "syntaxExtension:exceptNc");
    }

    /**
     * Creates a DOM representation of the object.
     * Result is appended to the Node <code>parent</code>.
     *
     * @param parent
     */
    public void makeElement(Node parent) {
        Document doc;
        if (parent instanceof Document) {
            doc = (Document)parent;
        } else {
            doc = parent.getOwnerDocument();
        }
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/syntaxExtension", "nonExistentAttribute");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByInt(element, "syntaxExtension:nc", this.syntaxExtensionNc_);
        URelaxer.setAttributePropertyByInt(element, "syntaxExtension:exceptNc", this.syntaxExtensionExceptNc_);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file.toURL());
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(UJAXP.getDocument(uri, UJAXP.FLAG_NAMESPACE_AWARE));
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(UJAXP.getDocument(url, UJAXP.FLAG_NAMESPACE_AWARE));
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(UJAXP.getDocument(in, UJAXP.FLAG_NAMESPACE_AWARE));
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(UJAXP.getDocument(is, UJAXP.FLAG_NAMESPACE_AWARE));
    }

    /**
     * Initializes the <code>PatternNonExistentAttribute</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setup(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(UJAXP.getDocument(reader, UJAXP.FLAG_NAMESPACE_AWARE));
    }

    /**
     * Creates a DOM document representation of the object.
     *
     * @exception ParserConfigurationException
     * @return Document
     */
    public Document makeDocument() throws ParserConfigurationException {
        Document doc = UJAXP.makeDocument();
        makeElement(doc);
        return (doc);
    }

    /**
     * Gets the RNSContext property <b>rNSContext</b>.
     *
     * @return RNSContext
     */
    public final RNSContext getRNSContext() {
        return (rNSContext_);
    }

    /**
     * Sets the RNSContext property <b>rNSContext</b>.
     *
     * @param rNSContext
     */
    public final void setRNSContext(RNSContext rNSContext) {
        this.rNSContext_ = rNSContext;
    }

    /**
     * Gets the int property <b>syntaxExtensionNc</b>.
     *
     * @return int
     */
    public final int getSyntaxExtensionNc() {
        return (syntaxExtensionNc_);
    }

    /**
     * Sets the int property <b>syntaxExtensionNc</b>.
     *
     * @param syntaxExtensionNc
     */
    public final void setSyntaxExtensionNc(int syntaxExtensionNc) {
        this.syntaxExtensionNc_ = syntaxExtensionNc;
    }

    /**
     * Gets the int property <b>syntaxExtensionExceptNc</b>.
     *
     * @return int
     */
    public final int getSyntaxExtensionExceptNc() {
        return (syntaxExtensionExceptNc_);
    }

    /**
     * Sets the int property <b>syntaxExtensionExceptNc</b>.
     *
     * @param syntaxExtensionExceptNc
     */
    public final void setSyntaxExtensionExceptNc(int syntaxExtensionExceptNc) {
        this.syntaxExtensionExceptNc_ = syntaxExtensionExceptNc;
    }

    /**
     * Makes a XML text representation.
     *
     * @return String
     */
    public String makeTextDocument() {
        StringBuffer buffer = new StringBuffer();
        makeTextElement(buffer);
        return (new String(buffer));
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(StringBuffer buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/syntaxExtension");
        buffer.append("<");
        URelaxer.makeQName(prefix, "nonExistentAttribute", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("syntaxExtension:nc");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getSyntaxExtensionNc()));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("syntaxExtension:exceptNc");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getSyntaxExtensionExceptNc()));
        buffer.append("\"");
        buffer.append(">");
        buffer.append("</");
        URelaxer.makeQName(prefix, "nonExistentAttribute", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/syntaxExtension");
        buffer.print("<");
        URelaxer.makeQName(prefix, "nonExistentAttribute", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("syntaxExtension:nc");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getSyntaxExtensionNc()));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("syntaxExtension:exceptNc");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getSyntaxExtensionExceptNc()));
        buffer.print("\"");
        buffer.print(">");
        buffer.print("</");
        URelaxer.makeQName(prefix, "nonExistentAttribute", buffer);
        buffer.print(">");
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSyntaxExtensionNcAsString() {
        return (URelaxer.getString(getSyntaxExtensionNc()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSyntaxExtensionExceptNcAsString() {
        return (URelaxer.getString(getSyntaxExtensionExceptNc()));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSyntaxExtensionNcByString(String string) {
        setSyntaxExtensionNc(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSyntaxExtensionExceptNcByString(String string) {
        setSyntaxExtensionExceptNc(Integer.parseInt(string));
    }

    /**
     * Returns a String representation of this object.
     * While this method informs as XML format representaion, 
     *  it's purpose is just information, not making 
     * a rigid XML documentation.
     *
     * @return String
     */
    public String toString() {
        try {
            return (makeTextDocument());
        } catch (Exception e) {
            return (super.toString());
        }
    }

    /**
     * Accepts the Visitor for enter behavior.
     *
     * @param visitor
     * @return boolean
     */
    public boolean enter(IRVisitor visitor) {
        return (visitor.enter(this));
    }

    /**
     * Accepts the Visitor for leave behavior.
     *
     * @param visitor
     */
    public void leave(IRVisitor visitor) {
        visitor.leave(this);
    }

    /**
     * Gets the IRNode property <b>parentRNode</b>.
     *
     * @return IRNode
     */
    public final IRNode getParentRNode() {
        return (parentRNode_);
    }

    /**
     * Sets the IRNode property <b>parentRNode</b>.
     *
     * @param parentRNode
     */
    public final void setParentRNode(IRNode parentRNode) {
        this.parentRNode_ = parentRNode;
    }

    /**
     * Gets child RNodes.
     *
     * @return IRNode[]
     */
    public IRNode[] getRNodes() {
        java.util.List classNodes = new java.util.ArrayList();
        IRNode[] nodes = new IRNode[classNodes.size()];
        return ((IRNode[])classNodes.toArray(nodes));
    }

    /**
     * Gets the RContext property <b>rContext</b>.
     *
     * @return RContext
     */
    public final RContext getRContext() {
        return (rContext_);
    }

    /**
     * Sets the RContext property <b>rContext</b>.
     *
     * @param rContext
     */
    public final void setRContext(RContext rContext) {
        this.rContext_ = rContext;
        IRNode[] contextRNodes = getRNodes();
        for (int i = 0;i < contextRNodes.length;i++) {
            contextRNodes[i].setRContext(rContext_);
        }
    }

    /**
     * Gets the property "rContext" which is resolved recursively.
     *
     * @return RContext
     */
    public RContext getRContextResolved() {
        return (parentRNode_.getRContextResolved());
    }

    /**
     * Tests if a Element <code>element</code> is valid
     * for the <code>PatternNonExistentAttribute</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/syntaxExtension", "nonExistentAttribute")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("syntaxExtension:nc")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("syntaxExtension:exceptNc")) {
            return (false);
        }
        $match$ = true;
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>PatternNonExistentAttribute</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return boolean
     */
    public static boolean isMatch(RStack stack) {
        Element element = stack.peekElement();
        if (element == null) {
            return (false);
        }
        return (isMatch(element));
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>PatternNonExistentAttribute</code>.
     * This method consumes the stack contents during matching operation.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return boolean
     */
    public static boolean isMatchHungry(RStack stack) {
        Element element = stack.peekElement();
        if (element == null) {
            return (false);
        }
        if (isMatch(element)) {
            stack.popElement();
            return (true);
        } else {
            return (false);
        }
    }
}
