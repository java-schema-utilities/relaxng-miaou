package org.iso_relax.miaou.ss;

/**
 * @version simpleSyntax.rng 1.0 (Sat Sep 07 19:36:09 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RVisitorBase implements IRVisitor {

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
    public boolean enter(PatternData visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternData visitable) {
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
    public boolean enter(ExceptPattern visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(ExceptPattern visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternAttribute visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternAttribute visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternOneOrMoreAttribute visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternOneOrMoreAttribute visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternNonExistentAttribute visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternNonExistentAttribute visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternChoice visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternChoice visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternGroup visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternGroup visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternInterleave visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternInterleave visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternValue visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternValue visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternList visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternList visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternRef visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternRef visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternOneOrMore visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternOneOrMore visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternNotAllowed visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternNotAllowed visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternEmpty visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternEmpty visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(PatternText visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(PatternText visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(RootGrammar visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(RootGrammar visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(RootGrammarStart visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(RootGrammarStart visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(Define visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(Define visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(DefineElement visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(DefineElement visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(NameClass visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(NameClass visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(Pattern visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(Pattern visitable) {
    }
}
