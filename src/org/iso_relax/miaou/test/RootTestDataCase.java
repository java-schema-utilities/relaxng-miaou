package org.iso_relax.miaou.test;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>RootTestDataCase</b> is generated from testData.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="case">
 *   <optional>
 *     <attribute name="rnc"/>
 *   </optional>
 *   <optional>
 *     <attribute name="rng"/>
 *   </optional>
 *   <optional>
 *     <attribute name="ss"/>
 *   </optional>
 *   <optional>
 *     <attribute name="nss"/>
 *   </optional>
 *   <optional>
 *     <attribute name="btg"/>
 *   </optional>
 *   <optional>
 *     <attribute name="bta"/>
 *   </optional>
 *   <optional>
 *     <attribute name="cbta"/>
 *   </optional>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="case"&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="rnc"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="rng"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="ss"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="nss"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="btg"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="bta"/&gt;
 *   &lt;/optional&gt;
 *   &lt;optional&gt;
 *     &lt;attribute name="cbta"/&gt;
 *   &lt;/optional&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version testData.rng (Sat Oct 19 02:27:05 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RootTestDataCase implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "");
    private String rnc_;
    private String rng_;
    private String ss_;
    private String nss_;
    private String btg_;
    private String bta_;
    private String cbta_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>RootTestDataCase</code>.
     *
     */
    public RootTestDataCase() {
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public RootTestDataCase(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public RootTestDataCase(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public RootTestDataCase(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>RootTestDataCase</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>RootTestDataCase</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public RootTestDataCase(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>RootTestDataCase</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>RootTestDataCase</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>RootTestDataCase</code> by the Stack <code>stack</code>
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
        rnc_ = URelaxer.getAttributePropertyAsString(element, "rnc");
        rng_ = URelaxer.getAttributePropertyAsString(element, "rng");
        ss_ = URelaxer.getAttributePropertyAsString(element, "ss");
        nss_ = URelaxer.getAttributePropertyAsString(element, "nss");
        btg_ = URelaxer.getAttributePropertyAsString(element, "btg");
        bta_ = URelaxer.getAttributePropertyAsString(element, "bta");
        cbta_ = URelaxer.getAttributePropertyAsString(element, "cbta");
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
        Element element = doc.createElement("case");
        int size;
        if (this.rnc_ != null) {
            URelaxer.setAttributePropertyByString(element, "rnc", this.rnc_);
        }
        if (this.rng_ != null) {
            URelaxer.setAttributePropertyByString(element, "rng", this.rng_);
        }
        if (this.ss_ != null) {
            URelaxer.setAttributePropertyByString(element, "ss", this.ss_);
        }
        if (this.nss_ != null) {
            URelaxer.setAttributePropertyByString(element, "nss", this.nss_);
        }
        if (this.btg_ != null) {
            URelaxer.setAttributePropertyByString(element, "btg", this.btg_);
        }
        if (this.bta_ != null) {
            URelaxer.setAttributePropertyByString(element, "bta", this.bta_);
        }
        if (this.cbta_ != null) {
            URelaxer.setAttributePropertyByString(element, "cbta", this.cbta_);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>RootTestDataCase</code> by the File <code>file</code>.
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
     * Initializes the <code>RootTestDataCase</code>
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
     * Initializes the <code>RootTestDataCase</code> by the URL <code>url</code>.
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
     * Initializes the <code>RootTestDataCase</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>RootTestDataCase</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>RootTestDataCase</code> by the Reader <code>reader</code>.
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
     * Gets the String property <b>rnc</b>.
     *
     * @return String
     */
    public final String getRnc() {
        return (rnc_);
    }

    /**
     * Sets the String property <b>rnc</b>.
     *
     * @param rnc
     */
    public final void setRnc(String rnc) {
        this.rnc_ = rnc;
    }

    /**
     * Gets the String property <b>rng</b>.
     *
     * @return String
     */
    public final String getRng() {
        return (rng_);
    }

    /**
     * Sets the String property <b>rng</b>.
     *
     * @param rng
     */
    public final void setRng(String rng) {
        this.rng_ = rng;
    }

    /**
     * Gets the String property <b>ss</b>.
     *
     * @return String
     */
    public final String getSs() {
        return (ss_);
    }

    /**
     * Sets the String property <b>ss</b>.
     *
     * @param ss
     */
    public final void setSs(String ss) {
        this.ss_ = ss;
    }

    /**
     * Gets the String property <b>nss</b>.
     *
     * @return String
     */
    public final String getNss() {
        return (nss_);
    }

    /**
     * Sets the String property <b>nss</b>.
     *
     * @param nss
     */
    public final void setNss(String nss) {
        this.nss_ = nss;
    }

    /**
     * Gets the String property <b>btg</b>.
     *
     * @return String
     */
    public final String getBtg() {
        return (btg_);
    }

    /**
     * Sets the String property <b>btg</b>.
     *
     * @param btg
     */
    public final void setBtg(String btg) {
        this.btg_ = btg;
    }

    /**
     * Gets the String property <b>bta</b>.
     *
     * @return String
     */
    public final String getBta() {
        return (bta_);
    }

    /**
     * Sets the String property <b>bta</b>.
     *
     * @param bta
     */
    public final void setBta(String bta) {
        this.bta_ = bta;
    }

    /**
     * Gets the String property <b>cbta</b>.
     *
     * @return String
     */
    public final String getCbta() {
        return (cbta_);
    }

    /**
     * Sets the String property <b>cbta</b>.
     *
     * @param cbta
     */
    public final void setCbta(String cbta) {
        this.cbta_ = cbta;
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
        URelaxer.makeQName(prefix, "case", buffer);
        rNSContext_.makeNSMappings(buffer);
        if (rnc_ != null) {
            buffer.append(" ");
            buffer.append("rnc");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getRnc())));
            buffer.append("\"");
        }
        if (rng_ != null) {
            buffer.append(" ");
            buffer.append("rng");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getRng())));
            buffer.append("\"");
        }
        if (ss_ != null) {
            buffer.append(" ");
            buffer.append("ss");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getSs())));
            buffer.append("\"");
        }
        if (nss_ != null) {
            buffer.append(" ");
            buffer.append("nss");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getNss())));
            buffer.append("\"");
        }
        if (btg_ != null) {
            buffer.append(" ");
            buffer.append("btg");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getBtg())));
            buffer.append("\"");
        }
        if (bta_ != null) {
            buffer.append(" ");
            buffer.append("bta");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getBta())));
            buffer.append("\"");
        }
        if (cbta_ != null) {
            buffer.append(" ");
            buffer.append("cbta");
            buffer.append("=\"");
            buffer.append(URelaxer.escapeAttrQuot(URelaxer.getString(getCbta())));
            buffer.append("\"");
        }
        buffer.append(">");
        buffer.append("</");
        URelaxer.makeQName(prefix, "case", buffer);
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
        URelaxer.makeQName(prefix, "case", buffer);
        rNSContext_.makeNSMappings(buffer);
        if (rnc_ != null) {
            buffer.print(" ");
            buffer.print("rnc");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getRnc())));
            buffer.print("\"");
        }
        if (rng_ != null) {
            buffer.print(" ");
            buffer.print("rng");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getRng())));
            buffer.print("\"");
        }
        if (ss_ != null) {
            buffer.print(" ");
            buffer.print("ss");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getSs())));
            buffer.print("\"");
        }
        if (nss_ != null) {
            buffer.print(" ");
            buffer.print("nss");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getNss())));
            buffer.print("\"");
        }
        if (btg_ != null) {
            buffer.print(" ");
            buffer.print("btg");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getBtg())));
            buffer.print("\"");
        }
        if (bta_ != null) {
            buffer.print(" ");
            buffer.print("bta");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getBta())));
            buffer.print("\"");
        }
        if (cbta_ != null) {
            buffer.print(" ");
            buffer.print("cbta");
            buffer.print("=\"");
            buffer.print(URelaxer.escapeAttrQuot(URelaxer.getString(getCbta())));
            buffer.print("\"");
        }
        buffer.print(">");
        buffer.print("</");
        URelaxer.makeQName(prefix, "case", buffer);
        buffer.print(">");
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getRncAsString() {
        return (URelaxer.getString(getRnc()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getRngAsString() {
        return (URelaxer.getString(getRng()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getSsAsString() {
        return (URelaxer.getString(getSs()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getNssAsString() {
        return (URelaxer.getString(getNss()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getBtgAsString() {
        return (URelaxer.getString(getBtg()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getBtaAsString() {
        return (URelaxer.getString(getBta()));
    }

    /**
     * Gets the property value as String.
     *
     * @return String
     */
    public String getCbtaAsString() {
        return (URelaxer.getString(getCbta()));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setRncByString(String string) {
        setRnc(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setRngByString(String string) {
        setRng(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setSsByString(String string) {
        setSs(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setNssByString(String string) {
        setNss(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setBtgByString(String string) {
        setBtg(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setBtaByString(String string) {
        setBta(string);
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     */
    public void setCbtaByString(String string) {
        setCbta(string);
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
     * for the <code>RootTestDataCase</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "", "case")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        if (!target.isEmptyElement()) {
            return (false);
        }
        return (true);
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>RootTestDataCase</code>.
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
     * is valid for the <code>RootTestDataCase</code>.
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
