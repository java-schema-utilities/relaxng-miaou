package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>RootGrammar</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="grammar">
 *   <element name="start">
 *     <ref name="pattern"/>
 *   </element>
 *   <zeroOrMore>
 *     <ref name="define"/>
 *   </zeroOrMore>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="grammar"&gt;
 *   &lt;element name="start"&gt;
 *     &lt;ref name="pattern"/&gt;
 *   &lt;/element&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="define"/&gt;
 *   &lt;/zeroOrMore&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RootGrammar implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://relaxng.org/ns/structure/1.0");
    private RootGrammarStart rootGrammarStart_;
    // List<Define>
    private java.util.List define_ = new java.util.ArrayList();
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>RootGrammar</code>.
     *
     */
    public RootGrammar() {
    }

    /**
     * Creates a <code>RootGrammar</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public RootGrammar(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>RootGrammar</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public RootGrammar(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>RootGrammar</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public RootGrammar(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>RootGrammar</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>RootGrammar</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>RootGrammar</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>RootGrammar</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>RootGrammar</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>RootGrammar</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootGrammar(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>RootGrammar</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>RootGrammar</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>RootGrammar</code> by the Stack <code>stack</code>
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
        setRootGrammarStart(factory.createRootGrammarStart(stack));
        define_.clear();
        while (!stack.isEmptyElement()) {
            if (Define.isMatch(stack)) {
                addDefine(factory.createDefine(stack));
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
        Element element = doc.createElementNS("http://relaxng.org/ns/structure/1.0", "grammar");
        rNSContext_.setupNamespace(element);
        int size;
        this.rootGrammarStart_.makeElement(element);
        size = this.define_.size();
        for (int i = 0;i < size;i++) {
            Define value = (Define)this.define_.get(i);
            value.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>RootGrammar</code> by the File <code>file</code>.
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
     * Initializes the <code>RootGrammar</code>
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
     * Initializes the <code>RootGrammar</code> by the URL <code>url</code>.
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
     * Initializes the <code>RootGrammar</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>RootGrammar</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>RootGrammar</code> by the Reader <code>reader</code>.
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
     * Gets the RootGrammarStart property <b>rootGrammarStart</b>.
     *
     * @return RootGrammarStart
     */
    public final RootGrammarStart getRootGrammarStart() {
        return (rootGrammarStart_);
    }

    /**
     * Sets the RootGrammarStart property <b>rootGrammarStart</b>.
     *
     * @param rootGrammarStart
     */
    public final void setRootGrammarStart(RootGrammarStart rootGrammarStart) {
        this.rootGrammarStart_ = rootGrammarStart;
        if (rootGrammarStart != null) {
            rootGrammarStart.setParentRNode(this);
        }
        if (rootGrammarStart != null) {
            rootGrammarStart.setRContext(getRContext());
        }
    }

    /**
     * Gets the Define property <b>define</b>.
     *
     * @return Define[]
     */
    public final Define[] getDefine() {
        Define[] array = new Define[define_.size()];
        return ((Define[])define_.toArray(array));
    }

    /**
     * Sets the Define property <b>define</b>.
     *
     * @param define
     */
    public final void setDefine(Define[] define) {
        this.define_.clear();
        for (int i = 0;i < define.length;i++) {
            addDefine(define[i]);
        }
        for (int i = 0;i < define.length;i++) {
            define[i].setParentRNode(this);
        }
        for (int i = 0;i < define.length;i++) {
            define[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the Define property <b>define</b>.
     *
     * @param define
     */
    public final void setDefine(Define define) {
        this.define_.clear();
        addDefine(define);
        if (define != null) {
            define.setParentRNode(this);
        }
        if (define != null) {
            define.setRContext(getRContext());
        }
    }

    /**
     * Adds the Define property <b>define</b>.
     *
     * @param define
     */
    public final void addDefine(Define define) {
        this.define_.add(define);
        if (define != null) {
            define.setParentRNode(this);
        }
        if (define != null) {
            define.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the Define property <b>define</b>.
     *
     * @return int
     */
    public final int getDefineCount() {
        return (define_.size());
    }

    /**
     * Gets the Define property <b>define</b> by index.
     *
     * @param index
     * @return Define
     */
    public final Define getDefine(int index) {
        return ((Define)define_.get(index));
    }

    /**
     * Sets the Define property <b>define</b> by index.
     *
     * @param index
     * @param define
     */
    public final void setDefine(int index, Define define) {
        this.define_.set(index, define);
    }

    /**
     * Adds the Define property <b>define</b> by index.
     *
     * @param index
     * @param define
     */
    public final void addDefine(int index, Define define) {
        this.define_.add(index, define);
    }

    /**
     * Remove the Define property <b>define</b> by index.
     *
     * @param index
     */
    public final void removeDefine(int index) {
        this.define_.remove(index);
    }

    /**
     * Remove the Define property <b>define</b> by object.
     *
     * @param define
     */
    public final void removeDefine(Define define) {
        this.define_.remove(define);
    }

    /**
     * Clear the Define property <b>define</b>.
     *
     */
    public final void clearDefine() {
        this.define_.clear();
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
        String prefix = rNSContext_.getPrefixByUri("http://relaxng.org/ns/structure/1.0");
        buffer.append("<");
        URelaxer.makeQName(prefix, "grammar", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        rootGrammarStart_.makeTextElement(buffer);
        size = this.define_.size();
        for (int i = 0;i < size;i++) {
            Define value = (Define)this.define_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "grammar", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://relaxng.org/ns/structure/1.0");
        buffer.print("<");
        URelaxer.makeQName(prefix, "grammar", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        rootGrammarStart_.makeTextElement(buffer);
        size = this.define_.size();
        for (int i = 0;i < size;i++) {
            Define value = (Define)this.define_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "grammar", buffer);
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
    public void setRootGrammarStartByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setRootGrammarStart(new RootGrammarStart(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setDefineByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setDefine(new Define(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addDefineByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addDefine(new Define(string));
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
        classNodes.add(rootGrammarStart_);
        classNodes.addAll(define_);
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
     * for the <code>RootGrammar</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://relaxng.org/ns/structure/1.0", "grammar")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!RootGrammarStart.isMatchHungry(target)) {
            return (false);
        }
        $match$ = true;
        while (!target.isEmptyElement()) {
            if (!Define.isMatchHungry(target)) {
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
     * is valid for the <code>RootGrammar</code>.
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
     * is valid for the <code>RootGrammar</code>.
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
