package org.iso_relax.miaou.test;

/**
 * @version testData.rng 1.0 (Sat Sep 07 22:04:57 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RVisitorBase implements IRVisitor {

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(RootTestData visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(RootTestData visitable) {
    }

    /**
     * Visits this node for enter behavior.
     *
     * @param visitable
     * @return boolean
     */
    public boolean enter(RootTestDataCase visitable) {
        return (true);
    }

    /**
     * Visits this node for leave behavior.
     *
     * @param visitable
     */
    public void leave(RootTestDataCase visitable) {
    }
}
