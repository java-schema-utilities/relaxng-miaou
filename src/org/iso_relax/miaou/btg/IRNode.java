package org.iso_relax.miaou.btg;

/**
 * @version binaryTreeGrammar.rng 1.0 (Sat Oct 19 02:26:53 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public interface IRNode {
    /**
     * Sets parent RNode.
     *
     * @param parent
     */
    void setParentRNode(IRNode parent);

    /**
     * Gets parent RNode.
     *
     * @return IRNode
     */
    IRNode getParentRNode();

    /**
     * Gets child RNodes.
     *
     * @return IRNode[]
     */
    IRNode[] getRNodes();
}
