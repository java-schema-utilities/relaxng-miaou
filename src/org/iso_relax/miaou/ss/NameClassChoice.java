package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>NameClassChoice</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="choice">
 *   <ref name="nameClass"/>
 *   <ref name="nameClass"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="choice"&gt;
 *   &lt;ref name="nameClass"/&gt;
 *   &lt;ref name="nameClass"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class NameClassChoice implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode, INameClassChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://relaxng.org/ns/structure/1.0");
    private INameClassChoice nameClass1_;
    private INameClassChoice nameClass2_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>NameClassChoice</code>.
     *
     */
    public NameClassChoice() {
    }

    /**
     * Creates a <code>NameClassChoice</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public NameClassChoice(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public NameClassChoice(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>NameClassChoice</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public NameClassChoice(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>NameClassChoice</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>NameClassChoice</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public NameClassChoice(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>NameClassChoice</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>NameClassChoice</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>NameClassChoice</code> by the Stack <code>stack</code>
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
        if (NameClassNsName.isMatch(stack)) {
            setNameClass1(factory.createNameClassNsName(stack));
        } else if (NameClassChoice.isMatch(stack)) {
            setNameClass1(factory.createNameClassChoice(stack));
        } else if (NameClassAnyName.isMatch(stack)) {
            setNameClass1(factory.createNameClassAnyName(stack));
        } else if (NameClassName.isMatch(stack)) {
            setNameClass1(factory.createNameClassName(stack));
        } else {
            throw (new IllegalArgumentException());
        }
        if (NameClassNsName.isMatch(stack)) {
            setNameClass2(factory.createNameClassNsName(stack));
        } else if (NameClassChoice.isMatch(stack)) {
            setNameClass2(factory.createNameClassChoice(stack));
        } else if (NameClassAnyName.isMatch(stack)) {
            setNameClass2(factory.createNameClassAnyName(stack));
        } else if (NameClassName.isMatch(stack)) {
            setNameClass2(factory.createNameClassName(stack));
        } else {
            throw (new IllegalArgumentException());
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
        Element element = doc.createElementNS("http://relaxng.org/ns/structure/1.0", "choice");
        rNSContext_.setupNamespace(element);
        int size;
        this.nameClass1_.makeElement(element);
        this.nameClass2_.makeElement(element);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>NameClassChoice</code> by the File <code>file</code>.
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
     * Initializes the <code>NameClassChoice</code>
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
     * Initializes the <code>NameClassChoice</code> by the URL <code>url</code>.
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
     * Initializes the <code>NameClassChoice</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>NameClassChoice</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>NameClassChoice</code> by the Reader <code>reader</code>.
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
     * Gets the INameClassChoice property <b>nameClass1</b>.
     *
     * @return INameClassChoice
     */
    public final INameClassChoice getNameClass1() {
        return (nameClass1_);
    }

    /**
     * Sets the INameClassChoice property <b>nameClass1</b>.
     *
     * @param nameClass1
     */
    public final void setNameClass1(INameClassChoice nameClass1) {
        this.nameClass1_ = nameClass1;
        if (nameClass1 != null) {
            nameClass1.setParentRNode(this);
        }
        if (nameClass1 != null) {
            nameClass1.setRContext(getRContext());
        }
    }

    /**
     * Gets the INameClassChoice property <b>nameClass2</b>.
     *
     * @return INameClassChoice
     */
    public final INameClassChoice getNameClass2() {
        return (nameClass2_);
    }

    /**
     * Sets the INameClassChoice property <b>nameClass2</b>.
     *
     * @param nameClass2
     */
    public final void setNameClass2(INameClassChoice nameClass2) {
        this.nameClass2_ = nameClass2;
        if (nameClass2 != null) {
            nameClass2.setParentRNode(this);
        }
        if (nameClass2 != null) {
            nameClass2.setRContext(getRContext());
        }
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
        URelaxer.makeQName(prefix, "choice", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        nameClass1_.makeTextElement(buffer);
        nameClass2_.makeTextElement(buffer);
        buffer.append("</");
        URelaxer.makeQName(prefix, "choice", buffer);
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
        URelaxer.makeQName(prefix, "choice", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        nameClass1_.makeTextElement(buffer);
        nameClass2_.makeTextElement(buffer);
        buffer.print("</");
        URelaxer.makeQName(prefix, "choice", buffer);
        buffer.print(">");
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
        classNodes.add(nameClass1_);
        classNodes.add(nameClass2_);
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
     * for the <code>NameClassChoice</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://relaxng.org/ns/structure/1.0", "choice")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (NameClassNsName.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassAnyName.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassName.isMatchHungry(target)) {
            $match$ = true;
        } else {
            return (false);
        }
        if (NameClassNsName.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassAnyName.isMatchHungry(target)) {
            $match$ = true;
        } else if (NameClassName.isMatchHungry(target)) {
            $match$ = true;
        } else {
            return (false);
        }
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>NameClassChoice</code>.
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
     * is valid for the <code>NameClassChoice</code>.
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
