package org.iso_relax.miaou.btg;

/**
 * @version binaryTreeGrammar.rng 1.0 (Sat Sep 07 19:30:34 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RVisitorBase implements IRVisitor {

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BinaryTreeGrammar visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BinaryTreeGrammar visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BinaryTreeGrammarStart visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BinaryTreeGrammarStart visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpElement visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpElement visitable) {
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
    public boolean enter(BtrExpOneOrMoreAttribute visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpOneOrMoreAttribute visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpNonExistentAttribute visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpNonExistentAttribute visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpInterleave visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpInterleave visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpAtomic visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpAtomic visitable) {
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
    public boolean enter(BtrExpList visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpList visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpChoice visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpChoice visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpProduct visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpProduct visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpRef visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpRef visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpText visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpText visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpOneOrMore visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpOneOrMore visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpNotAllowed visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpNotAllowed visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpEnd visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpEnd visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BtrExpVariable visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BtrExpVariable visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(BinaryTreeGrammarRule visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(BinaryTreeGrammarRule visitable) {
    }
}
