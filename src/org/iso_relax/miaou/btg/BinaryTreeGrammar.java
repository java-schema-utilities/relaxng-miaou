package org.iso_relax.miaou.btg;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>BinaryTreeGrammar</b> is generated from binaryTreeGrammar.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="BinaryTreeGrammar">
 *   <element name="Start">
 *     <ref name="btrExp"/>
 *   </element>
 *   <zeroOrMore>
 *     <element name="Rule">
 *       <attribute name="name">
 *         <data type="ID"/>
 *       </attribute>
 *       <ref name="btrExp"/>
 *     </element>
 *   </zeroOrMore>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="BinaryTreeGrammar"&gt;
 *   &lt;element name="Start"&gt;
 *     &lt;ref name="btrExp"/&gt;
 *   &lt;/element&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;element name="Rule"&gt;
 *       &lt;attribute name="name"&gt;
 *         &lt;data type="ID"/&gt;
 *       &lt;/attribute&gt;
 *       &lt;ref name="btrExp"/&gt;
 *     &lt;/element&gt;
 *   &lt;/zeroOrMore&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeGrammar.rng (Sat Oct 19 02:26:53 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class BinaryTreeGrammar implements java.io.Serializable, IRNSContainer, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
    private BinaryTreeGrammarStart binaryTreeGrammarStart_;
    // List<BinaryTreeGrammarRule>
    private java.util.List binaryTreeGrammarRule_ = new java.util.ArrayList();
    private IRNode parentRNode_;

    /**
     * Creates a <code>BinaryTreeGrammar</code>.
     *
     */
    public BinaryTreeGrammar() {
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public BinaryTreeGrammar(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public BinaryTreeGrammar(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public BinaryTreeGrammar(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>BinaryTreeGrammar</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeGrammar(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>BinaryTreeGrammar</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>BinaryTreeGrammar</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>BinaryTreeGrammar</code> by the Stack <code>stack</code>
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
        IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
        RStack stack = new RStack(element);
        rNSContext_.declareNamespace(element);
        setBinaryTreeGrammarStart(factory.createBinaryTreeGrammarStart(stack));
        binaryTreeGrammarRule_.clear();
        while (!stack.isEmptyElement()) {
            if (BinaryTreeGrammarRule.isMatch(stack)) {
                addBinaryTreeGrammarRule(factory.createBinaryTreeGrammarRule(stack));
            } else {
                break;
            }
        }
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "BinaryTreeGrammar");
        rNSContext_.setupNamespace(element);
        int size;
        this.binaryTreeGrammarStart_.makeElement(element);
        size = this.binaryTreeGrammarRule_.size();
        for (int i = 0;i < size;i++) {
            BinaryTreeGrammarRule value = (BinaryTreeGrammarRule)this.binaryTreeGrammarRule_.get(i);
            value.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>BinaryTreeGrammar</code> by the File <code>file</code>.
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
     * Initializes the <code>BinaryTreeGrammar</code>
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
     * Initializes the <code>BinaryTreeGrammar</code> by the URL <code>url</code>.
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
     * Initializes the <code>BinaryTreeGrammar</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>BinaryTreeGrammar</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>BinaryTreeGrammar</code> by the Reader <code>reader</code>.
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
     * Gets the BinaryTreeGrammarStart property <b>binaryTreeGrammarStart</b>.
     *
     * @return BinaryTreeGrammarStart
     */
    public final BinaryTreeGrammarStart getBinaryTreeGrammarStart() {
        return (binaryTreeGrammarStart_);
    }

    /**
     * Sets the BinaryTreeGrammarStart property <b>binaryTreeGrammarStart</b>.
     *
     * @param binaryTreeGrammarStart
     */
    public final void setBinaryTreeGrammarStart(BinaryTreeGrammarStart binaryTreeGrammarStart) {
        this.binaryTreeGrammarStart_ = binaryTreeGrammarStart;
        if (binaryTreeGrammarStart != null) {
            binaryTreeGrammarStart.setParentRNode(this);
        }
    }

    /**
     * Gets the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     * @return BinaryTreeGrammarRule[]
     */
    public final BinaryTreeGrammarRule[] getBinaryTreeGrammarRule() {
        BinaryTreeGrammarRule[] array = new BinaryTreeGrammarRule[binaryTreeGrammarRule_.size()];
        return ((BinaryTreeGrammarRule[])binaryTreeGrammarRule_.toArray(array));
    }

    /**
     * Sets the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     * @param binaryTreeGrammarRule
     */
    public final void setBinaryTreeGrammarRule(BinaryTreeGrammarRule[] binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.clear();
        for (int i = 0;i < binaryTreeGrammarRule.length;i++) {
            addBinaryTreeGrammarRule(binaryTreeGrammarRule[i]);
        }
        for (int i = 0;i < binaryTreeGrammarRule.length;i++) {
            binaryTreeGrammarRule[i].setParentRNode(this);
        }
    }

    /**
     * Sets the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     * @param binaryTreeGrammarRule
     */
    public final void setBinaryTreeGrammarRule(BinaryTreeGrammarRule binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.clear();
        addBinaryTreeGrammarRule(binaryTreeGrammarRule);
        if (binaryTreeGrammarRule != null) {
            binaryTreeGrammarRule.setParentRNode(this);
        }
    }

    /**
     * Adds the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     * @param binaryTreeGrammarRule
     */
    public final void addBinaryTreeGrammarRule(BinaryTreeGrammarRule binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.add(binaryTreeGrammarRule);
        if (binaryTreeGrammarRule != null) {
            binaryTreeGrammarRule.setParentRNode(this);
        }
    }

    /**
     * Gets number of the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     * @return int
     */
    public final int getBinaryTreeGrammarRuleCount() {
        return (binaryTreeGrammarRule_.size());
    }

    /**
     * Gets the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b> by index.
     *
     * @param index
     * @return BinaryTreeGrammarRule
     */
    public final BinaryTreeGrammarRule getBinaryTreeGrammarRule(int index) {
        return ((BinaryTreeGrammarRule)binaryTreeGrammarRule_.get(index));
    }

    /**
     * Sets the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b> by index.
     *
     * @param index
     * @param binaryTreeGrammarRule
     */
    public final void setBinaryTreeGrammarRule(int index, BinaryTreeGrammarRule binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.set(index, binaryTreeGrammarRule);
    }

    /**
     * Adds the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b> by index.
     *
     * @param index
     * @param binaryTreeGrammarRule
     */
    public final void addBinaryTreeGrammarRule(int index, BinaryTreeGrammarRule binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.add(index, binaryTreeGrammarRule);
    }

    /**
     * Remove the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b> by index.
     *
     * @param index
     */
    public final void removeBinaryTreeGrammarRule(int index) {
        this.binaryTreeGrammarRule_.remove(index);
    }

    /**
     * Remove the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b> by object.
     *
     * @param binaryTreeGrammarRule
     */
    public final void removeBinaryTreeGrammarRule(BinaryTreeGrammarRule binaryTreeGrammarRule) {
        this.binaryTreeGrammarRule_.remove(binaryTreeGrammarRule);
    }

    /**
     * Clear the BinaryTreeGrammarRule property <b>binaryTreeGrammarRule</b>.
     *
     */
    public final void clearBinaryTreeGrammarRule() {
        this.binaryTreeGrammarRule_.clear();
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
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
        buffer.append("<");
        URelaxer.makeQName(prefix, "BinaryTreeGrammar", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        binaryTreeGrammarStart_.makeTextElement(buffer);
        size = this.binaryTreeGrammarRule_.size();
        for (int i = 0;i < size;i++) {
            BinaryTreeGrammarRule value = (BinaryTreeGrammarRule)this.binaryTreeGrammarRule_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "BinaryTreeGrammar", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
        buffer.print("<");
        URelaxer.makeQName(prefix, "BinaryTreeGrammar", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        binaryTreeGrammarStart_.makeTextElement(buffer);
        size = this.binaryTreeGrammarRule_.size();
        for (int i = 0;i < size;i++) {
            BinaryTreeGrammarRule value = (BinaryTreeGrammarRule)this.binaryTreeGrammarRule_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "BinaryTreeGrammar", buffer);
        buffer.print(">");
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setBinaryTreeGrammarStartByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setBinaryTreeGrammarStart(new BinaryTreeGrammarStart(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setBinaryTreeGrammarRuleByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setBinaryTreeGrammarRule(new BinaryTreeGrammarRule(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addBinaryTreeGrammarRuleByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addBinaryTreeGrammarRule(new BinaryTreeGrammarRule(string));
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
        classNodes.add(binaryTreeGrammarStart_);
        classNodes.addAll(binaryTreeGrammarRule_);
        IRNode[] nodes = new IRNode[classNodes.size()];
        return ((IRNode[])classNodes.toArray(nodes));
    }

    /**
     * Tests if a Element <code>element</code> is valid
     * for the <code>BinaryTreeGrammar</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "BinaryTreeGrammar")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!BinaryTreeGrammarStart.isMatchHungry(target)) {
            return (false);
        }
        $match$ = true;
        while (!target.isEmptyElement()) {
            if (!BinaryTreeGrammarRule.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>BinaryTreeGrammar</code>.
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
     * is valid for the <code>BinaryTreeGrammar</code>.
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
