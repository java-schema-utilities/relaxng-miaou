package org.iso_relax.miaou.bta;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>ListTransition</b> is generated from binaryTreeAutomaton.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="listTransition" relaxer:implements="java.lang.Cloneable">
 *   <ref name="target"/>
 *   <ref name="left"/>
 *   <ref name="right"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="listTransition" relaxer:implements="java.lang.Cloneable"&gt;
 *   &lt;ref name="target"/&gt;
 *   &lt;ref name="left"/&gt;
 *   &lt;ref name="right"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeAutomaton.rng (Sat Oct 19 02:26:42 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class ListTransition implements java.io.Serializable, IRNSContainer, java.lang.Cloneable, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
    private int target_;
    private int left_;
    private int right_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>ListTransition</code>.
     *
     */
    public ListTransition() {
    }

    /**
     * Creates a <code>ListTransition</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public ListTransition(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>ListTransition</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public ListTransition(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>ListTransition</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public ListTransition(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>ListTransition</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>ListTransition</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>ListTransition</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>ListTransition</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>ListTransition</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>ListTransition</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public ListTransition(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>ListTransition</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>ListTransition</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>ListTransition</code> by the Stack <code>stack</code>
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
        IBinaryTreeAutomatonFactory factory = BinaryTreeAutomatonFactory.getFactory();
        RStack stack = new RStack(element);
        rNSContext_.declareNamespace(element);
        target_ = URelaxer.getAttributePropertyAsInt(element, "target");
        left_ = URelaxer.getAttributePropertyAsInt(element, "left");
        right_ = URelaxer.getAttributePropertyAsInt(element, "right");
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "listTransition");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByInt(element, "target", this.target_);
        URelaxer.setAttributePropertyByInt(element, "left", this.left_);
        URelaxer.setAttributePropertyByInt(element, "right", this.right_);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>ListTransition</code> by the File <code>file</code>.
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
     * Initializes the <code>ListTransition</code>
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
     * Initializes the <code>ListTransition</code> by the URL <code>url</code>.
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
     * Initializes the <code>ListTransition</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>ListTransition</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>ListTransition</code> by the Reader <code>reader</code>.
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
     * Gets the int property <b>target</b>.
     *
     * @return int
     */
    public final int getTarget() {
        return (target_);
    }

    /**
     * Sets the int property <b>target</b>.
     *
     * @param target
     */
    public final void setTarget(int target) {
        this.target_ = target;
    }

    /**
     * Gets the int property <b>left</b>.
     *
     * @return int
     */
    public final int getLeft() {
        return (left_);
    }

    /**
     * Sets the int property <b>left</b>.
     *
     * @param left
     */
    public final void setLeft(int left) {
        this.left_ = left;
    }

    /**
     * Gets the int property <b>right</b>.
     *
     * @return int
     */
    public final int getRight() {
        return (right_);
    }

    /**
     * Sets the int property <b>right</b>.
     *
     * @param right
     */
    public final void setRight(int right) {
        this.right_ = right;
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
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
        buffer.append("<");
        URelaxer.makeQName(prefix, "listTransition", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("target");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getTarget()));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("left");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getLeft()));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("right");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getRight()));
        buffer.append("\"");
        buffer.append(">");
        buffer.append("</");
        URelaxer.makeQName(prefix, "listTransition", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
        buffer.print("<");
        URelaxer.makeQName(prefix, "listTransition", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("target");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getTarget()));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("left");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getLeft()));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("right");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getRight()));
        buffer.print("\"");
        buffer.print(">");
        buffer.print("</");
        URelaxer.makeQName(prefix, "listTransition", buffer);
        buffer.print(">");
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getTargetAsString() {
        return (URelaxer.getString(getTarget()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getLeftAsString() {
        return (URelaxer.getString(getLeft()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getRightAsString() {
        return (URelaxer.getString(getRight()));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setTargetByString(String string) {
        setTarget(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setLeftByString(String string) {
        setLeft(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setRightByString(String string) {
        setRight(Integer.parseInt(string));
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
     * for the <code>ListTransition</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "listTransition")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("target")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("left")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("right")) {
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
     * is valid for the <code>ListTransition</code>.
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
     * is valid for the <code>ListTransition</code>.
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
