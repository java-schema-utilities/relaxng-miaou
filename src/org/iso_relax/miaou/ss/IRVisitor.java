package org.iso_relax.miaou.ss;

/**
 * @version simpleSyntax.rng 1.0 (Sat Oct 19 02:27:01 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IRVisitor {
    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternData visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternData visitable);

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
    boolean enter(ExceptPattern visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(ExceptPattern visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternAttribute visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternAttribute visitable);

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
    boolean enter(PatternOneOrMoreAttribute visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternOneOrMoreAttribute visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternNonExistentAttribute visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternNonExistentAttribute visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternChoice visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternChoice visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternGroup visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternGroup visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternInterleave visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternInterleave visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternValue visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternValue visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternList visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternList visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternRef visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternRef visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternOneOrMore visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternOneOrMore visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternNotAllowed visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternNotAllowed visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternEmpty visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternEmpty visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(PatternText visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(PatternText visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(RootGrammar visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(RootGrammar visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(RootGrammarStart visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(RootGrammarStart visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(Define visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(Define visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(DefineElement visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(DefineElement visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(NameClassID visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(NameClassID visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(Pattern visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(Pattern visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(ExceptNameClassID visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(ExceptNameClassID visitable);
}
