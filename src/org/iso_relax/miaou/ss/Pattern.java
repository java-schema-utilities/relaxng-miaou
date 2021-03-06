package org.iso_relax.miaou.ss;

import java.io.*;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * <b>Pattern</b> is generated from simpleSyntax.rngby Relaxer.
 * This class is derived from:
 * 
 * <!-- for programmer
 * <define name="pattern">
 *   <choice>
 *     <element name="notAllowed">
 *       <empty/>
 *     </element>
 *     <element name="empty">
 *       <empty/>
 *     </element>
 *     <element name="text">
 *       <empty/>
 *     </element>
 *     <element name="data">
 *       <ref name="type"/>
 *       <optional>
 *         <ref name="datatypeLibrary"/>
 *       </optional>
 *       <optional>
 *         <ref name="datatypeLibraryID"/>
 *       </optional>
 *       <zeroOrMore>
 *         <ref name="param"/>
 *       </zeroOrMore>
 *       <optional>
 *         <ref name="exceptPattern"/>
 *       </optional>
 *     </element>
 *     <element name="value">
 *       <ref name="type"/>
 *       <optional>
 *         <ref name="datatypeLibrary"/>
 *       </optional>
 *       <optional>
 *         <ref name="datatypeLibraryID"/>
 *       </optional>
 *       <optional>
 *         <ref name="ns"/>
 *       </optional>
 *       <optional>
 *         <ref name="nsID"/>
 *       </optional>
 *       <data type="string"/>
 *     </element>
 *     <element name="list">
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="attribute">
 *       <optional>
 *         <ref name="nameClass"/>
 *       </optional>
 *       <optional>
 *         <ref name="nameClassID"/>
 *       </optional>
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="syntaxExtension:oneOrMoreAttribute">
 *       <ref name="nameClassID"/>
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="syntaxExtension:nonExistentAttribute">
 *       <ref name="nameClassID"/>
 *       <ref name="exceptNameClassID"/>
 *     </element>
 *     <element name="ref">
 *       <attribute name="name">
 *         <data type="ID"/>
 *       </attribute>
 *     </element>
 *     <element name="oneOrMore">
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="choice">
 *       <ref name="pattern"/>
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="group">
 *       <ref name="pattern"/>
 *       <ref name="pattern"/>
 *     </element>
 *     <element name="interleave">
 *       <ref name="pattern"/>
 *       <ref name="pattern"/>
 *     </element>
 *   </choice>
 * </define>
 * -->
 * <!-- for javadoc -->
 * <pre> &lt;define name="pattern"&gt;
 *   &lt;choice&gt;
 *     &lt;element name="notAllowed"&gt;
 *       &lt;empty/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="empty"&gt;
 *       &lt;empty/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="text"&gt;
 *       &lt;empty/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="data"&gt;
 *       &lt;ref name="type"/&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="datatypeLibrary"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="datatypeLibraryID"/&gt;
 *       &lt;/optional&gt;
 *       &lt;zeroOrMore&gt;
 *         &lt;ref name="param"/&gt;
 *       &lt;/zeroOrMore&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="exceptPattern"/&gt;
 *       &lt;/optional&gt;
 *     &lt;/element&gt;
 *     &lt;element name="value"&gt;
 *       &lt;ref name="type"/&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="datatypeLibrary"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="datatypeLibraryID"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="ns"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="nsID"/&gt;
 *       &lt;/optional&gt;
 *       &lt;data type="string"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="list"&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="attribute"&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="nameClass"/&gt;
 *       &lt;/optional&gt;
 *       &lt;optional&gt;
 *         &lt;ref name="nameClassID"/&gt;
 *       &lt;/optional&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="syntaxExtension:oneOrMoreAttribute"&gt;
 *       &lt;ref name="nameClassID"/&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="syntaxExtension:nonExistentAttribute"&gt;
 *       &lt;ref name="nameClassID"/&gt;
 *       &lt;ref name="exceptNameClassID"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="ref"&gt;
 *       &lt;attribute name="name"&gt;
 *         &lt;data type="ID"/&gt;
 *       &lt;/attribute&gt;
 *     &lt;/element&gt;
 *     &lt;element name="oneOrMore"&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="choice"&gt;
 *       &lt;ref name="pattern"/&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="group"&gt;
 *       &lt;ref name="pattern"/&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *     &lt;element name="interleave"&gt;
 *       &lt;ref name="pattern"/&gt;
 *       &lt;ref name="pattern"/&gt;
 *     &lt;/element&gt;
 *   &lt;/choice&gt;
 * &lt;/define&gt;
 * </pre>
 *
 * @version simpleSyntax.rng (Sat Oct 19 02:27:00 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class Pattern implements java.io.Serializable, IRNSContainer, IRVisitable, IRNode {
    private RNSContext rNSContext_ = new RNSContext(this, "http://relaxng.org/ns/structure/1.0");
    private IPatternChoice content_;
    private IRNode parentRNode_;
    private RContext rContext_;

    /**
     * Creates a <code>Pattern</code>.
     *
     */
    public Pattern() {
    }

    /**
     * Creates a <code>Pattern</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public Pattern(RStack stack) {
        setup(stack);
    }

    /**
     * Initializes the <code>Pattern</code> by the Stack <code>stack</code>
     * that contains Elements.
     * This constructor is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     */
    public void setup(RStack stack) {
        Element element = stack.getContextElement();
        ISimpleSyntaxFactory factory = SimpleSyntaxFactory.getFactory();
        if (PatternData.isMatch(stack)) {
            setContent(factory.createPatternData(stack));
        } else if (PatternAttribute.isMatch(stack)) {
            setContent(factory.createPatternAttribute(stack));
        } else if (PatternOneOrMoreAttribute.isMatch(stack)) {
            setContent(factory.createPatternOneOrMoreAttribute(stack));
        } else if (PatternNonExistentAttribute.isMatch(stack)) {
            setContent(factory.createPatternNonExistentAttribute(stack));
        } else if (PatternChoice.isMatch(stack)) {
            setContent(factory.createPatternChoice(stack));
        } else if (PatternGroup.isMatch(stack)) {
            setContent(factory.createPatternGroup(stack));
        } else if (PatternInterleave.isMatch(stack)) {
            setContent(factory.createPatternInterleave(stack));
        } else if (PatternValue.isMatch(stack)) {
            setContent(factory.createPatternValue(stack));
        } else if (PatternList.isMatch(stack)) {
            setContent(factory.createPatternList(stack));
        } else if (PatternRef.isMatch(stack)) {
            setContent(factory.createPatternRef(stack));
        } else if (PatternOneOrMore.isMatch(stack)) {
            setContent(factory.createPatternOneOrMore(stack));
        } else if (PatternNotAllowed.isMatch(stack)) {
            setContent(factory.createPatternNotAllowed(stack));
        } else if (PatternEmpty.isMatch(stack)) {
            setContent(factory.createPatternEmpty(stack));
        } else if (PatternText.isMatch(stack)) {
            setContent(factory.createPatternText(stack));
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
        Document doc = parent.getOwnerDocument();
        Element element = (Element)parent;
        int size;
        this.content_.makeElement(element);
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
     * Gets the IPatternChoice property <b>content</b>.
     *
     * @return IPatternChoice
     */
    public final IPatternChoice getContent() {
        return (content_);
    }

    /**
     * Sets the IPatternChoice property <b>content</b>.
     *
     * @param content
     */
    public final void setContent(IPatternChoice content) {
        this.content_ = content;
        if (content != null) {
            content.setParentRNode(this);
        }
        if (content != null) {
            content.setRContext(getRContext());
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
        content_.makeTextElement(buffer);
    }

    /**
     * Makes a XML text representation.
     *
     * @param buffer
     */
    public void makeTextElement(PrintWriter buffer) {
        int size;
        content_.makeTextElement(buffer);
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
        classNodes.add(content_);
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
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>Pattern</code>.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return boolean
     */
    public static boolean isMatch(RStack stack) {
        return (isMatchHungry(stack.makeClone()));
    }

    /**
     * Tests if elements contained in a Stack <code>stack</code>
     * is valid for the <code>Pattern</code>.
     * This method consumes the stack contents during matching operation.
     * This mehtod is supposed to be used internally
     * by the Relaxer system.
     *
     * @param stack
     * @return boolean
     */
    public static boolean isMatchHungry(RStack stack) {
        RStack target = stack;
        boolean $match$ = false;
        Element child;
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
        return ($match$);
    }
}
