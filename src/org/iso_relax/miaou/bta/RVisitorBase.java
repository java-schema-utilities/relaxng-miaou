package org.iso_relax.miaou.bta;

/**
 * @version binaryTreeAutomaton.rng 1.0 (Sat Sep 07 19:30:30 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RVisitorBase implements IRVisitor {

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BinaryTreeAutomaton visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BinaryTreeAutomaton visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(FinalTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(FinalTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(StartTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(StartTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(ElementTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(ElementTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NameClassNsName visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NameClassNsName visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(ExceptNameClass visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(ExceptNameClass visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NameClassChoice visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NameClassChoice visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NameClassAnyName visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NameClassAnyName visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NameClassName visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NameClassName visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(TextTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(TextTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BranchingTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BranchingTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(MergingTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(MergingTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(OneOrMoreAttributeTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(OneOrMoreAttributeTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NonExistentAttributeTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NonExistentAttributeTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(AtomicTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(AtomicTransition visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(Data visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(Data visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(Param visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(Param visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(Value visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(Value visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(ListTransition visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(ListTransition visitable) {
    }
}
