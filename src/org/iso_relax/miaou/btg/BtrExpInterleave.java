package org.iso_relax.miaou.btg;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>BtrExpInterleave</b> is generated from binaryTreeGrammar.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="Interleave">
 *   <ref name="btrExp"/>
 *   <ref name="btrExp"/>
 *   <ref name="btrExp"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="Interleave"&gt;
 *   &lt;ref name="btrExp"/&gt;
 *   &lt;ref name="btrExp"/&gt;
 *   &lt;ref name="btrExp"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeGrammar.rng (Sat Oct 19 02:26:53 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class BtrExpInterleave implements java.io.Serializable, IRNSContainer, IRNode, IBtrExpChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
    private IBtrExpChoice btrExp1_;
    private IBtrExpChoice btrExp2_;
    private IBtrExpChoice btrExp3_;
    private IRNode parentRNode_;

    /**
     * Creates a <code>BtrExpInterleave</code>.
     *
     */
    public BtrExpInterleave() {
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public BtrExpInterleave(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public BtrExpInterleave(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public BtrExpInterleave(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>BtrExpInterleave</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>BtrExpInterleave</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BtrExpInterleave(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>BtrExpInterleave</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>BtrExpInterleave</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>BtrExpInterleave</code> by the Stack <code>stack</code>
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
        if (BtrExpElement.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpElement(stack));
        } else if (BtrExpOneOrMoreAttribute.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpOneOrMoreAttribute(stack));
        } else if (BtrExpNonExistentAttribute.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpNonExistentAttribute(stack));
        } else if (BtrExpInterleave.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpInterleave(stack));
        } else if (BtrExpAtomic.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpAtomic(stack));
        } else if (BtrExpList.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpList(stack));
        } else if (BtrExpChoice.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpChoice(stack));
        } else if (BtrExpProduct.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpProduct(stack));
        } else if (BtrExpRef.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpRef(stack));
        } else if (BtrExpText.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpText(stack));
        } else if (BtrExpOneOrMore.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpOneOrMore(stack));
        } else if (BtrExpNotAllowed.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpNotAllowed(stack));
        } else if (BtrExpEnd.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpEnd(stack));
        } else if (BtrExpVariable.isMatch(stack)) {
            setBtrExp1(factory.createBtrExpVariable(stack));
        } else {
            throw (new IllegalArgumentException());
        }
        if (BtrExpElement.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpElement(stack));
        } else if (BtrExpOneOrMoreAttribute.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpOneOrMoreAttribute(stack));
        } else if (BtrExpNonExistentAttribute.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpNonExistentAttribute(stack));
        } else if (BtrExpInterleave.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpInterleave(stack));
        } else if (BtrExpAtomic.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpAtomic(stack));
        } else if (BtrExpList.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpList(stack));
        } else if (BtrExpChoice.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpChoice(stack));
        } else if (BtrExpProduct.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpProduct(stack));
        } else if (BtrExpRef.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpRef(stack));
        } else if (BtrExpText.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpText(stack));
        } else if (BtrExpOneOrMore.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpOneOrMore(stack));
        } else if (BtrExpNotAllowed.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpNotAllowed(stack));
        } else if (BtrExpEnd.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpEnd(stack));
        } else if (BtrExpVariable.isMatch(stack)) {
            setBtrExp2(factory.createBtrExpVariable(stack));
        } else {
            throw (new IllegalArgumentException());
        }
        if (BtrExpElement.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpElement(stack));
        } else if (BtrExpOneOrMoreAttribute.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpOneOrMoreAttribute(stack));
        } else if (BtrExpNonExistentAttribute.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpNonExistentAttribute(stack));
        } else if (BtrExpInterleave.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpInterleave(stack));
        } else if (BtrExpAtomic.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpAtomic(stack));
        } else if (BtrExpList.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpList(stack));
        } else if (BtrExpChoice.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpChoice(stack));
        } else if (BtrExpProduct.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpProduct(stack));
        } else if (BtrExpRef.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpRef(stack));
        } else if (BtrExpText.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpText(stack));
        } else if (BtrExpOneOrMore.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpOneOrMore(stack));
        } else if (BtrExpNotAllowed.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpNotAllowed(stack));
        } else if (BtrExpEnd.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpEnd(stack));
        } else if (BtrExpVariable.isMatch(stack)) {
            setBtrExp3(factory.createBtrExpVariable(stack));
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "Interleave");
        rNSContext_.setupNamespace(element);
        int size;
        this.btrExp1_.makeElement(element);
        this.btrExp2_.makeElement(element);
        this.btrExp3_.makeElement(element);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>BtrExpInterleave</code> by the File <code>file</code>.
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
     * Initializes the <code>BtrExpInterleave</code>
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
     * Initializes the <code>BtrExpInterleave</code> by the URL <code>url</code>.
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
     * Initializes the <code>BtrExpInterleave</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>BtrExpInterleave</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>BtrExpInterleave</code> by the Reader <code>reader</code>.
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
     * Gets the IBtrExpChoice property <b>btrExp1</b>.
     *
     * @return IBtrExpChoice
     */
    public final IBtrExpChoice getBtrExp1() {
        return (btrExp1_);
    }

    /**
     * Sets the IBtrExpChoice property <b>btrExp1</b>.
     *
     * @param btrExp1
     */
    public final void setBtrExp1(IBtrExpChoice btrExp1) {
        this.btrExp1_ = btrExp1;
        if (btrExp1 != null) {
            btrExp1.setParentRNode(this);
        }
    }

    /**
     * Gets the IBtrExpChoice property <b>btrExp2</b>.
     *
     * @return IBtrExpChoice
     */
    public final IBtrExpChoice getBtrExp2() {
        return (btrExp2_);
    }

    /**
     * Sets the IBtrExpChoice property <b>btrExp2</b>.
     *
     * @param btrExp2
     */
    public final void setBtrExp2(IBtrExpChoice btrExp2) {
        this.btrExp2_ = btrExp2;
        if (btrExp2 != null) {
            btrExp2.setParentRNode(this);
        }
    }

    /**
     * Gets the IBtrExpChoice property <b>btrExp3</b>.
     *
     * @return IBtrExpChoice
     */
    public final IBtrExpChoice getBtrExp3() {
        return (btrExp3_);
    }

    /**
     * Sets the IBtrExpChoice property <b>btrExp3</b>.
     *
     * @param btrExp3
     */
    public final void setBtrExp3(IBtrExpChoice btrExp3) {
        this.btrExp3_ = btrExp3;
        if (btrExp3 != null) {
            btrExp3.setParentRNode(this);
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
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
        buffer.append("<");
        URelaxer.makeQName(prefix, "Interleave", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        btrExp1_.makeTextElement(buffer);
        btrExp2_.makeTextElement(buffer);
        btrExp3_.makeTextElement(buffer);
        buffer.append("</");
        URelaxer.makeQName(prefix, "Interleave", buffer);
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
        URelaxer.makeQName(prefix, "Interleave", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        btrExp1_.makeTextElement(buffer);
        btrExp2_.makeTextElement(buffer);
        btrExp3_.makeTextElement(buffer);
        buffer.print("</");
        URelaxer.makeQName(prefix, "Interleave", buffer);
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
        classNodes.add(btrExp1_);
        classNodes.add(btrExp2_);
        classNodes.add(btrExp3_);
        IRNode[] nodes = new IRNode[classNodes.size()];
        return ((IRNode[])classNodes.toArray(nodes));
    }

    /**
     * Tests if a Element <code>element</code> is valid
     * for the <code>BtrExpInterleave</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "Interleave")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (BtrExpElement.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMoreAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNonExistentAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpInterleave.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpAtomic.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpList.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpProduct.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpRef.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpText.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMore.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNotAllowed.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpEnd.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpVariable.isMatchHungry(target)) {
            $match$ = true;
        } else {
            return (false);
        }
        if (BtrExpElement.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMoreAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNonExistentAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpInterleave.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpAtomic.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpList.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpProduct.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpRef.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpText.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMore.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNotAllowed.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpEnd.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpVariable.isMatchHungry(target)) {
            $match$ = true;
        } else {
            return (false);
        }
        if (BtrExpElement.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMoreAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNonExistentAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpInterleave.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpAtomic.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpList.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpProduct.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpRef.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpText.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpOneOrMore.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpNotAllowed.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpEnd.isMatchHungry(target)) {
            $match$ = true;
        } else if (BtrExpVariable.isMatchHungry(target)) {
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
     * is valid for the <code>BtrExpInterleave</code>.
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
     * is valid for the <code>BtrExpInterleave</code>.
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
