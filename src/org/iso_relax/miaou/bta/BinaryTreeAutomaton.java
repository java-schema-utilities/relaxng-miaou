package org.iso_relax.miaou.bta;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>BinaryTreeAutomaton</b> is generated from binaryTreeAutomaton.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <element name="binaryTreeAutomaton">
 *   <zeroOrMore>
 *     <ref name="finalTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="startTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="elementTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="textTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="branchingTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="mergingTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="oneOrMoreAttributeTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="nonExistentAttributeTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="atomicTransition"/>
 *   </zeroOrMore>
 *   <zeroOrMore>
 *     <ref name="listTransition"/>
 *   </zeroOrMore>
 * </element>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;element name="binaryTreeAutomaton"&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="finalTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="startTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="elementTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="textTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="branchingTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="mergingTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="oneOrMoreAttributeTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="nonExistentAttributeTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="atomicTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 *   &lt;zeroOrMore&gt;
 *     &lt;ref name="listTransition"/&gt;
 *   &lt;/zeroOrMore&gt;
 * &lt;/element&gt;
 * </pre>
 *
 * @version binaryTreeAutomaton.rng (Sat Oct 19 02:26:41 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class BinaryTreeAutomaton implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
    // List<FinalTransition>
    private java.util.List finalTransition_ = new java.util.ArrayList();
    // List<StartTransition>
    private java.util.List startTransition_ = new java.util.ArrayList();
    // List<ElementTransition>
    private java.util.List elementTransition_ = new java.util.ArrayList();
    // List<TextTransition>
    private java.util.List textTransition_ = new java.util.ArrayList();
    // List<BranchingTransition>
    private java.util.List branchingTransition_ = new java.util.ArrayList();
    // List<MergingTransition>
    private java.util.List mergingTransition_ = new java.util.ArrayList();
    // List<OneOrMoreAttributeTransition>
    private java.util.List oneOrMoreAttributeTransition_ = new java.util.ArrayList();
    // List<NonExistentAttributeTransition>
    private java.util.List nonExistentAttributeTransition_ = new java.util.ArrayList();
    // List<AtomicTransition>
    private java.util.List atomicTransition_ = new java.util.ArrayList();
    // List<ListTransition>
    private java.util.List listTransition_ = new java.util.ArrayList();
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>BinaryTreeAutomaton</code>.
     *
     */
    public BinaryTreeAutomaton() {
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public BinaryTreeAutomaton(RStack stack) {
        setup(stack);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public BinaryTreeAutomaton(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public BinaryTreeAutomaton(Element element) {
        setup(element);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the File <code>file</code>.
     *
     * @param file
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(File file) throws IOException, SAXException, ParserConfigurationException {
        setup(file);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code>
     * by the String representation of URI <code>uri</code>.
     *
     * @param uri
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(String uri) throws IOException, SAXException, ParserConfigurationException {
        setup(uri);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the URL <code>url</code>.
     *
     * @param url
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(URL url) throws IOException, SAXException, ParserConfigurationException {
        setup(url);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the InputStream <code>in</code>.
     *
     * @param in
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(InputStream in) throws IOException, SAXException, ParserConfigurationException {
        setup(in);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the InputSource <code>is</code>.
     *
     * @param is
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(InputSource is) throws IOException, SAXException, ParserConfigurationException {
        setup(is);
    }

    /**
     * Creates a <code>BinaryTreeAutomaton</code> by the Reader <code>reader</code>.
     *
     * @param reader
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public BinaryTreeAutomaton(Reader reader) throws IOException, SAXException, ParserConfigurationException {
        setup(reader);
    }

    /**
     * Initializes the <code>BinaryTreeAutomaton</code> by the Document <code>doc</code>.
     *
     * @param doc
     */
    public void setup(Document doc) {
        setup(doc.getDocumentElement());
    }

    /**
     * Initializes the <code>BinaryTreeAutomaton</code> by the Element <code>element</code>.
     *
     * @param element
     */
    public void setup(Element element) {
        init(element);
    }

    /**
     * Initializes the <code>BinaryTreeAutomaton</code> by the Stack <code>stack</code>
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
        IBinaryTreeAutomatonFactory factory = BinaryTreeAutomatonFactory.getFactory();
        RStack stack = new RStack(element);
        rNSContext_.declareNamespace(element);
        finalTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (FinalTransition.isMatch(stack)) {
                addFinalTransition(factory.createFinalTransition(stack));
            } else {
                break;
            }
        }
        startTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (StartTransition.isMatch(stack)) {
                addStartTransition(factory.createStartTransition(stack));
            } else {
                break;
            }
        }
        elementTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (ElementTransition.isMatch(stack)) {
                addElementTransition(factory.createElementTransition(stack));
            } else {
                break;
            }
        }
        textTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (TextTransition.isMatch(stack)) {
                addTextTransition(factory.createTextTransition(stack));
            } else {
                break;
            }
        }
        branchingTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (BranchingTransition.isMatch(stack)) {
                addBranchingTransition(factory.createBranchingTransition(stack));
            } else {
                break;
            }
        }
        mergingTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (MergingTransition.isMatch(stack)) {
                addMergingTransition(factory.createMergingTransition(stack));
            } else {
                break;
            }
        }
        oneOrMoreAttributeTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (OneOrMoreAttributeTransition.isMatch(stack)) {
                addOneOrMoreAttributeTransition(factory.createOneOrMoreAttributeTransition(stack));
            } else {
                break;
            }
        }
        nonExistentAttributeTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (NonExistentAttributeTransition.isMatch(stack)) {
                addNonExistentAttributeTransition(factory.createNonExistentAttributeTransition(stack));
            } else {
                break;
            }
        }
        atomicTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (AtomicTransition.isMatch(stack)) {
                addAtomicTransition(factory.createAtomicTransition(stack));
            } else {
                break;
            }
        }
        listTransition_.clear();
        while (!stack.isEmptyElement()) {
            if (ListTransition.isMatch(stack)) {
                addListTransition(factory.createListTransition(stack));
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
        Element element = doc.createElementNS("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "binaryTreeAutomaton");
        rNSContext_.setupNamespace(element);
        int size;
        size = this.finalTransition_.size();
        for (int i = 0;i < size;i++) {
            FinalTransition value = (FinalTransition)this.finalTransition_.get(i);
            value.makeElement(element);
        }
        size = this.startTransition_.size();
        for (int i = 0;i < size;i++) {
            StartTransition value = (StartTransition)this.startTransition_.get(i);
            value.makeElement(element);
        }
        size = this.elementTransition_.size();
        for (int i = 0;i < size;i++) {
            ElementTransition value = (ElementTransition)this.elementTransition_.get(i);
            value.makeElement(element);
        }
        size = this.textTransition_.size();
        for (int i = 0;i < size;i++) {
            TextTransition value = (TextTransition)this.textTransition_.get(i);
            value.makeElement(element);
        }
        size = this.branchingTransition_.size();
        for (int i = 0;i < size;i++) {
            BranchingTransition value = (BranchingTransition)this.branchingTransition_.get(i);
            value.makeElement(element);
        }
        size = this.mergingTransition_.size();
        for (int i = 0;i < size;i++) {
            MergingTransition value = (MergingTransition)this.mergingTransition_.get(i);
            value.makeElement(element);
        }
        size = this.oneOrMoreAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            OneOrMoreAttributeTransition value = (OneOrMoreAttributeTransition)this.oneOrMoreAttributeTransition_.get(i);
            value.makeElement(element);
        }
        size = this.nonExistentAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            NonExistentAttributeTransition value = (NonExistentAttributeTransition)this.nonExistentAttributeTransition_.get(i);
            value.makeElement(element);
        }
        size = this.atomicTransition_.size();
        for (int i = 0;i < size;i++) {
            AtomicTransition value = (AtomicTransition)this.atomicTransition_.get(i);
            value.makeElement(element);
        }
        size = this.listTransition_.size();
        for (int i = 0;i < size;i++) {
            ListTransition value = (ListTransition)this.listTransition_.get(i);
            value.makeElement(element);
        }
        parent.appendChild(element);
    }

    /**
     * Initializes the <code>BinaryTreeAutomaton</code> by the File <code>file</code>.
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
     * Initializes the <code>BinaryTreeAutomaton</code>
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
     * Initializes the <code>BinaryTreeAutomaton</code> by the URL <code>url</code>.
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
     * Initializes the <code>BinaryTreeAutomaton</code> by the InputStream <code>in</code>.
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
     * Initializes the <code>BinaryTreeAutomaton</code> by the InputSource <code>is</code>.
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
     * Initializes the <code>BinaryTreeAutomaton</code> by the Reader <code>reader</code>.
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
     * Gets the FinalTransition property <b>finalTransition</b>.
     *
     * @return FinalTransition[]
     */
    public final FinalTransition[] getFinalTransition() {
        FinalTransition[] array = new FinalTransition[finalTransition_.size()];
        return ((FinalTransition[])finalTransition_.toArray(array));
    }

    /**
     * Sets the FinalTransition property <b>finalTransition</b>.
     *
     * @param finalTransition
     */
    public final void setFinalTransition(FinalTransition[] finalTransition) {
        this.finalTransition_.clear();
        for (int i = 0;i < finalTransition.length;i++) {
            addFinalTransition(finalTransition[i]);
        }
        for (int i = 0;i < finalTransition.length;i++) {
            finalTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < finalTransition.length;i++) {
            finalTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the FinalTransition property <b>finalTransition</b>.
     *
     * @param finalTransition
     */
    public final void setFinalTransition(FinalTransition finalTransition) {
        this.finalTransition_.clear();
        addFinalTransition(finalTransition);
        if (finalTransition != null) {
            finalTransition.setParentRNode(this);
        }
        if (finalTransition != null) {
            finalTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the FinalTransition property <b>finalTransition</b>.
     *
     * @param finalTransition
     */
    public final void addFinalTransition(FinalTransition finalTransition) {
        this.finalTransition_.add(finalTransition);
        if (finalTransition != null) {
            finalTransition.setParentRNode(this);
        }
        if (finalTransition != null) {
            finalTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the FinalTransition property <b>finalTransition</b>.
     *
     * @return int
     */
    public final int getFinalTransitionCount() {
        return (finalTransition_.size());
    }

    /**
     * Gets the FinalTransition property <b>finalTransition</b> by index.
     *
     * @param index
     * @return FinalTransition
     */
    public final FinalTransition getFinalTransition(int index) {
        return ((FinalTransition)finalTransition_.get(index));
    }

    /**
     * Sets the FinalTransition property <b>finalTransition</b> by index.
     *
     * @param index
     * @param finalTransition
     */
    public final void setFinalTransition(int index, FinalTransition finalTransition) {
        this.finalTransition_.set(index, finalTransition);
    }

    /**
     * Adds the FinalTransition property <b>finalTransition</b> by index.
     *
     * @param index
     * @param finalTransition
     */
    public final void addFinalTransition(int index, FinalTransition finalTransition) {
        this.finalTransition_.add(index, finalTransition);
    }

    /**
     * Remove the FinalTransition property <b>finalTransition</b> by index.
     *
     * @param index
     */
    public final void removeFinalTransition(int index) {
        this.finalTransition_.remove(index);
    }

    /**
     * Remove the FinalTransition property <b>finalTransition</b> by object.
     *
     * @param finalTransition
     */
    public final void removeFinalTransition(FinalTransition finalTransition) {
        this.finalTransition_.remove(finalTransition);
    }

    /**
     * Clear the FinalTransition property <b>finalTransition</b>.
     *
     */
    public final void clearFinalTransition() {
        this.finalTransition_.clear();
    }

    /**
     * Gets the StartTransition property <b>startTransition</b>.
     *
     * @return StartTransition[]
     */
    public final StartTransition[] getStartTransition() {
        StartTransition[] array = new StartTransition[startTransition_.size()];
        return ((StartTransition[])startTransition_.toArray(array));
    }

    /**
     * Sets the StartTransition property <b>startTransition</b>.
     *
     * @param startTransition
     */
    public final void setStartTransition(StartTransition[] startTransition) {
        this.startTransition_.clear();
        for (int i = 0;i < startTransition.length;i++) {
            addStartTransition(startTransition[i]);
        }
        for (int i = 0;i < startTransition.length;i++) {
            startTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < startTransition.length;i++) {
            startTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the StartTransition property <b>startTransition</b>.
     *
     * @param startTransition
     */
    public final void setStartTransition(StartTransition startTransition) {
        this.startTransition_.clear();
        addStartTransition(startTransition);
        if (startTransition != null) {
            startTransition.setParentRNode(this);
        }
        if (startTransition != null) {
            startTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the StartTransition property <b>startTransition</b>.
     *
     * @param startTransition
     */
    public final void addStartTransition(StartTransition startTransition) {
        this.startTransition_.add(startTransition);
        if (startTransition != null) {
            startTransition.setParentRNode(this);
        }
        if (startTransition != null) {
            startTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the StartTransition property <b>startTransition</b>.
     *
     * @return int
     */
    public final int getStartTransitionCount() {
        return (startTransition_.size());
    }

    /**
     * Gets the StartTransition property <b>startTransition</b> by index.
     *
     * @param index
     * @return StartTransition
     */
    public final StartTransition getStartTransition(int index) {
        return ((StartTransition)startTransition_.get(index));
    }

    /**
     * Sets the StartTransition property <b>startTransition</b> by index.
     *
     * @param index
     * @param startTransition
     */
    public final void setStartTransition(int index, StartTransition startTransition) {
        this.startTransition_.set(index, startTransition);
    }

    /**
     * Adds the StartTransition property <b>startTransition</b> by index.
     *
     * @param index
     * @param startTransition
     */
    public final void addStartTransition(int index, StartTransition startTransition) {
        this.startTransition_.add(index, startTransition);
    }

    /**
     * Remove the StartTransition property <b>startTransition</b> by index.
     *
     * @param index
     */
    public final void removeStartTransition(int index) {
        this.startTransition_.remove(index);
    }

    /**
     * Remove the StartTransition property <b>startTransition</b> by object.
     *
     * @param startTransition
     */
    public final void removeStartTransition(StartTransition startTransition) {
        this.startTransition_.remove(startTransition);
    }

    /**
     * Clear the StartTransition property <b>startTransition</b>.
     *
     */
    public final void clearStartTransition() {
        this.startTransition_.clear();
    }

    /**
     * Gets the ElementTransition property <b>elementTransition</b>.
     *
     * @return ElementTransition[]
     */
    public final ElementTransition[] getElementTransition() {
        ElementTransition[] array = new ElementTransition[elementTransition_.size()];
        return ((ElementTransition[])elementTransition_.toArray(array));
    }

    /**
     * Sets the ElementTransition property <b>elementTransition</b>.
     *
     * @param elementTransition
     */
    public final void setElementTransition(ElementTransition[] elementTransition) {
        this.elementTransition_.clear();
        for (int i = 0;i < elementTransition.length;i++) {
            addElementTransition(elementTransition[i]);
        }
        for (int i = 0;i < elementTransition.length;i++) {
            elementTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < elementTransition.length;i++) {
            elementTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the ElementTransition property <b>elementTransition</b>.
     *
     * @param elementTransition
     */
    public final void setElementTransition(ElementTransition elementTransition) {
        this.elementTransition_.clear();
        addElementTransition(elementTransition);
        if (elementTransition != null) {
            elementTransition.setParentRNode(this);
        }
        if (elementTransition != null) {
            elementTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the ElementTransition property <b>elementTransition</b>.
     *
     * @param elementTransition
     */
    public final void addElementTransition(ElementTransition elementTransition) {
        this.elementTransition_.add(elementTransition);
        if (elementTransition != null) {
            elementTransition.setParentRNode(this);
        }
        if (elementTransition != null) {
            elementTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the ElementTransition property <b>elementTransition</b>.
     *
     * @return int
     */
    public final int getElementTransitionCount() {
        return (elementTransition_.size());
    }

    /**
     * Gets the ElementTransition property <b>elementTransition</b> by index.
     *
     * @param index
     * @return ElementTransition
     */
    public final ElementTransition getElementTransition(int index) {
        return ((ElementTransition)elementTransition_.get(index));
    }

    /**
     * Sets the ElementTransition property <b>elementTransition</b> by index.
     *
     * @param index
     * @param elementTransition
     */
    public final void setElementTransition(int index, ElementTransition elementTransition) {
        this.elementTransition_.set(index, elementTransition);
    }

    /**
     * Adds the ElementTransition property <b>elementTransition</b> by index.
     *
     * @param index
     * @param elementTransition
     */
    public final void addElementTransition(int index, ElementTransition elementTransition) {
        this.elementTransition_.add(index, elementTransition);
    }

    /**
     * Remove the ElementTransition property <b>elementTransition</b> by index.
     *
     * @param index
     */
    public final void removeElementTransition(int index) {
        this.elementTransition_.remove(index);
    }

    /**
     * Remove the ElementTransition property <b>elementTransition</b> by object.
     *
     * @param elementTransition
     */
    public final void removeElementTransition(ElementTransition elementTransition) {
        this.elementTransition_.remove(elementTransition);
    }

    /**
     * Clear the ElementTransition property <b>elementTransition</b>.
     *
     */
    public final void clearElementTransition() {
        this.elementTransition_.clear();
    }

    /**
     * Gets the TextTransition property <b>textTransition</b>.
     *
     * @return TextTransition[]
     */
    public final TextTransition[] getTextTransition() {
        TextTransition[] array = new TextTransition[textTransition_.size()];
        return ((TextTransition[])textTransition_.toArray(array));
    }

    /**
     * Sets the TextTransition property <b>textTransition</b>.
     *
     * @param textTransition
     */
    public final void setTextTransition(TextTransition[] textTransition) {
        this.textTransition_.clear();
        for (int i = 0;i < textTransition.length;i++) {
            addTextTransition(textTransition[i]);
        }
        for (int i = 0;i < textTransition.length;i++) {
            textTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < textTransition.length;i++) {
            textTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the TextTransition property <b>textTransition</b>.
     *
     * @param textTransition
     */
    public final void setTextTransition(TextTransition textTransition) {
        this.textTransition_.clear();
        addTextTransition(textTransition);
        if (textTransition != null) {
            textTransition.setParentRNode(this);
        }
        if (textTransition != null) {
            textTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the TextTransition property <b>textTransition</b>.
     *
     * @param textTransition
     */
    public final void addTextTransition(TextTransition textTransition) {
        this.textTransition_.add(textTransition);
        if (textTransition != null) {
            textTransition.setParentRNode(this);
        }
        if (textTransition != null) {
            textTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the TextTransition property <b>textTransition</b>.
     *
     * @return int
     */
    public final int getTextTransitionCount() {
        return (textTransition_.size());
    }

    /**
     * Gets the TextTransition property <b>textTransition</b> by index.
     *
     * @param index
     * @return TextTransition
     */
    public final TextTransition getTextTransition(int index) {
        return ((TextTransition)textTransition_.get(index));
    }

    /**
     * Sets the TextTransition property <b>textTransition</b> by index.
     *
     * @param index
     * @param textTransition
     */
    public final void setTextTransition(int index, TextTransition textTransition) {
        this.textTransition_.set(index, textTransition);
    }

    /**
     * Adds the TextTransition property <b>textTransition</b> by index.
     *
     * @param index
     * @param textTransition
     */
    public final void addTextTransition(int index, TextTransition textTransition) {
        this.textTransition_.add(index, textTransition);
    }

    /**
     * Remove the TextTransition property <b>textTransition</b> by index.
     *
     * @param index
     */
    public final void removeTextTransition(int index) {
        this.textTransition_.remove(index);
    }

    /**
     * Remove the TextTransition property <b>textTransition</b> by object.
     *
     * @param textTransition
     */
    public final void removeTextTransition(TextTransition textTransition) {
        this.textTransition_.remove(textTransition);
    }

    /**
     * Clear the TextTransition property <b>textTransition</b>.
     *
     */
    public final void clearTextTransition() {
        this.textTransition_.clear();
    }

    /**
     * Gets the BranchingTransition property <b>branchingTransition</b>.
     *
     * @return BranchingTransition[]
     */
    public final BranchingTransition[] getBranchingTransition() {
        BranchingTransition[] array = new BranchingTransition[branchingTransition_.size()];
        return ((BranchingTransition[])branchingTransition_.toArray(array));
    }

    /**
     * Sets the BranchingTransition property <b>branchingTransition</b>.
     *
     * @param branchingTransition
     */
    public final void setBranchingTransition(BranchingTransition[] branchingTransition) {
        this.branchingTransition_.clear();
        for (int i = 0;i < branchingTransition.length;i++) {
            addBranchingTransition(branchingTransition[i]);
        }
        for (int i = 0;i < branchingTransition.length;i++) {
            branchingTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < branchingTransition.length;i++) {
            branchingTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the BranchingTransition property <b>branchingTransition</b>.
     *
     * @param branchingTransition
     */
    public final void setBranchingTransition(BranchingTransition branchingTransition) {
        this.branchingTransition_.clear();
        addBranchingTransition(branchingTransition);
        if (branchingTransition != null) {
            branchingTransition.setParentRNode(this);
        }
        if (branchingTransition != null) {
            branchingTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the BranchingTransition property <b>branchingTransition</b>.
     *
     * @param branchingTransition
     */
    public final void addBranchingTransition(BranchingTransition branchingTransition) {
        this.branchingTransition_.add(branchingTransition);
        if (branchingTransition != null) {
            branchingTransition.setParentRNode(this);
        }
        if (branchingTransition != null) {
            branchingTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the BranchingTransition property <b>branchingTransition</b>.
     *
     * @return int
     */
    public final int getBranchingTransitionCount() {
        return (branchingTransition_.size());
    }

    /**
     * Gets the BranchingTransition property <b>branchingTransition</b> by index.
     *
     * @param index
     * @return BranchingTransition
     */
    public final BranchingTransition getBranchingTransition(int index) {
        return ((BranchingTransition)branchingTransition_.get(index));
    }

    /**
     * Sets the BranchingTransition property <b>branchingTransition</b> by index.
     *
     * @param index
     * @param branchingTransition
     */
    public final void setBranchingTransition(int index, BranchingTransition branchingTransition) {
        this.branchingTransition_.set(index, branchingTransition);
    }

    /**
     * Adds the BranchingTransition property <b>branchingTransition</b> by index.
     *
     * @param index
     * @param branchingTransition
     */
    public final void addBranchingTransition(int index, BranchingTransition branchingTransition) {
        this.branchingTransition_.add(index, branchingTransition);
    }

    /**
     * Remove the BranchingTransition property <b>branchingTransition</b> by index.
     *
     * @param index
     */
    public final void removeBranchingTransition(int index) {
        this.branchingTransition_.remove(index);
    }

    /**
     * Remove the BranchingTransition property <b>branchingTransition</b> by object.
     *
     * @param branchingTransition
     */
    public final void removeBranchingTransition(BranchingTransition branchingTransition) {
        this.branchingTransition_.remove(branchingTransition);
    }

    /**
     * Clear the BranchingTransition property <b>branchingTransition</b>.
     *
     */
    public final void clearBranchingTransition() {
        this.branchingTransition_.clear();
    }

    /**
     * Gets the MergingTransition property <b>mergingTransition</b>.
     *
     * @return MergingTransition[]
     */
    public final MergingTransition[] getMergingTransition() {
        MergingTransition[] array = new MergingTransition[mergingTransition_.size()];
        return ((MergingTransition[])mergingTransition_.toArray(array));
    }

    /**
     * Sets the MergingTransition property <b>mergingTransition</b>.
     *
     * @param mergingTransition
     */
    public final void setMergingTransition(MergingTransition[] mergingTransition) {
        this.mergingTransition_.clear();
        for (int i = 0;i < mergingTransition.length;i++) {
            addMergingTransition(mergingTransition[i]);
        }
        for (int i = 0;i < mergingTransition.length;i++) {
            mergingTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < mergingTransition.length;i++) {
            mergingTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the MergingTransition property <b>mergingTransition</b>.
     *
     * @param mergingTransition
     */
    public final void setMergingTransition(MergingTransition mergingTransition) {
        this.mergingTransition_.clear();
        addMergingTransition(mergingTransition);
        if (mergingTransition != null) {
            mergingTransition.setParentRNode(this);
        }
        if (mergingTransition != null) {
            mergingTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the MergingTransition property <b>mergingTransition</b>.
     *
     * @param mergingTransition
     */
    public final void addMergingTransition(MergingTransition mergingTransition) {
        this.mergingTransition_.add(mergingTransition);
        if (mergingTransition != null) {
            mergingTransition.setParentRNode(this);
        }
        if (mergingTransition != null) {
            mergingTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the MergingTransition property <b>mergingTransition</b>.
     *
     * @return int
     */
    public final int getMergingTransitionCount() {
        return (mergingTransition_.size());
    }

    /**
     * Gets the MergingTransition property <b>mergingTransition</b> by index.
     *
     * @param index
     * @return MergingTransition
     */
    public final MergingTransition getMergingTransition(int index) {
        return ((MergingTransition)mergingTransition_.get(index));
    }

    /**
     * Sets the MergingTransition property <b>mergingTransition</b> by index.
     *
     * @param index
     * @param mergingTransition
     */
    public final void setMergingTransition(int index, MergingTransition mergingTransition) {
        this.mergingTransition_.set(index, mergingTransition);
    }

    /**
     * Adds the MergingTransition property <b>mergingTransition</b> by index.
     *
     * @param index
     * @param mergingTransition
     */
    public final void addMergingTransition(int index, MergingTransition mergingTransition) {
        this.mergingTransition_.add(index, mergingTransition);
    }

    /**
     * Remove the MergingTransition property <b>mergingTransition</b> by index.
     *
     * @param index
     */
    public final void removeMergingTransition(int index) {
        this.mergingTransition_.remove(index);
    }

    /**
     * Remove the MergingTransition property <b>mergingTransition</b> by object.
     *
     * @param mergingTransition
     */
    public final void removeMergingTransition(MergingTransition mergingTransition) {
        this.mergingTransition_.remove(mergingTransition);
    }

    /**
     * Clear the MergingTransition property <b>mergingTransition</b>.
     *
     */
    public final void clearMergingTransition() {
        this.mergingTransition_.clear();
    }

    /**
     * Gets the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     * @return OneOrMoreAttributeTransition[]
     */
    public final OneOrMoreAttributeTransition[] getOneOrMoreAttributeTransition() {
        OneOrMoreAttributeTransition[] array = new OneOrMoreAttributeTransition[oneOrMoreAttributeTransition_.size()];
        return ((OneOrMoreAttributeTransition[])oneOrMoreAttributeTransition_.toArray(array));
    }

    /**
     * Sets the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     * @param oneOrMoreAttributeTransition
     */
    public final void setOneOrMoreAttributeTransition(OneOrMoreAttributeTransition[] oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.clear();
        for (int i = 0;i < oneOrMoreAttributeTransition.length;i++) {
            addOneOrMoreAttributeTransition(oneOrMoreAttributeTransition[i]);
        }
        for (int i = 0;i < oneOrMoreAttributeTransition.length;i++) {
            oneOrMoreAttributeTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < oneOrMoreAttributeTransition.length;i++) {
            oneOrMoreAttributeTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     * @param oneOrMoreAttributeTransition
     */
    public final void setOneOrMoreAttributeTransition(OneOrMoreAttributeTransition oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.clear();
        addOneOrMoreAttributeTransition(oneOrMoreAttributeTransition);
        if (oneOrMoreAttributeTransition != null) {
            oneOrMoreAttributeTransition.setParentRNode(this);
        }
        if (oneOrMoreAttributeTransition != null) {
            oneOrMoreAttributeTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     * @param oneOrMoreAttributeTransition
     */
    public final void addOneOrMoreAttributeTransition(OneOrMoreAttributeTransition oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.add(oneOrMoreAttributeTransition);
        if (oneOrMoreAttributeTransition != null) {
            oneOrMoreAttributeTransition.setParentRNode(this);
        }
        if (oneOrMoreAttributeTransition != null) {
            oneOrMoreAttributeTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     * @return int
     */
    public final int getOneOrMoreAttributeTransitionCount() {
        return (oneOrMoreAttributeTransition_.size());
    }

    /**
     * Gets the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b> by index.
     *
     * @param index
     * @return OneOrMoreAttributeTransition
     */
    public final OneOrMoreAttributeTransition getOneOrMoreAttributeTransition(int index) {
        return ((OneOrMoreAttributeTransition)oneOrMoreAttributeTransition_.get(index));
    }

    /**
     * Sets the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b> by index.
     *
     * @param index
     * @param oneOrMoreAttributeTransition
     */
    public final void setOneOrMoreAttributeTransition(int index, OneOrMoreAttributeTransition oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.set(index, oneOrMoreAttributeTransition);
    }

    /**
     * Adds the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b> by index.
     *
     * @param index
     * @param oneOrMoreAttributeTransition
     */
    public final void addOneOrMoreAttributeTransition(int index, OneOrMoreAttributeTransition oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.add(index, oneOrMoreAttributeTransition);
    }

    /**
     * Remove the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b> by index.
     *
     * @param index
     */
    public final void removeOneOrMoreAttributeTransition(int index) {
        this.oneOrMoreAttributeTransition_.remove(index);
    }

    /**
     * Remove the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b> by object.
     *
     * @param oneOrMoreAttributeTransition
     */
    public final void removeOneOrMoreAttributeTransition(OneOrMoreAttributeTransition oneOrMoreAttributeTransition) {
        this.oneOrMoreAttributeTransition_.remove(oneOrMoreAttributeTransition);
    }

    /**
     * Clear the OneOrMoreAttributeTransition property <b>oneOrMoreAttributeTransition</b>.
     *
     */
    public final void clearOneOrMoreAttributeTransition() {
        this.oneOrMoreAttributeTransition_.clear();
    }

    /**
     * Gets the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     * @return NonExistentAttributeTransition[]
     */
    public final NonExistentAttributeTransition[] getNonExistentAttributeTransition() {
        NonExistentAttributeTransition[] array = new NonExistentAttributeTransition[nonExistentAttributeTransition_.size()];
        return ((NonExistentAttributeTransition[])nonExistentAttributeTransition_.toArray(array));
    }

    /**
     * Sets the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     * @param nonExistentAttributeTransition
     */
    public final void setNonExistentAttributeTransition(NonExistentAttributeTransition[] nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.clear();
        for (int i = 0;i < nonExistentAttributeTransition.length;i++) {
            addNonExistentAttributeTransition(nonExistentAttributeTransition[i]);
        }
        for (int i = 0;i < nonExistentAttributeTransition.length;i++) {
            nonExistentAttributeTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < nonExistentAttributeTransition.length;i++) {
            nonExistentAttributeTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     * @param nonExistentAttributeTransition
     */
    public final void setNonExistentAttributeTransition(NonExistentAttributeTransition nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.clear();
        addNonExistentAttributeTransition(nonExistentAttributeTransition);
        if (nonExistentAttributeTransition != null) {
            nonExistentAttributeTransition.setParentRNode(this);
        }
        if (nonExistentAttributeTransition != null) {
            nonExistentAttributeTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     * @param nonExistentAttributeTransition
     */
    public final void addNonExistentAttributeTransition(NonExistentAttributeTransition nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.add(nonExistentAttributeTransition);
        if (nonExistentAttributeTransition != null) {
            nonExistentAttributeTransition.setParentRNode(this);
        }
        if (nonExistentAttributeTransition != null) {
            nonExistentAttributeTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     * @return int
     */
    public final int getNonExistentAttributeTransitionCount() {
        return (nonExistentAttributeTransition_.size());
    }

    /**
     * Gets the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b> by index.
     *
     * @param index
     * @return NonExistentAttributeTransition
     */
    public final NonExistentAttributeTransition getNonExistentAttributeTransition(int index) {
        return ((NonExistentAttributeTransition)nonExistentAttributeTransition_.get(index));
    }

    /**
     * Sets the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b> by index.
     *
     * @param index
     * @param nonExistentAttributeTransition
     */
    public final void setNonExistentAttributeTransition(int index, NonExistentAttributeTransition nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.set(index, nonExistentAttributeTransition);
    }

    /**
     * Adds the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b> by index.
     *
     * @param index
     * @param nonExistentAttributeTransition
     */
    public final void addNonExistentAttributeTransition(int index, NonExistentAttributeTransition nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.add(index, nonExistentAttributeTransition);
    }

    /**
     * Remove the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b> by index.
     *
     * @param index
     */
    public final void removeNonExistentAttributeTransition(int index) {
        this.nonExistentAttributeTransition_.remove(index);
    }

    /**
     * Remove the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b> by object.
     *
     * @param nonExistentAttributeTransition
     */
    public final void removeNonExistentAttributeTransition(NonExistentAttributeTransition nonExistentAttributeTransition) {
        this.nonExistentAttributeTransition_.remove(nonExistentAttributeTransition);
    }

    /**
     * Clear the NonExistentAttributeTransition property <b>nonExistentAttributeTransition</b>.
     *
     */
    public final void clearNonExistentAttributeTransition() {
        this.nonExistentAttributeTransition_.clear();
    }

    /**
     * Gets the AtomicTransition property <b>atomicTransition</b>.
     *
     * @return AtomicTransition[]
     */
    public final AtomicTransition[] getAtomicTransition() {
        AtomicTransition[] array = new AtomicTransition[atomicTransition_.size()];
        return ((AtomicTransition[])atomicTransition_.toArray(array));
    }

    /**
     * Sets the AtomicTransition property <b>atomicTransition</b>.
     *
     * @param atomicTransition
     */
    public final void setAtomicTransition(AtomicTransition[] atomicTransition) {
        this.atomicTransition_.clear();
        for (int i = 0;i < atomicTransition.length;i++) {
            addAtomicTransition(atomicTransition[i]);
        }
        for (int i = 0;i < atomicTransition.length;i++) {
            atomicTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < atomicTransition.length;i++) {
            atomicTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the AtomicTransition property <b>atomicTransition</b>.
     *
     * @param atomicTransition
     */
    public final void setAtomicTransition(AtomicTransition atomicTransition) {
        this.atomicTransition_.clear();
        addAtomicTransition(atomicTransition);
        if (atomicTransition != null) {
            atomicTransition.setParentRNode(this);
        }
        if (atomicTransition != null) {
            atomicTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the AtomicTransition property <b>atomicTransition</b>.
     *
     * @param atomicTransition
     */
    public final void addAtomicTransition(AtomicTransition atomicTransition) {
        this.atomicTransition_.add(atomicTransition);
        if (atomicTransition != null) {
            atomicTransition.setParentRNode(this);
        }
        if (atomicTransition != null) {
            atomicTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the AtomicTransition property <b>atomicTransition</b>.
     *
     * @return int
     */
    public final int getAtomicTransitionCount() {
        return (atomicTransition_.size());
    }

    /**
     * Gets the AtomicTransition property <b>atomicTransition</b> by index.
     *
     * @param index
     * @return AtomicTransition
     */
    public final AtomicTransition getAtomicTransition(int index) {
        return ((AtomicTransition)atomicTransition_.get(index));
    }

    /**
     * Sets the AtomicTransition property <b>atomicTransition</b> by index.
     *
     * @param index
     * @param atomicTransition
     */
    public final void setAtomicTransition(int index, AtomicTransition atomicTransition) {
        this.atomicTransition_.set(index, atomicTransition);
    }

    /**
     * Adds the AtomicTransition property <b>atomicTransition</b> by index.
     *
     * @param index
     * @param atomicTransition
     */
    public final void addAtomicTransition(int index, AtomicTransition atomicTransition) {
        this.atomicTransition_.add(index, atomicTransition);
    }

    /**
     * Remove the AtomicTransition property <b>atomicTransition</b> by index.
     *
     * @param index
     */
    public final void removeAtomicTransition(int index) {
        this.atomicTransition_.remove(index);
    }

    /**
     * Remove the AtomicTransition property <b>atomicTransition</b> by object.
     *
     * @param atomicTransition
     */
    public final void removeAtomicTransition(AtomicTransition atomicTransition) {
        this.atomicTransition_.remove(atomicTransition);
    }

    /**
     * Clear the AtomicTransition property <b>atomicTransition</b>.
     *
     */
    public final void clearAtomicTransition() {
        this.atomicTransition_.clear();
    }

    /**
     * Gets the ListTransition property <b>listTransition</b>.
     *
     * @return ListTransition[]
     */
    public final ListTransition[] getListTransition() {
        ListTransition[] array = new ListTransition[listTransition_.size()];
        return ((ListTransition[])listTransition_.toArray(array));
    }

    /**
     * Sets the ListTransition property <b>listTransition</b>.
     *
     * @param listTransition
     */
    public final void setListTransition(ListTransition[] listTransition) {
        this.listTransition_.clear();
        for (int i = 0;i < listTransition.length;i++) {
            addListTransition(listTransition[i]);
        }
        for (int i = 0;i < listTransition.length;i++) {
            listTransition[i].setParentRNode(this);
        }
        for (int i = 0;i < listTransition.length;i++) {
            listTransition[i].setRContext(getRContext());
        }
    }

    /**
     * Sets the ListTransition property <b>listTransition</b>.
     *
     * @param listTransition
     */
    public final void setListTransition(ListTransition listTransition) {
        this.listTransition_.clear();
        addListTransition(listTransition);
        if (listTransition != null) {
            listTransition.setParentRNode(this);
        }
        if (listTransition != null) {
            listTransition.setRContext(getRContext());
        }
    }

    /**
     * Adds the ListTransition property <b>listTransition</b>.
     *
     * @param listTransition
     */
    public final void addListTransition(ListTransition listTransition) {
        this.listTransition_.add(listTransition);
        if (listTransition != null) {
            listTransition.setParentRNode(this);
        }
        if (listTransition != null) {
            listTransition.setRContext(getRContext());
        }
    }

    /**
     * Gets number of the ListTransition property <b>listTransition</b>.
     *
     * @return int
     */
    public final int getListTransitionCount() {
        return (listTransition_.size());
    }

    /**
     * Gets the ListTransition property <b>listTransition</b> by index.
     *
     * @param index
     * @return ListTransition
     */
    public final ListTransition getListTransition(int index) {
        return ((ListTransition)listTransition_.get(index));
    }

    /**
     * Sets the ListTransition property <b>listTransition</b> by index.
     *
     * @param index
     * @param listTransition
     */
    public final void setListTransition(int index, ListTransition listTransition) {
        this.listTransition_.set(index, listTransition);
    }

    /**
     * Adds the ListTransition property <b>listTransition</b> by index.
     *
     * @param index
     * @param listTransition
     */
    public final void addListTransition(int index, ListTransition listTransition) {
        this.listTransition_.add(index, listTransition);
    }

    /**
     * Remove the ListTransition property <b>listTransition</b> by index.
     *
     * @param index
     */
    public final void removeListTransition(int index) {
        this.listTransition_.remove(index);
    }

    /**
     * Remove the ListTransition property <b>listTransition</b> by object.
     *
     * @param listTransition
     */
    public final void removeListTransition(ListTransition listTransition) {
        this.listTransition_.remove(listTransition);
    }

    /**
     * Clear the ListTransition property <b>listTransition</b>.
     *
     */
    public final void clearListTransition() {
        this.listTransition_.clear();
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
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
        buffer.append("<");
        URelaxer.makeQName(prefix, "binaryTreeAutomaton", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.append(">");
        size = this.finalTransition_.size();
        for (int i = 0;i < size;i++) {
            FinalTransition value = (FinalTransition)this.finalTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.startTransition_.size();
        for (int i = 0;i < size;i++) {
            StartTransition value = (StartTransition)this.startTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.elementTransition_.size();
        for (int i = 0;i < size;i++) {
            ElementTransition value = (ElementTransition)this.elementTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.textTransition_.size();
        for (int i = 0;i < size;i++) {
            TextTransition value = (TextTransition)this.textTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.branchingTransition_.size();
        for (int i = 0;i < size;i++) {
            BranchingTransition value = (BranchingTransition)this.branchingTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.mergingTransition_.size();
        for (int i = 0;i < size;i++) {
            MergingTransition value = (MergingTransition)this.mergingTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.oneOrMoreAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            OneOrMoreAttributeTransition value = (OneOrMoreAttributeTransition)this.oneOrMoreAttributeTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.nonExistentAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            NonExistentAttributeTransition value = (NonExistentAttributeTransition)this.nonExistentAttributeTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.atomicTransition_.size();
        for (int i = 0;i < size;i++) {
            AtomicTransition value = (AtomicTransition)this.atomicTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.listTransition_.size();
        for (int i = 0;i < size;i++) {
            ListTransition value = (ListTransition)this.listTransition_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.append("</");
        URelaxer.makeQName(prefix, "binaryTreeAutomaton", buffer);
        buffer.append(">");
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        String prefix = rNSContext_.getPrefixByUri("http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton");
        buffer.print("<");
        URelaxer.makeQName(prefix, "binaryTreeAutomaton", buffer);
        rNSContext_.makeNSMappings(buffer);
        buffer.print(">");
        size = this.finalTransition_.size();
        for (int i = 0;i < size;i++) {
            FinalTransition value = (FinalTransition)this.finalTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.startTransition_.size();
        for (int i = 0;i < size;i++) {
            StartTransition value = (StartTransition)this.startTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.elementTransition_.size();
        for (int i = 0;i < size;i++) {
            ElementTransition value = (ElementTransition)this.elementTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.textTransition_.size();
        for (int i = 0;i < size;i++) {
            TextTransition value = (TextTransition)this.textTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.branchingTransition_.size();
        for (int i = 0;i < size;i++) {
            BranchingTransition value = (BranchingTransition)this.branchingTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.mergingTransition_.size();
        for (int i = 0;i < size;i++) {
            MergingTransition value = (MergingTransition)this.mergingTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.oneOrMoreAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            OneOrMoreAttributeTransition value = (OneOrMoreAttributeTransition)this.oneOrMoreAttributeTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.nonExistentAttributeTransition_.size();
        for (int i = 0;i < size;i++) {
            NonExistentAttributeTransition value = (NonExistentAttributeTransition)this.nonExistentAttributeTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.atomicTransition_.size();
        for (int i = 0;i < size;i++) {
            AtomicTransition value = (AtomicTransition)this.atomicTransition_.get(i);
            value.makeTextElement(buffer);
        }
        size = this.listTransition_.size();
        for (int i = 0;i < size;i++) {
            ListTransition value = (ListTransition)this.listTransition_.get(i);
            value.makeTextElement(buffer);
        }
        buffer.print("</");
        URelaxer.makeQName(prefix, "binaryTreeAutomaton", buffer);
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
    public void setFinalTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setFinalTransition(new FinalTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setStartTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setStartTransition(new StartTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setElementTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setElementTransition(new ElementTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setTextTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setTextTransition(new TextTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setBranchingTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setBranchingTransition(new BranchingTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setMergingTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setMergingTransition(new MergingTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setOneOrMoreAttributeTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setOneOrMoreAttributeTransition(new OneOrMoreAttributeTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setNonExistentAttributeTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setNonExistentAttributeTransition(new NonExistentAttributeTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setAtomicTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setAtomicTransition(new AtomicTransition(string));
    }

    /**
     * Sets the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void setListTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        setListTransition(new ListTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addFinalTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addFinalTransition(new FinalTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addStartTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addStartTransition(new StartTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addElementTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addElementTransition(new ElementTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addTextTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addTextTransition(new TextTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addBranchingTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addBranchingTransition(new BranchingTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addMergingTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addMergingTransition(new MergingTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addOneOrMoreAttributeTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addOneOrMoreAttributeTransition(new OneOrMoreAttributeTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addNonExistentAttributeTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addNonExistentAttributeTransition(new NonExistentAttributeTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addAtomicTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addAtomicTransition(new AtomicTransition(string));
    }

    /**
     * Adds the property value by String.
     *
     * @param string
     * @exception IOException
     * @exception SAXException
     * @exception ParserConfigurationException
     */
    public void addListTransitionByString(String string) throws IOException, SAXException, ParserConfigurationException {
        addListTransition(new ListTransition(string));
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
        classNodes.addAll(finalTransition_);
        classNodes.addAll(startTransition_);
        classNodes.addAll(elementTransition_);
        classNodes.addAll(textTransition_);
        classNodes.addAll(branchingTransition_);
        classNodes.addAll(mergingTransition_);
        classNodes.addAll(oneOrMoreAttributeTransition_);
        classNodes.addAll(nonExistentAttributeTransition_);
        classNodes.addAll(atomicTransition_);
        classNodes.addAll(listTransition_);
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
     * for the <code>BinaryTreeAutomaton</code>.
     *
     * @param element
     * @return boolean
     */
    public static boolean isMatch(Element element) {
        if (!URelaxer2.isTargetElement(element, "http://www.iso_relax.org/xmlns/miaou/binaryTreeAutomaton", "binaryTreeAutomaton")) {
            return (false);
        }
        RStack target = new RStack(element);
        boolean $match$ = false;
        Element child;
        while (!target.isEmptyElement()) {
            if (!FinalTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!StartTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!ElementTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!TextTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!BranchingTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!MergingTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!OneOrMoreAttributeTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!NonExistentAttributeTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!AtomicTransition.isMatchHungry(target)) {
                break;
            }
            $match$ = true;
        }
        while (!target.isEmptyElement()) {
            if (!ListTransition.isMatchHungry(target)) {
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
     * is valid for the <code>BinaryTreeAutomaton</code>.
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
     * is valid for the <code>BinaryTreeAutomaton</code>.
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
