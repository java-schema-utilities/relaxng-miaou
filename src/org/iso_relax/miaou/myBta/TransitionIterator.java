package org.iso_relax.miaou.myBta;

import java.util.Iterator;
import org.iso_relax.miaou.bta.BinaryTreeAutomaton;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class TransitionIterator implements Iterator {

  /**
   * the type of transitions
   */
  private short currentType;
  /**
   * the current position in the current type of transitions
   */
  private int currentPosition;

  private BinaryTreeAutomaton bta;

  final static short FINAL = 1;
  final static short START = 2;
  final static short ELEMENT_TRANSITION = 3;
  final static short TEXT_TRANSITION = 4;
  final static short BRANCHING_TRANSITION = 5;
  final static short MERGING_TRANSITION = 6;
  final static short ATTRIBUTE_TRANSITION = 7;
  final static short NONEXISTENT_ATTRIBUTE_TRANSITION = 8;
  final static short ATOMIC_TRANSITION = 9;
  final static short LIST_TRANSITION = 10;
  final static short END = 11;

  public TransitionIterator(BinaryTreeAutomaton bta) {
    this.bta = bta;
    currentType = FINAL;
    currentPosition = -1; //will become 0
    incrementByOne();
  }

  public boolean hasNext() {
    return (currentType != END);
  }

  public Object next() {
    Object next = null;
    switch (currentType) {
    case FINAL:
      next = bta.getFinalTransition(currentPosition);
      break;
    case START:
      next =  bta.getStartTransition(currentPosition);
      break;
    case ELEMENT_TRANSITION:
      next =  bta.getElementTransition(currentPosition);
      break;
    case TEXT_TRANSITION:
      next =  bta.getTextTransition(currentPosition);
      break;
    case BRANCHING_TRANSITION:
      next =  bta.getBranchingTransition(currentPosition);
      break;
    case MERGING_TRANSITION:
      next =  bta.getMergingTransition(currentPosition);
      break;
    case ATTRIBUTE_TRANSITION:
      next =  bta.getOneOrMoreAttributeTransition(currentPosition);
      break;
    case NONEXISTENT_ATTRIBUTE_TRANSITION:
      next =  bta.getNonExistentAttributeTransition(currentPosition);
      break;
    case ATOMIC_TRANSITION:
      next =  bta.getAtomicTransition(currentPosition);
      break;
    case LIST_TRANSITION:
      next =  bta.getListTransition(currentPosition);
      break;
    }
    incrementByOne();
    return next;
  }

  public void remove() {
    throw new UnsupportedOperationException("remove() is not implemented");
  }

  private void incrementByOne() {
    currentPosition++;
    if ((bta.getFinalTransitionCount() == currentPosition) &&
        (currentType == FINAL)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getStartTransitionCount() == currentPosition) &&
        (currentType == START)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getElementTransitionCount() ==currentPosition) &&
        (currentType == ELEMENT_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getTextTransitionCount() == currentPosition) &&
        (currentType == TEXT_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getBranchingTransitionCount() == currentPosition) &&
        (currentType == BRANCHING_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getMergingTransitionCount() == currentPosition) &&
        (currentType == MERGING_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getOneOrMoreAttributeTransitionCount() == currentPosition) &&
        (currentType == ATTRIBUTE_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getNonExistentAttributeTransitionCount() == currentPosition) &&
        (currentType == NONEXISTENT_ATTRIBUTE_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getAtomicTransitionCount() == currentPosition) &&
         (currentType == ATOMIC_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
    if ((bta.getListTransitionCount() == currentPosition) &&
         (currentType == LIST_TRANSITION)) {
      currentPosition = 0;
      currentType++;
    }
  }
}
