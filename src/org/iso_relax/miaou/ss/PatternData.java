package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>PatternData</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="data">
 *   <ref name="type"/>
 *   <optional>
 *     <ref name="datatypeLibrary"/>
 *   </optional>
 *   <optional>
 *     <ref name="datatypeLibraryID"/>
 *   </optional>
 *   <zeroOrMore>
 *     <ref name="param"/>
 *   </zeroOrMore>
 *   <optional>
 *     <ref name="exceptPattern"/>
 *   </optional>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="data"&gt;
 *   &lt;ref name="type"/&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="datatypeLibrary"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="datatypeLibraryID"/&gt;
 *   &lt;/optional&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="param"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="exceptPattern"/&gt;
 *   &lt;/optional&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class PatternData implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode, IPatternChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://relaxng.org/ns/structure/1.0");
    private String type_;
    private String datatypeLibrary_;
    private Integer syntaxExtensionDatatypeLibraryID_;
    // List<Param>
    private java.util.List param_ = new java.util.ArrayList();
    private ExceptPattern exceptPattern_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>PatternData</code>.
     *
     */
    public PatternData() {
    }

    /**
     * Creates a <code>PatternData</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public PatternData(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>PatternData</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public PatternData(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>PatternData</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public PatternData(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>PatternData</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>PatternData</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>PatternData</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>PatternData</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>PatternData</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>PatternData</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternData(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>PatternData</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>PatternData</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>PatternData</code> by the Stack <code>stack</code>
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
        type_ = URelaxer.getAttributePropertyAsString(element, "type");
        datatypeLibrary_ = URelaxer.getAttributePropertyAsString(element, "datatypeLibrary");
        syntaxExtensionDatatypeLibraryID_ = URelaxer.getAttributePropertyAsIntObject(element, "syntaxExtension:datatypeLibraryID");
        param_.clear();
        while (!stack.isEmptyElement()) {
            if (Param.isMatch(stack)) {
                addParam(factory.createParam(stack));
            } else {
                break;
            }
        }
        if (ExceptPattern.isMatch(stack)) {
            setExceptPattern(factory.createExceptPattern(stack));
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
        Element element = doc.createElementNS("http://relaxng.org/ns/structure/1.0", "data");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByString(element, "type", this.type_);
        if (this.datatypeLibrary_ != null) {
            URelaxer.setAttributePropertyByString(element, "datatypeLibrary", this.datatypeLibrary_);
        }
        if (this.syntaxExtensionDatatypeLibraryID_ != null) {
            URelaxer.setAttributePropertyByInt(element, "syntaxExtension:datatypeLibraryID", this.syntaxExtensionDatatypeLibraryID_);
        }
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeElement(element);
        }
        if (this.exceptPattern_ != null) {
            this.exceptPattern_.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>PatternData</code> by the File <code>file</code>.
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
     * Initializes the <code>PatternData</code>
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
     * Initializes the <code>PatternData</code> by the URL <code>url</code>.
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
     * Initializes the <code>PatternData</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>PatternData</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>PatternData</code> by the Reader <code>reader</code>.
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
     * Gets the String property <b>type</b>.
     *
     * @return String
     */
    public final String getType() {
        return (type_);
    }

    /**
     * Sets the String property <b>type</b>.
     *
     * @param type
     */
    public final void setType(String type) {
        this.type_ = type;
    }

    /**
     * Gets the String property <b>datatypeLibrary</b>.
     *
     * @return String
     */
    public final String getDatatypeLibrary() {
        return (datatypeLibrary_);
    }

    /**
     * Sets the String property <b>datatypeLibrary</b>.
     *
     * @param datatypeLibrary
     */
    public final void setDatatypeLibrary(String datatypeLibrary) {
        this.datatypeLibrary_ = datatypeLibrary;
    }

    /**
     * Gets the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @exception IllegalStateException
     * @return int
     */
    public int getSyntaxExtensionDatatypeLibraryID() throws IllegalStateException {
        if (syntaxExtensionDatatypeLibraryID_ == null) {
            throw (new IllegalStateException("syntaxExtensionDatatypeLibraryID_"));
        }
        return (syntaxExtensionDatatypeLibraryID_.intValue());
    }

    /**
     * Gets the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @param syntaxExtensionDatatypeLibraryID
     * @return int
     */
    public int getSyntaxExtensionDatatypeLibraryID(int syntaxExtensionDatatypeLibraryID) {
        if (syntaxExtensionDatatypeLibraryID_ == null) {
            return(syntaxExtensionDatatypeLibraryID);
        }
        return (this.syntaxExtensionDatatypeLibraryID_.intValue());
    }

    /**
     * Gets the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @return Integer
     */
    public Integer getSyntaxExtensionDatatypeLibraryIDAsInteger() {
        return (syntaxExtensionDatatypeLibraryID_);
    }

    /**
     * Check the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @return boolean
     */
    public boolean checkSyntaxExtensionDatatypeLibraryID() {
        return (syntaxExtensionDatatypeLibraryID_ != null);
    }

    /**
     * Sets the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @param syntaxExtensionDatatypeLibraryID
     */
    public void setSyntaxExtensionDatatypeLibraryID(int syntaxExtensionDatatypeLibraryID) {
        this.syntaxExtensionDatatypeLibraryID_ = new Integer(syntaxExtensionDatatypeLibraryID);
    }

    /**
     * Sets the int property <b>syntaxExtensionDatatypeLibraryID</b>.
     *
     * @param syntaxExtensionDatatypeLibraryID
     */
    public void setSyntaxExtensionDatatypeLibraryID(Integer syntaxExtensionDatatypeLibraryID) {
        this.syntaxExtensionDatatypeLibraryID_ = syntaxExtensionDatatypeLibraryID;
    }

    /**
     * Gets the Param property <b>param</b>.
     *
     * @return Param[]
     */
    public final Param[] getParam() {
        Param[] array = new Param[param_.size()];
        return ((Param[])param_.toArray(array));
    }

    /**
     * Sets the Param property <b>param</b>.
     *
     * @param param
     */
    public final void setParam(Param[] param) {
        this.param_.clear();
        for (int i = 0;i < param.length;i++) {
            addParam(param[i]);
        }
        for (int i = 0;i < param.length;i++) {
            param[i].setParentRNode(this);
        }
        for (int i = 0;i < param.length;i++) {
            param[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the Param property <b>param</b>.
     *
     * @param param
     */
    public final void setParam(Param param) {
        this.param_.clear();
        addParam(param);
        if (param != null) {
            param.setParentRNode(this);
        }
        if (param != null) {
            param.setRContext(getRContext());
        }
    }

    /**
     * Adds the Param property <b>param</b>.
     *
     * @param param
     */
    public final void addParam(Param param) {
        this.param_.add(param);
        if (param != null) {
            param.setParentRNode(this);
        }
        if (param != null) {
            param.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the Param property <b>param</b>.
     *
     * @return int
     */
    public final int getParamCount() {
        return (param_.size());
    }

    /**
     * Gets the Param property <b>param</b> by index.
     *
     * @param index
     * @return Param
     */
    public final Param getParam(int index) {
        return ((Param)param_.get(index));
    }

    /**
     * Sets the Param property <b>param</b> by index.
     *
     * @param index
     * @param param
     */
    public final void setParam(int index, Param param) {
        this.param_.set(index, param);
    }

    /**
     * Adds the Param property <b>param</b> by index.
     *
     * @param index
     * @param param
     */
    public final void addParam(int index, Param param) {
        this.param_.add(index, param);
    }

    /**
     * Remove the Param property <b>param</b> by index.
     *
     * @param index
     */
    public final void removeParam(int index) {
        this.param_.remove(index);
    }

    /**
     * Remove the Param property <b>param</b> by object.
     *
     * @param param
     */
    public final void removeParam(Param param) {
        this.param_.remove(param);
    }

    /**
     * Clear the Param property <b>param</b>.
     *
     */
    public final void clearParam() {
        this.param_.clear();
    }

    /**
     * Gets the ExceptPattern property <b>exceptPattern</b>.
     *
     * @return ExceptPattern
     */
    public final ExceptPattern getExceptPattern() {
        return (exceptPattern_);
    }

    /**
     * Sets the ExceptPattern property <b>exceptPattern</b>.
     *
     * @param exceptPattern
     */
    public final void setExceptPattern(ExceptPattern exceptPattern) {
        this.exceptPattern_ = exceptPattern;
        if (exceptPattern != null) {
            exceptPattern.setParentRNode(this);
        }
        if (exceptPattern != null) {
            exceptPattern.setRContext(getRContext());
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
        URelaxer.makeQName(prefix, "data", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("type");
        buffer.append("=\"");
        buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getType())));
        buffer.append("\"");
        if (datatypeLibrary_ != null) {
            buffer.append(" ");
            buffer.append("datatypeLibrary");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getDatatypeLibrary())));
            buffer.append("\"");
        }
        if (syntaxExtensionDatatypeLibraryID_ != null) {
            buffer.append(" ");
            buffer.append("syntaxExtension:datatypeLibraryID");
            buffer.append("=\"");
            buffer.append(URelaxer.getString(getSyntaxExtensionDatatypeLibraryID()));
            buffer.append("\"");
        }
        buffer.append(">");
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeTextElement(buffer);
        }
        if (exceptPattern_ != null) {
            exceptPattern_.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "data", buffer);
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
        URelaxer.makeQName(prefix, "data", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("type");
        buffer.print("=\"");
        buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getType())));
        buffer.print("\"");
        if (datatypeLibrary_ != null) {
            buffer.print(" ");
            buffer.print("datatypeLibrary");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getDatatypeLibrary())));
            buffer.print("\"");
        }
        if (syntaxExtensionDatatypeLibraryID_ != null) {
            buffer.print(" ");
            buffer.print("syntaxExtension:datatypeLibraryID");
            buffer.print("=\"");
            buffer.print(URelaxer.getString(getSyntaxExtensionDatatypeLibraryID()));
            buffer.print("\"");
        }
        buffer.print(">");
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeTextElement(buffer);
        }
        if (exceptPattern_ != null) {
            exceptPattern_.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "data", buffer);
        buffer.print(">");
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getTypeAsString() {
        return (URelaxer.getString(getType()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getDatatypeLibraryAsString() {
        return (URelaxer.getString(getDatatypeLibrary()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSyntaxExtensionDatatypeLibraryIDAsString() {
        return (URelaxer.getString(getSyntaxExtensionDatatypeLibraryID()));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setTypeByString(String string) {
        setType(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setDatatypeLibraryByString(String string) {
        setDatatypeLibrary(URelaxer.getString(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSyntaxExtensionDatatypeLibraryIDByString(String string) {
        setSyntaxExtensionDatatypeLibraryID(Integer.parseInt(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setParamByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setParam(new Param(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setExceptPatternByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setExceptPattern(new ExceptPattern(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addParamByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addParam(new Param(string));
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
        classNodes.addAll(param_);
        if (exceptPattern_ != null) {
            classNodes.add(exceptPattern_);
        }
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
     * for the <code>PatternData</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://relaxng.org/ns/structure/1.0", "data")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("type")) {
            return (false);
        }
        $match$ = true;
        while (!target.isEmptyElement()) {
            if (!Param.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        if (ExceptPattern.isMatchHungry(target)) {
        }
        $match$ = true;
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>PatternData</code>.
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
     * is valid for the <code>PatternData</code>.
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
