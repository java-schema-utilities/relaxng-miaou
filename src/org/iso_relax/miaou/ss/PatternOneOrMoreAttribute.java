package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>PatternOneOrMoreAttribute</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="syntaxExtension:oneOrMoreAttribute">
 *   <ref name="nameClassID"/>
 *   <ref name="pattern"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="syntaxExtension:oneOrMoreAttribute"&gt;
 *   &lt;ref name="nameClassID"/&gt;
 *   &lt;ref name="pattern"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class PatternOneOrMoreAttribute implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode, IPatternChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/syntaxExtension");
    private int syntaxExtensionNc_;
    private IPatternChoice pattern_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code>.
     *
     */
    public PatternOneOrMoreAttribute() {
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public PatternOneOrMoreAttribute(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public PatternOneOrMoreAttribute(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public PatternOneOrMoreAttribute(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>PatternOneOrMoreAttribute</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternOneOrMoreAttribute(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the Stack <code>stack</code>
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
        if (PatternData.isMatch(stack)) {
            setPattern(factory.createPatternData(stack));
        } else if (PatternAttribute.isMatch(stack)) {
            setPattern(factory.createPatternAttribute(stack));
        } else if (PatternOneOrMoreAttribute.isMatch(stack)) {
            setPattern(factory.createPatternOneOrMoreAttribute(stack));
        } else if (PatternNonExistentAttribute.isMatch(stack)) {
            setPattern(factory.createPatternNonExistentAttribute(stack));
        } else if (PatternChoice.isMatch(stack)) {
            setPattern(factory.createPatternChoice(stack));
        } else if (PatternGroup.isMatch(stack)) {
            setPattern(factory.createPatternGroup(stack));
        } else if (PatternInterleave.isMatch(stack)) {
            setPattern(factory.createPatternInterleave(stack));
        } else if (PatternValue.isMatch(stack)) {
            setPattern(factory.createPatternValue(stack));
        } else if (PatternList.isMatch(stack)) {
            setPattern(factory.createPatternList(stack));
        } else if (PatternRef.isMatch(stack)) {
            setPattern(factory.createPatternRef(stack));
        } else if (PatternOneOrMore.isMatch(stack)) {
            setPattern(factory.createPatternOneOrMore(stack));
        } else if (PatternNotAllowed.isMatch(stack)) {
            setPattern(factory.createPatternNotAllowed(stack));
        } else if (PatternEmpty.isMatch(stack)) {
            setPattern(factory.createPatternEmpty(stack));
        } else if (PatternText.isMatch(stack)) {
            setPattern(factory.createPatternText(stack));
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/syntaxExtension", "oneOrMoreAttribute");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByInt(element, "syntaxExtension:nc", this.syntaxExtensionNc_);
        this.pattern_.makeElement(element);
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the File <code>file</code>.
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
     * Initializes the <code>PatternOneOrMoreAttribute</code>
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
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the URL <code>url</code>.
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
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>PatternOneOrMoreAttribute</code> by the Reader <code>reader</code>.
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
     * Gets the IPatternChoice property <b>pattern</b>.
     *
     * @return IPatternChoice
     */
    public final IPatternChoice getPattern() {
        return (pattern_);
    }

    /**
     * Sets the IPatternChoice property <b>pattern</b>.
     *
     * @param pattern
     */
    public final void setPattern(IPatternChoice pattern) {
        this.pattern_ = pattern;
        if (pattern != null) {
            pattern.setParentRNode(this);
        }
        if (pattern != null) {
            pattern.setRContext(getRContext());
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
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/syntaxExtension");
        buffer.append("<");
        URelaxer.makeQName(prefix, "oneOrMoreAttribute", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("syntaxExtension:nc");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getSyntaxExtensionNc()));
        buffer.append("\"");
        buffer.append(">");
        pattern_.makeTextElement(buffer);
        buffer.append("</");
        URelaxer.makeQName(prefix, "oneOrMoreAttribute", buffer);
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
        URelaxer.makeQName(prefix, "oneOrMoreAttribute", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("syntaxExtension:nc");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getSyntaxExtensionNc()));
        buffer.print("\"");
        buffer.print(">");
        pattern_.makeTextElement(buffer);
        buffer.print("</");
        URelaxer.makeQName(prefix, "oneOrMoreAttribute", buffer);
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
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSyntaxExtensionNcByString(String string) {
        setSyntaxExtensionNc(Integer.parseInt(string));
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
        classNodes.add(pattern_);
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
     * for the <code>PatternOneOrMoreAttribute</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/syntaxExtension", "oneOrMoreAttribute")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("syntaxExtension:nc")) {
            return (false);
        }
        $match$ = true;
        if (PatternData.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternOneOrMoreAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternNonExistentAttribute.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternChoice.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternGroup.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternInterleave.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternValue.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternList.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternRef.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternOneOrMore.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternNotAllowed.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternEmpty.isMatchHungry(target)) {
            $match$ = true;
        } else if (PatternText.isMatchHungry(target)) {
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
     * is valid for the <code>PatternOneOrMoreAttribute</code>.
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
     * is valid for the <code>PatternOneOrMoreAttribute</code>.
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
