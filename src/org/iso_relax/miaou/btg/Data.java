package org.iso_relax.miaou.btg;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>Data</b> is generated from binaryTreeGrammar.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="Data">
 *   <ref name="type"/>
 *   <ref name="datatypeLibrary"/>
 *   <zeroOrMore>
 *     <ref name="param"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <choice>
 *       <ref name="Data"/>
 *       <ref name="Value"/>
 *     </choice>
 *   </zeroOrMore>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="Data"&gt;
 *   &lt;ref name="type"/&gt;
 *   &lt;ref name="datatypeLibrary"/&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="param"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;choice&gt;
 *       &lt;ref name="Data"/&gt;
 *       &lt;ref name="Value"/&gt;
 *     &lt;/choice&gt;
 *   &lt;/zeroOrMore&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeGrammar.rng (Sat Oct 19 02:26:53 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class Data implements java.io.Serializable, IRNSContainer, IDataChoice, IRNode, IBtrExpAtomicChoice1 {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar");
    private String type_;
    private int datatypeLibrary_;
    // List<Param>
    private java.util.List param_ = new java.util.ArrayList();
    // List<IDataChoice>
    private java.util.List content_ = new java.util.ArrayList();
    private IRNode parentRNode_;

    /**
     * Creates a <code>Data</code>.
     *
     */
    public Data() {
    }

    /**
     * Creates a <code>Data</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public Data(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>Data</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public Data(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>Data</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public Data(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>Data</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>Data</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>Data</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>Data</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>Data</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>Data</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public Data(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>Data</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>Data</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>Data</code> by the Stack <code>stack</code>
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
        type_ = URelaxer.getAttributePropertyAsString(element, "type");
        datatypeLibrary_ = URelaxer.getAttributePropertyAsInt(element, "datatypeLibrary");
        param_.clear();
        while (!stack.isEmptyElement()) {
            if (Param.isMatch(stack)) {
                addParam(factory.createParam(stack));
            } else {
                break;
            }
        }
        content_.clear();
        while (!stack.isEmptyElement()) {
            if (Data.isMatch(stack)) {
                addContent(factory.createData(stack));
            } else if (Value.isMatch(stack)) {
                addContent(factory.createValue(stack));
            } else {
                if (!URelaxer2.consumeElement(stack, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar")) {
                    break;
        }
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "Data");
        rNSContext_.setupNamespace(element);
        int size;
        URelaxer.setAttributePropertyByString(element, "type", this.type_);
        URelaxer.setAttributePropertyByInt(element, "datatypeLibrary", this.datatypeLibrary_);
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeElement(element);
        }
        size = this.content_.size();
        for (int i = 0;i < size;i++) {
            IDataChoice value = (IDataChoice)this.content_.get(i);
            value.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>Data</code> by the File <code>file</code>.
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
     * Initializes the <code>Data</code>
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
     * Initializes the <code>Data</code> by the URL <code>url</code>.
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
     * Initializes the <code>Data</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>Data</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>Data</code> by the Reader <code>reader</code>.
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
     * Gets the int property <b>datatypeLibrary</b>.
     *
     * @return int
     */
    public final int getDatatypeLibrary() {
        return (datatypeLibrary_);
    }

    /**
     * Sets the int property <b>datatypeLibrary</b>.
     *
     * @param datatypeLibrary
     */
    public final void setDatatypeLibrary(int datatypeLibrary) {
        this.datatypeLibrary_ = datatypeLibrary;
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
     * Gets the IDataChoice property <b>content</b>.
     *
     * @return IDataChoice[]
     */
    public final IDataChoice[] getContent() {
        IDataChoice[] array = new IDataChoice[content_.size()];
        return ((IDataChoice[])content_.toArray(array));
    }

    /**
     * Sets the IDataChoice property <b>content</b>.
     *
     * @param content
     */
    public final void setContent(IDataChoice[] content) {
        this.content_.clear();
        for (int i = 0;i < content.length;i++) {
            addContent(content[i]);
        }
        for (int i = 0;i < content.length;i++) {
            content[i].setParentRNode(this);
        }
    }

    /**
     * Sets the IDataChoice property <b>content</b>.
     *
     * @param content
     */
    public final void setContent(IDataChoice content) {
        this.content_.clear();
        addContent(content);
        if (content != null) {
            content.setParentRNode(this);
        }
    }

    /**
     * Adds the IDataChoice property <b>content</b>.
     *
     * @param content
     */
    public final void addContent(IDataChoice content) {
        this.content_.add(content);
        if (content != null) {
            content.setParentRNode(this);
        }
    }

    /**
     * Gets number of the IDataChoice property <b>content</b>.
     *
     * @return int
     */
    public final int getContentCount() {
        return (content_.size());
    }

    /**
     * Gets the IDataChoice property <b>content</b> by index.
     *
     * @param index
     * @return IDataChoice
     */
    public final IDataChoice getContent(int index) {
        return ((IDataChoice)content_.get(index));
    }

    /**
     * Sets the IDataChoice property <b>content</b> by index.
     *
     * @param index
     * @param content
     */
    public final void setContent(int index, IDataChoice content) {
        this.content_.set(index, content);
    }

    /**
     * Adds the IDataChoice property <b>content</b> by index.
     *
     * @param index
     * @param content
     */
    public final void addContent(int index, IDataChoice content) {
        this.content_.add(index, content);
    }

    /**
     * Remove the IDataChoice property <b>content</b> by index.
     *
     * @param index
     */
    public final void removeContent(int index) {
        this.content_.remove(index);
    }

    /**
     * Remove the IDataChoice property <b>content</b> by object.
     *
     * @param content
     */
    public final void removeContent(IDataChoice content) {
        this.content_.remove(content);
    }

    /**
     * Clear the IDataChoice property <b>content</b>.
     *
     */
    public final void clearContent() {
        this.content_.clear();
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
        URelaxer.makeQName(prefix, "Data", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(" ");
        buffer.append("type");
        buffer.append("=\"");
        buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getType())));
        buffer.append("\"");
        buffer.append(" ");
        buffer.append("datatypeLibrary");
        buffer.append("=\"");
        buffer.append(URelaxer.getString(getDatatypeLibrary()));
        buffer.append("\"");
        buffer.append(">");
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.content_.size();
        for (int i = 0;i < size;i++) {
            IDataChoice value = (IDataChoice)this.content_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "Data", buffer);
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
        URelaxer.makeQName(prefix, "Data", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(" ");
        buffer.print("type");
        buffer.print("=\"");
        buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getType())));
        buffer.print("\"");
        buffer.print(" ");
        buffer.print("datatypeLibrary");
        buffer.print("=\"");
        buffer.print(URelaxer.getString(getDatatypeLibrary()));
        buffer.print("\"");
        buffer.print(">");
        size = this.param_.size();
        for (int i = 0;i < size;i++) {
            Param value = (Param)this.param_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.content_.size();
        for (int i = 0;i < size;i++) {
            IDataChoice value = (IDataChoice)this.content_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "Data", buffer);
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
        setDatatypeLibrary(Integer.parseInt(string));
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
        classNodes.addAll(content_);
        IRNode[] nodes = new IRNode[classNodes.size()];
        return ((IRNode[])classNodes.toArray(nodes));
    }

    /**
     * Tests if a Element <code>element</code> is valid
     * for the <code>Data</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar", "Data")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.hasAttributeHungry("type")) {
            return (false);
        }
        $match$ = true;
        if (!target.hasAttributeHungry("datatypeLibrary")) {
            return (false);
        }
        $match$ = true;
        while (!target.isEmptyElement()) {
            if (!Param.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (Data.isMatchHungry(target)) {
                $match$ = true;
            } else if (Value.isMatchHungry(target)) {
                $match$ = true;
            } else {
                if (!URelaxer2.consumeElement(target, "http://www.iso_relax.org/xmlns/miaou/binaryTreeGrammar")) {
                    break;
        }
            }
        }
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>Data</code>.
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
     * is valid for the <code>Data</code>.
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
