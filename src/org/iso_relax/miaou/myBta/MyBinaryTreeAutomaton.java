package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import org.iso_relax.miaou.bta.*;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyBinaryTreeAutomaton extends AbstractBinaryTreeAutomaton {

  public void compactPrint(PrintWriter writer) {
    TransitionIterator ti = new TransitionIterator(this);
    while (ti.hasNext()) {
      ITransition at = (ITransition)ti.next();
      at.compactPrint(writer);
    }
  }

  public AbstractBinaryTreeAutomaton expand(int dummyState, int[] actualStates) {
    AbstractBinaryTreeAutomaton replica =
      (AbstractBinaryTreeAutomaton)
        BinaryTreeAutomatonFactory.getFactory().createBinaryTreeAutomaton();
    TransitionIterator ti = new TransitionIterator(this);
    while (ti.hasNext()) {
      ITransition at = (ITransition)ti.next();
      ArrayList expandedAts = at.expand(dummyState, actualStates);
      for (int i = 0; i < expandedAts.size(); i++)
        replica.addTransition((ITransition)expandedAts.get(i));
    }
    return replica;
  }

  /**
   *
   * @return a set of start states
   */
  public int[] starts() {
    StartTransition[] sts = getStartTransition();
    int[] starts = new int[sts.length];
    for (int i = 0; i < sts.length; i++) {
      MyStartTransition mst = (MyStartTransition)sts[i];
      starts[i] = mst.getState();
    }
    return starts;
  }

  /**
   * increment each transition by delta.
   * @param delta
   */
  public void incrementBy(int delta) {
    TransitionIterator ti = new TransitionIterator(this);
    while (ti.hasNext()) {
      ((ITransition)ti.next()).incrementBy(delta);
    }
  }

  public void addTransition(ITransition at) {
    if (at instanceof FinalTransition)
      addFinalTransition((FinalTransition)at);
    else if (at instanceof StartTransition)
      addStartTransition((StartTransition)at);
    else if (at instanceof ElementTransition)
      addElementTransition((ElementTransition)at);
    else if (at instanceof TextTransition)
      addTextTransition((TextTransition)at);
    else if (at instanceof BranchingTransition)
      addBranchingTransition((BranchingTransition)at);
    else if (at instanceof MergingTransition)
      addMergingTransition((MergingTransition)at);
    else if (at instanceof OneOrMoreAttributeTransition)
      addOneOrMoreAttributeTransition((OneOrMoreAttributeTransition)at);
    else if (at instanceof NonExistentAttributeTransition)
      addNonExistentAttributeTransition((NonExistentAttributeTransition)at);
    else if (at instanceof AtomicTransition)
      addAtomicTransition((AtomicTransition)at);
    else if (at instanceof ListTransition)
      addListTransition((ListTransition)at);
  }

  /**
   * merge two automata, but remove duplicates of start states and those
   * of final states.
   * @param another
   */
  public void merge(AbstractBinaryTreeAutomaton another) {
    TransitionIterator ti = new TransitionIterator(another);
    L: while (ti.hasNext()) {
      ITransition nextTransition = (ITransition)ti.next();
      for (int i = 0; i < getStartTransitionCount(); i++) {
        if ((nextTransition instanceof StartTransition) &&
            (getStartTransition(i).getState() == nextTransition.getState())) {
          continue L;
        }
      }
      for (int i = 0; i < getFinalTransitionCount(); i++) {
        if ((nextTransition instanceof FinalTransition) &&
            (getFinalTransition(i).getState() == nextTransition.getState())) {
          continue L;
        }
      }
      addTransition(nextTransition);
    }
  }

  /**
   *
   * @return a set of final states
   */
  public int[] finals() {
    FinalTransition[] fts = getFinalTransition();
    int[] finals = new int[fts.length];
    for (int i = 0; i < fts.length; i++) {
      MyFinalTransition mft = (MyFinalTransition)fts[i];
      finals[i] = mft.getState();
    }
    return finals;
  }

  /**
   * computes the max state
   * @return a max state
   */
  public int maxState() {
    int maxState = 0;
    TransitionIterator ti = new TransitionIterator(this);
    while (ti.hasNext()) {
      int tempState = ((ITransition)ti.next()).maxState();
      if (tempState > maxState)
        maxState = tempState;
    }
    return maxState;
  }
}
