package org.iso_relax.miaou.bta;

/**
 * @version binaryTreeAutomaton.rng 1.0 (Sat Oct 19 02:26:41 JST 2002)
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

    /**
     * Gets the RContext property <b>rContext</b>.
     *
     * @return RContext
     */
    RContext getRContext();

    /**
     * Sets the RContext property <b>rContext</b>.
     *
     * @param rContext
     */
    void setRContext(RContext rContext);

    /**
     * Gets the property "rContext" which is resolved recursively.
     *
     * @return RContext
     */
    RContext getRContextResolved();
}
