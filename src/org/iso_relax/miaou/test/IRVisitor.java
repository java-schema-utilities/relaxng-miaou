package org.iso_relax.miaou.test;

/**
 * @version testData.rng 1.0 (Sat Sep 07 22:04:57 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IRVisitor {
    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(RootTestData visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(RootTestData visitable);

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    boolean enter(RootTestDataCase visitable);

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    void leave(RootTestDataCase visitable);
}
