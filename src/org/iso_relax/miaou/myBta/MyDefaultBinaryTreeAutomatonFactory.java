package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.bta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyDefaultBinaryTreeAutomatonFactory
  extends DefaultBinaryTreeAutomatonFactory {
    /**
     * Creates a default <code>AtomicTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return AtomicTransition
     */
    public AtomicTransition createAtomicTransition() {
        return new MyAtomicTransition();
    }
    /**
     * Creates a default <code>Data</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return Data
     */
    public Data createData() {
        return (new MyData());
    }

    /**
     * Creates a default <code>Value</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return Value
     */
    public Value createValue() {
        return new MyValue();
    }

    /**
     * Creates a default <code>BinaryTreeAutomaton</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return BinaryTreeAutomaton
     */
    public BinaryTreeAutomaton createBinaryTreeAutomaton() {
        return new MyBinaryTreeAutomaton();
    }

    /**
     * Creates a default <code>BranchingTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return BranchingTransition
     */

    public BranchingTransition createBranchingTransition() {
        return new MyBranchingTransition();
    }

    /**
     * Creates a default <code>ElementTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return ElementTransition
     */
    public ElementTransition createElementTransition() {
        return new MyElementTransition();
    }

    /**
     * Creates a default <code>ExceptNameClass</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return ExceptNameClass
     */
    public ExceptNameClass createExceptNameClass() {
        return new MyExceptNameClass();
    }

    /**
     * Creates a default <code>FinalTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return FinalTransition
     */
    public FinalTransition createFinalTransition() {
        return new MyFinalTransition();
    }

    /**
     * Creates a default <code>ListTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return ListTransition
     */
    public ListTransition createListTransition() {
        return new MyListTransition();
    }

    /**
     * Creates a default <code>MergingTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return MergingTransition
     */
    public MergingTransition createMergingTransition() {
        return new MyMergingTransition();
    }

    /**
     * Creates a default <code>NameClassAnyName</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return NameClassAnyName
     */
    public NameClassAnyName createNameClassAnyName() {
        return new MyNameClassAnyName();
    }


    /**
     * Creates a default <code>NameClassChoice</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return NameClassChoice
     */
    public NameClassChoice createNameClassChoice() {
        return new MyNameClassChoice();
    }

    /**
     * Creates a default <code>NameClassName</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return NameClassName
     */
    public NameClassName createNameClassName() {
        return new MyNameClassName();
    }

    /**
     * Creates a default <code>NameClassNsName</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return NameClassNsName
     */
    public NameClassNsName createNameClassNsName() {
        return new MyNameClassNsName();
    }

    /**
     * Creates a default <code>NonExistentAttributeTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return NonExistentAttributeTransition
     */
    public NonExistentAttributeTransition createNonExistentAttributeTransition() {
        return new MyNonExistentAttributeTransition();
    }

    /**
     * Creates a default <code>OneOrMoreAttributeTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return OneOrMoreAttributeTransition
     */
    public OneOrMoreAttributeTransition createOneOrMoreAttributeTransition() {
        return new MyOneOrMoreAttributeTransition();
    }

    /**
     * Creates a default <code>StartTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return StartTransition
     */
    public StartTransition createStartTransition() {
        return new MyStartTransition();
    }

    /**
     * Creates a default <code>TextTransition</code>.
     * This method is a hook method of the AbstractBinaryTreeAutomatonFactory.
     *
     * @return TextTransition
     */
    public TextTransition createTextTransition() {
        return new MyTextTransition();
    }
}