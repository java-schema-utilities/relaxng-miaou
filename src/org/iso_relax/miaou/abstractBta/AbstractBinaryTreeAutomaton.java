package org.iso_relax.miaou.abstractBta;

import org.iso_relax.miaou.bta.BinaryTreeAutomaton;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public abstract class AbstractBinaryTreeAutomaton extends BinaryTreeAutomaton {

  /**
   * Print a compact textual representation.
   */
  abstract public void compactPrint(PrintWriter writer);

    /**
     * Compute the maximum state.
     */
  abstract public int maxState();

    /**
     * Increment the states by delta.
     */
  abstract public void incrementBy(int delta);

    /**
     * Merge with the parameter automaton
     */

  abstract public void merge(AbstractBinaryTreeAutomaton another);

    /**
     * Expands a dummy state with a set of actual states.
     * More than one transition may be created from a single transition.
     */
  abstract public AbstractBinaryTreeAutomaton expand(int dummyState, int[] actualStates);

    /**
     * Compute the set of final states.
     */
  abstract public int[] finals();

    /**
     * Compute the set of start states.
     */

  abstract public int[] starts();

    /**
     * Add a transition.
     */

  abstract public void addTransition(ITransition at);
}
