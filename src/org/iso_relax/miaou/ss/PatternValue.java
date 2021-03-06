package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>PatternValue</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="value">
 *   <ref name="type"/>
 *   <optional>
 *     <ref name="datatypeLibrary"/>
 *   </optional>
 *   <optional>
 *     <ref name="datatypeLibraryID"/>
 *   </optional>
 *   <optional>
 *     <ref name="ns"/>
 *   </optional>
 *   <optional>
 *     <ref name="nsID"/>
 *   </optional>
 *   <data type="string"/>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="value"&gt;
 *   &lt;ref name="type"/&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="datatypeLibrary"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="datatypeLibraryID"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="ns"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;ref name="nsID"/&gt;
 *   &lt;/optional&gt;
 *   &lt;data type="string"/&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class PatternValue implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode, IPatternChoice {
    private RNSContext rNSContext_ = new RNSContext(this, "http://relaxng.org/ns/structure/1.0");
    private String content_;
    private String type_;
    private String datatypeLibrary_;
    private Integer syntaxExtensionDatatypeLibraryID_;
    private String ns_;
    private Integer syntaxExtensionNsID_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>PatternValue</code>.
     *
     */
    public PatternValue() {
    }

    /**
     * Creates a <code>PatternValue</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public PatternValue(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>PatternValue</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public PatternValue(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>PatternValue</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public PatternValue(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>PatternValue</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>PatternValue</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>PatternValue</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>PatternValue</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>PatternValue</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>PatternValue</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public PatternValue(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>PatternValue</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>PatternValue</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>PatternValue</code> by the Stack <code>stack</code>
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
        content_ = URelaxer.getElementPropertyAsString(element);
        type_ = URelaxer.getAttributePropertyAsString(element, "type");
        datatypeLibrary_ = URelaxer.getAttributePropertyAsString(element, "datatypeLibrary");
        syntaxExtensionDatatypeLibraryID_ = URelaxer.getAttributePropertyAsIntObject(element, "syntaxExtension:datatypeLibraryID");
        ns_ = URelaxer.getAttributePropertyAsString(element, "ns");
        syntaxExtensionNsID_ = URelaxer.getAttributePropertyAsIntObject(element, "syntaxExtension:nsID");
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
        Element element = doc.createElementNS("http://relaxng.org/ns/structure/1.0", "value");
        rNSContext_.setupNamespace(element);
        URelaxer.setElementPropertyByString(element, this.content_);
        int size;
        URelaxer.setAttributePropertyByString(element, "type", this.type_);
        if (this.datatypeLibrary_ != null) {
            URelaxer.setAttributePropertyByString(element, "datatypeLibrary", this.datatypeLibrary_);
        }
        if (this.syntaxExtensionDatatypeLibraryID_ != null) {
            URelaxer.setAttributePropertyByInt(element, "syntaxExtension:datatypeLibraryID", this.syntaxExtensionDatatypeLibraryID_);
        }
        if (this.ns_ != null) {
            URelaxer.setAttributePropertyByString(element, "ns", this.ns_);
        }
        if (this.syntaxExtensionNsID_ != null) {
            URelaxer.setAttributePropertyByInt(element, "syntaxExtension:nsID", this.syntaxExtensionNsID_);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>PatternValue</code> by the File <code>file</code>.
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
     * Initializes the <code>PatternValue</code>
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
     * Initializes the <code>PatternValue</code> by the URL <code>url</code>.
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
     * Initializes the <code>PatternValue</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>PatternValue</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>PatternValue</code> by the Reader <code>reader</code>.
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
     * Gets the String property <b>content</b>.
     *
     * @return String
     */
    public final String getContent() {
        return (content_);
    }

    /**
     * Sets the String property <b>content</b>.
     *
     * @param content
     */
    public final void setContent(String content) {
        this.content_ = content;
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
     * Gets the String property <b>ns</b>.
     *
     * @return String
     */
    public final String getNs() {
        return (ns_);
    }

    /**
     * Sets the String property <b>ns</b>.
     *
     * @param ns
     */
    public final void setNs(String ns) {
        this.ns_ = ns;
    }

    /**
     * Gets the int property <b>syntaxExtensionNsID</b>.
     *
     * @exception IllegalStateException
     * @return int
     */
    public int getSyntaxExtensionNsID() throws IllegalStateException {
        if (syntaxExtensionNsID_ == null) {
            throw (new IllegalStateException("syntaxExtensionNsID_"));
        }
        return (syntaxExtensionNsID_.intValue());
    }

    /**
     * Gets the int property <b>syntaxExtensionNsID</b>.
     *
     * @param syntaxExtensionNsID
     * @return int
     */
    public int getSyntaxExtensionNsID(int syntaxExtensionNsID) {
        if (syntaxExtensionNsID_ == null) {
            return(syntaxExtensionNsID);
        }
        return (this.syntaxExtensionNsID_.intValue());
    }

    /**
     * Gets the int property <b>syntaxExtensionNsID</b>.
     *
     * @return Integer
     */
    public Integer getSyntaxExtensionNsIDAsInteger() {
        return (syntaxExtensionNsID_);
    }

    /**
     * Check the int property <b>syntaxExtensionNsID</b>.
     *
     * @return boolean
     */
    public boolean checkSyntaxExtensionNsID() {
        return (syntaxExtensionNsID_ != null);
    }

    /**
     * Sets the int property <b>syntaxExtensionNsID</b>.
     *
     * @param syntaxExtensionNsID
     */
    public void setSyntaxExtensionNsID(int syntaxExtensionNsID) {
        this.syntaxExtensionNsID_ = new Integer(syntaxExtensionNsID);
    }

    /**
     * Sets the int property <b>syntaxExtensionNsID</b>.
     *
     * @param syntaxExtensionNsID
     */
    public void setSyntaxExtensionNsID(Integer syntaxExtensionNsID) {
        this.syntaxExtensionNsID_ = syntaxExtensionNsID;
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
        URelaxer.makeQName(prefix, "value", buffer);
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
        if (ns_ != null) {
            buffer.append(" ");
            buffer.append("ns");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getNs())));
            buffer.append("\"");
        }
        if (syntaxExtensionNsID_ != null) {
            buffer.append(" ");
            buffer.append("syntaxExtension:nsID");
            buffer.append("=\"");
            buffer.append(URelaxer.getString(getSyntaxExtensionNsID()));
            buffer.append("\"");
        }
        buffer.append(">");
        buffer.append(URelaxer.escapeCharData(URelaxer.getString(getContent())));
        buffer.append("</");
        URelaxer.makeQName(prefix, "value", buffer);
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
        URelaxer.makeQName(prefix, "value", buffer);
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
        if (ns_ != null) {
            buffer.print(" ");
            buffer.print("ns");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getNs())));
            buffer.print("\"");
        }
        if (syntaxExtensionNsID_ != null) {
            buffer.print(" ");
            buffer.print("syntaxExtension:nsID");
            buffer.print("=\"");
            buffer.print(URelaxer.getString(getSyntaxExtensionNsID()));
            buffer.print("\"");
        }
        buffer.print(">");
        buffer.print(URelaxer.escapeCharData(URelaxer.getString(getContent())));
        buffer.print("</");
        URelaxer.makeQName(prefix, "value", buffer);
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
     * Gets the property value as String.
     *
     * @return String
     */
    public String getNsAsString() {
        return (URelaxer.getString(getNs()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSyntaxExtensionNsIDAsString() {
        return (URelaxer.getString(getSyntaxExtensionNsID()));
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
     */
    public void setNsByString(String string) {
        setNs(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSyntaxExtensionNsIDByString(String string) {
        setSyntaxExtensionNsID(Integer.parseInt(string));
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
     * for the <code>PatternValue</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://relaxng.org/ns/structure/1.0", "value")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("type")) {
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
     * is valid for the <code>PatternValue</code>.
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
     * is valid for the <code>PatternValue</code>.
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
