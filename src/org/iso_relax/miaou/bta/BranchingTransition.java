package org.iso_relax.miaou.bta;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>BranchingTransition</b> is generated from binaryTreeAutomaton.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="branchingTransition" relaxer:implements="java.lang.Cloneable">
 *   <ref name="source"/>
 *   <ref name="firstTarget"/>
 *   <ref name="secondTarget"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="branchingTransition" relaxer:implements="java.lang.Cloneable"&gt;
 *   &lt;ref name="source"/&gt;
 *   &lt;ref name="firstTarget"/&gt;
 *   &lt;ref name="secondTarget"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeAutomaton.rng (Sat Oct 19 02:26:41 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class BranchingTransition implements java.io.Serializable, IRNSContainer, java.lang.Cloneable, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
    private int source_;
    private int firstTarget_;
    private int secondTarget_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>BranchingTransition</code>.
     *
     */
    public BranchingTransition() {
    }

    /**
     * Creates a <code>BranchingTransition</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public BranchingTransition(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public BranchingTransition(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>BranchingTransition</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public BranchingTransition(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>BranchingTransition</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>BranchingTransition</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BranchingTransition(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>BranchingTransition</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>BranchingTransition</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>BranchingTransition</code> by the Stack <code>stack</code>
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
        source_ = URelaxer.getAttributePropertyAsInt(element, "source");
        firstTarget_ = URelaxer.getAttributePropertyAsInt(element, "firstTarget");
        secondTarget_ = URelaxer.getAttributePropertyAsInt(element, "secondTarget");
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "branchingTransition");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByInt(element, "source", this.source_);
        URelaxer.setAttributePropertyByInt(element, "firstTarget", this.firstTarget_);
        URelaxer.setAttributePropertyByInt(element, "secondTarget", this.secondTarget_);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>BranchingTransition</code> by the File <code>file</code>.
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
     * Initializes the <code>BranchingTransition</code>
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
     * Initializes the <code>BranchingTransition</code> by the URL <code>url</code>.
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
     * Initializes the <code>BranchingTransition</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>BranchingTransition</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>BranchingTransition</code> by the Reader <code>reader</code>.
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
     * Gets the int property <b>source</b>.
     *
     * @return int
     */
    public final int getSource() {
        return (source_);
    }

    /**
     * Sets the int property <b>source</b>.
     *
     * @param source
     */
    public final void setSource(int source) {
        this.source_ = source;
    }

    /**
     * Gets the int property <b>firstTarget</b>.
     *
     * @return int
     */
    public final int getFirstTarget() {
        return (firstTarget_);
    }

    /**
     * Sets the int property <b>firstTarget</b>.
     *
     * @param firstTarget
     */
    public final void setFirstTarget(int firstTarget) {
        this.firstTarget_ = firstTarget;
    }

    /**
     * Gets the int property <b>secondTarget</b>.
     *
     * @return int
     */
    public final int getSecondTarget() {
        return (secondTarget_);
    }

    /**
     * Sets the int property <b>secondTarget</b>.
     *
     * @param secondTarget
     */
    public final void setSecondTarget(int secondTarget) {
        this.secondTarget_ = secondTarget;
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
        URelaxer.makeQName(prefix, "branchingTransition", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("source");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getSource()));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("firstTarget");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getFirstTarget()));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("secondTarget");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getSecondTarget()));
        buffer.append("\"");
        buffer.append(">");
        buffer.append("</");
        URelaxer.makeQName(prefix, "branchingTransition", buffer);
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
        URelaxer.makeQName(prefix, "branchingTransition", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("source");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getSource()));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("firstTarget");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getFirstTarget()));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("secondTarget");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getSecondTarget()));
        buffer.print("\"");
        buffer.print(">");
        buffer.print("</");
        URelaxer.makeQName(prefix, "branchingTransition", buffer);
        buffer.print(">");
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSourceAsString() {
        return (URelaxer.getString(getSource()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getFirstTargetAsString() {
        return (URelaxer.getString(getFirstTarget()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSecondTargetAsString() {
        return (URelaxer.getString(getSecondTarget()));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSourceByString(String string) {
        setSource(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setFirstTargetByString(String string) {
        setFirstTarget(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSecondTargetByString(String string) {
        setSecondTarget(Integer.parseInt(string));
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
     * for the <code>BranchingTransition</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "branchingTransition")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("source")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("firstTarget")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("secondTarget")) {
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
     * is valid for the <code>BranchingTransition</code>.
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
     * is valid for the <code>BranchingTransition</code>.
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
