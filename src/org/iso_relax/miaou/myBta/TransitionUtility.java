package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.ITransition;
import java.util.ArrayList;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class TransitionUtility {
  static private TransitionUtility singleInstance;

  private TransitionUtility () {
  }

  static public TransitionUtility singleInstance() {
    if (singleInstance == null)
      singleInstance = new TransitionUtility();
    return singleInstance;
  }

  /**
   * increment a state by delta, if the state is positive.
   * @param originalState
   * @param delta
   * @return renumbered state
   */
  public int renumber(int originalState, int delta) {
    return (originalState > 0) ? (originalState + delta) : originalState;
  }

  /**
   * computes the max state of a transition
   * @param transition
   * @return a max state
   */
  public int maxState(ITransition trans)
  {
    int max = 0;
    max = (trans.getState() > max) ? trans.getState(): max;
    max = (trans.getLeft() > max) ? trans.getLeft(): max;
    max = (trans.getRight() > max) ? trans.getRight(): max;
    max = (trans.getSource() > max) ? trans.getSource(): max;
    max = (trans.getTarget() > max) ? trans.getTarget(): max;
    max = (trans.getFirstSource() > max) ? trans.getFirstSource(): max;
    max = (trans.getSecondSource() > max) ? trans.getSecondSource(): max;
    max = (trans.getFirstTarget() > max) ? trans.getFirstTarget(): max;
    max = (trans.getSecondTarget() > max) ? trans.getSecondTarget(): max;
    return max;
  }

  /**
   * increment a transition by delta
   * @param trans
   * @param delta
   */
  public void incrementBy (ITransition trans, int delta) {
    trans.setState(renumber(trans.getState(), delta));
    trans.setLeft(renumber(trans.getLeft(), delta));
    trans.setRight(renumber(trans.getRight(), delta));
    trans.setSource(renumber(trans.getSource(), delta));
    trans.setTarget(renumber(trans.getTarget(), delta));
    trans.setFirstSource(renumber(trans.getFirstSource(), delta));
    trans.setSecondSource(renumber(trans.getSecondSource(), delta));
    trans.setFirstTarget(renumber(trans.getFirstTarget(), delta));
    trans.setSecondTarget(renumber(trans.getSecondTarget(), delta));
  }

  /**
   * create a transition for each actual state
   * @param trans
   * @param dummyState
   * @param actualStates
   * @return
   */
  public ArrayList expand(ITransition trans, int dummyState, int[] actualStates) {

    ArrayList transList = new ArrayList();

    try {
      if (trans.getState() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setState(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getLeft() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setLeft(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getRight() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setRight(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getSource() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setSource(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getTarget() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setTarget(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getFirstSource() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setFirstSource(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getSecondSource() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setSecondSource(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getFirstTarget() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setFirstTarget(actualStates[i]);
          transList.add(cl);
        }
      else if (trans.getSecondTarget() == dummyState)
        for (int i = 0; i < actualStates.length; i++) {
          ITransition cl = (ITransition)trans.clone();
          cl.setSecondTarget(actualStates[i]);
          transList.add(cl);
        }
      else
        transList.add(trans.clone());
    } catch (CloneNotSupportedException cnse) {
      cnse.printStackTrace();
      System.exit(-1);
    }
    return transList;
  }

}