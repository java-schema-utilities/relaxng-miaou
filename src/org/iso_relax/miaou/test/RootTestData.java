package org.iso_relax.miaou.test;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>RootTestData</b> is generated from testData.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="testData">
 *   <zeroOrMore>
 *     <element name="case">
 *       <optional>
 *         <attribute name="rnc"/>
 *       </optional>
 *       <optional>
 *         <attribute name="rng"/>
 *       </optional>
 *       <optional>
 *         <attribute name="ss"/>
 *       </optional>
 *       <optional>
 *         <attribute name="nss"/>
 *       </optional>
 *       <optional>
 *         <attribute name="btg"/>
 *       </optional>
 *       <optional>
 *         <attribute name="bta"/>
 *       </optional>
 *       <optional>
 *         <attribute name="cbta"/>
 *       </optional>
 *     </element>
 *   </zeroOrMore>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="testData"&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;element name="case"&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="rnc"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="rng"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="ss"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="nss"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="btg"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="bta"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;attribute name="cbta"/&gt;
 *       &lt;/optional&gt;
 *     &lt;/element&gt;
 *   &lt;/zeroOrMore&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version testData.rng (Sat Oct 19 02:27:05 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RootTestData implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "");
    // List<RootTestDataCase>
    private java.util.List rootTestDataCase_ = new java.util.ArrayList();
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>RootTestData</code>.
     *
     */
    public RootTestData() {
    }

    /**
     * Creates a <code>RootTestData</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public RootTestData(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>RootTestData</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public RootTestData(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>RootTestData</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public RootTestData(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>RootTestData</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>RootTestData</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>RootTestData</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>RootTestData</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>RootTestData</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>RootTestData</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestData(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>RootTestData</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>RootTestData</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>RootTestData</code> by the Stack <code>stack</code>
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
        ITestDataFactory factory = TestDataFactory.getFactory();
        RStack stack = new RStack(element);
        rNSContext_.declareNamespace(element);
        rootTestDataCase_.clear();
        while (!stack.isEmptyElement()) {
            if (RootTestDataCase.isMatch(stack)) {
                addRootTestDataCase(factory.createRootTestDataCase(stack));
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
        Element element = doc.createElement("testData");
        int size;
        size = this.rootTestDataCase_.size();
        for (int i = 0;i < size;i++) {
            RootTestDataCase value = (RootTestDataCase)this.rootTestDataCase_.get(i);
            value.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>RootTestData</code> by the File <code>file</code>.
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
     * Initializes the <code>RootTestData</code>
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
     * Initializes the <code>RootTestData</code> by the URL <code>url</code>.
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
     * Initializes the <code>RootTestData</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>RootTestData</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>RootTestData</code> by the Reader <code>reader</code>.
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
     * Gets the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     * @return RootTestDataCase[]
     */
    public final RootTestDataCase[] getRootTestDataCase() {
        RootTestDataCase[] array = new RootTestDataCase[rootTestDataCase_.size()];
        return ((RootTestDataCase[])rootTestDataCase_.toArray(array));
    }

    /**
     * Sets the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     * @param rootTestDataCase
     */
    public final void setRootTestDataCase(RootTestDataCase[] rootTestDataCase) {
        this.rootTestDataCase_.clear();
        for (int i = 0;i < rootTestDataCase.length;i++) {
            addRootTestDataCase(rootTestDataCase[i]);
        }
        for (int i = 0;i < rootTestDataCase.length;i++) {
            rootTestDataCase[i].setParentRNode(this);
        }
        for (int i = 0;i < rootTestDataCase.length;i++) {
            rootTestDataCase[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     * @param rootTestDataCase
     */
    public final void setRootTestDataCase(RootTestDataCase rootTestDataCase) {
        this.rootTestDataCase_.clear();
        addRootTestDataCase(rootTestDataCase);
        if (rootTestDataCase != null) {
            rootTestDataCase.setParentRNode(this);
        }
        if (rootTestDataCase != null) {
            rootTestDataCase.setRContext(getRContext());
        }
    }

    /**
     * Adds the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     * @param rootTestDataCase
     */
    public final void addRootTestDataCase(RootTestDataCase rootTestDataCase) {
        this.rootTestDataCase_.add(rootTestDataCase);
        if (rootTestDataCase != null) {
            rootTestDataCase.setParentRNode(this);
        }
        if (rootTestDataCase != null) {
            rootTestDataCase.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     * @return int
     */
    public final int getRootTestDataCaseCount() {
        return (rootTestDataCase_.size());
    }

    /**
     * Gets the RootTestDataCase property <b>rootTestDataCase</b> by index.
     *
     * @param index
     * @return RootTestDataCase
     */
    public final RootTestDataCase getRootTestDataCase(int index) {
        return ((RootTestDataCase)rootTestDataCase_.get(index));
    }

    /**
     * Sets the RootTestDataCase property <b>rootTestDataCase</b> by index.
     *
     * @param index
     * @param rootTestDataCase
     */
    public final void setRootTestDataCase(int index, RootTestDataCase rootTestDataCase) {
        this.rootTestDataCase_.set(index, rootTestDataCase);
    }

    /**
     * Adds the RootTestDataCase property <b>rootTestDataCase</b> by index.
     *
     * @param index
     * @param rootTestDataCase
     */
    public final void addRootTestDataCase(int index, RootTestDataCase rootTestDataCase) {
        this.rootTestDataCase_.add(index, rootTestDataCase);
    }

    /**
     * Remove the RootTestDataCase property <b>rootTestDataCase</b> by index.
     *
     * @param index
     */
    public final void removeRootTestDataCase(int index) {
        this.rootTestDataCase_.remove(index);
    }

    /**
     * Remove the RootTestDataCase property <b>rootTestDataCase</b> by object.
     *
     * @param rootTestDataCase
     */
    public final void removeRootTestDataCase(RootTestDataCase rootTestDataCase) {
        this.rootTestDataCase_.remove(rootTestDataCase);
    }

    /**
     * Clear the RootTestDataCase property <b>rootTestDataCase</b>.
     *
     */
    public final void clearRootTestDataCase() {
        this.rootTestDataCase_.clear();
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
        String prefix = rNSContext_.getPrefixByUri("");
        buffer.append("<");
        URelaxer.makeQName(prefix, "testData", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        size = this.rootTestDataCase_.size();
        for (int i = 0;i < size;i++) {
            RootTestDataCase value = (RootTestDataCase)this.rootTestDataCase_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "testData", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("");
        buffer.print("<");
        URelaxer.makeQName(prefix, "testData", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        size = this.rootTestDataCase_.size();
        for (int i = 0;i < size;i++) {
            RootTestDataCase value = (RootTestDataCase)this.rootTestDataCase_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "testData", buffer);
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
    public void setRootTestDataCaseByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setRootTestDataCase(new RootTestDataCase(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addRootTestDataCaseByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addRootTestDataCase(new RootTestDataCase(string));
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
        classNodes.addAll(rootTestDataCase_);
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
     * for the <code>RootTestData</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "", "testData")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        while (!target.isEmptyElement()) {
            if (!RootTestDataCase.isMatchHungry(target)) {
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
     * is valid for the <code>RootTestData</code>.
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
     * is valid for the <code>RootTestData</code>.
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
