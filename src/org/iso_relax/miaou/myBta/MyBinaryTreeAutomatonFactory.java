package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.bta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyBinaryTreeAutomatonFactory extends DefaultBinaryTreeAutomatonFactory {

    /**
     * Creates a <code>MyBinaryTreeAutomaton</code>.
     *
     * @return BinaryTreeAutomaton
     */
    public BinaryTreeAutomaton createBinaryTreeAutomaton() {
        return (new MyBinaryTreeAutomaton());
    }

    /**
     * Creates a <code>MyFinalTransition</code>.
     *
     * @return FinalTransition
     */
    public FinalTransition createFinalTransition() {
        return (new MyFinalTransition());
    }

    /**
     * Creates a <code>MyStartTransition</code>.
     *
     * @return StartTransition
     */
    public StartTransition createStartTransition() {
        return (new MyStartTransition());
    }

    /**
     * Creates a <code>MyElementTransition</code>.
     *
     * @return ElementTransition
     */
    public ElementTransition createElementTransition() {
        return (new MyElementTransition());
    }

    /**
     * Creates a <code>MyTextTransition</code>.
     *
     * @return TextTransition
     */
    public TextTransition createTextTransition() {
        return (new MyTextTransition());
    }

    /**
     * Creates a <code>MyBranchingTransition</code>.
     *
     * @return BranchingTransition
     */
    public BranchingTransition createBranchingTransition() {
        return (new MyBranchingTransition());
    }

    /**
     * Creates a <code>MyMergingTransition</code>.
     *
     * @return MergingTransition
     */
    public MergingTransition createMergingTransition() {
        return (new MyMergingTransition());
    }

    /**
     * Creates a <code>MyOneOrMoreAttributeTransition</code>.
     *
     * @return OneOrMoreAttributeTransition
     */
    public OneOrMoreAttributeTransition createOneOrMoreAttributeTransition() {
        return (new MyOneOrMoreAttributeTransition());
    }

    /**
     * Creates a <code>MyNonExistentAttributeTransition</code>.
     *
     * @return NonExistentAttributeTransition
     */
    public NonExistentAttributeTransition createNonExistentAttributeTransition() {
        return (new MyNonExistentAttributeTransition());
    }

    /**
     * Creates a <code>MyAtomicTransition</code>.
     *
     * @return AtomicTransition
     */
    public AtomicTransition createAtomicTransition() {
        return (new MyAtomicTransition());
    }

    /**
     * Creates a <code>MyListTransition</code>.
     *
     * @return ListTransition
     */
    public ListTransition createListTransition() {
        return (new MyListTransition());
    }

}
