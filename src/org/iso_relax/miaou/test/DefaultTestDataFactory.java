package org.iso_relax.miaou.test;

import org.w3c.dom.*;

/**
 * DefaultTestDataFactory is generated by Relaxer based on testData.rng.
 *
 * @version testData.rng 1.0 (Sat Oct 19 02:27:05 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class DefaultTestDataFactory extends AbstractTestDataFactory {

    /**
     * Creates a default <code>RootTestData</code>.
     * This method is a hook method of the AbstractTestDataFactory.
     *
     * @return RootTestData
     */
    public RootTestData createRootTestData() {
        return (new RootTestData());
    }

    /**
     * Creates a default <code>RootTestDataCase</code>.
     * This method is a hook method of the AbstractTestDataFactory.
     *
     * @return RootTestDataCase
     */
    public RootTestDataCase createRootTestDataCase() {
        return (new RootTestDataCase());
    }
}
