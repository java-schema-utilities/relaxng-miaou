package org.iso_relax.miaou.btg;

/**
 * @version binaryTreeGrammar.rng 1.0 (Sat Sep 07 19:30:34 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IRVisitor {
    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BinaryTreeGrammar visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BinaryTreeGrammar visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BinaryTreeGrammarStart visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BinaryTreeGrammarStart visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpElement visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpElement visitable);

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
    boolean enter(BtrExpOneOrMoreAttribute visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpOneOrMoreAttribute visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpNonExistentAttribute visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpNonExistentAttribute visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpInterleave visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpInterleave visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpAtomic visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpAtomic visitable);

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
    boolean enter(BtrExpList visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpList visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpChoice visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpChoice visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpProduct visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpProduct visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpRef visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpRef visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpText visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpText visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpOneOrMore visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpOneOrMore visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpNotAllowed visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpNotAllowed visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpEnd visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpEnd visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BtrExpVariable visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BtrExpVariable visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(BinaryTreeGrammarRule visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(BinaryTreeGrammarRule visitable);
}
