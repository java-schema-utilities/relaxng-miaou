package org.iso_relax.miaou.bta;

/**
 * @version binaryTreeAutomaton.rng 1.0 (Sat Sep 07 19:30:30 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IRVisitor {
    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BinaryTreeAutomaton visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BinaryTreeAutomaton visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(FinalTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(FinalTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(StartTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(StartTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(ElementTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(ElementTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NameClassNsName visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NameClassNsName visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(ExceptNameClass visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(ExceptNameClass visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NameClassChoice visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NameClassChoice visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NameClassAnyName visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NameClassAnyName visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NameClassName visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NameClassName visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(TextTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(TextTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BranchingTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BranchingTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(MergingTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(MergingTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(OneOrMoreAttributeTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(OneOrMoreAttributeTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NonExistentAttributeTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NonExistentAttributeTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(AtomicTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(AtomicTransition visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(Data visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(Data visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(Param visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(Param visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(Value visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(Value visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(ListTransition visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(ListTransition visitable);
}
