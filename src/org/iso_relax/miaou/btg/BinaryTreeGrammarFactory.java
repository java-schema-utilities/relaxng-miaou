package org.iso_relax.miaou.btg;

/**
 * BinaryTreeGrammarFactory is generated by Relaxer based on binaryTreeGrammar.rng.
 *
 * @version binaryTreeGrammar.rng 1.0 (Sat Sep 07 19:30:34 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class BinaryTreeGrammarFactory {
    private static IBinaryTreeGrammarFactory factory;

    /**
     * Sets a factory.
     *
     * @param newFactory
     */
    public static void setFactory(IBinaryTreeGrammarFactory newFactory) {
        factory = newFactory;
    }

    /**
     * Gets the factory.
     *
     * @return IBinaryTreeGrammarFactory
     */
    public static IBinaryTreeGrammarFactory getFactory() {
        if (factory == null) {
            factory = new DefaultBinaryTreeGrammarFactory();
        }
        return (factory);
    }
}
