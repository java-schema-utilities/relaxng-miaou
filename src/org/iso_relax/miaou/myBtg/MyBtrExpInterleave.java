package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpInterleave;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpInterleave extends BtrExpInterleave
  implements AbstractBtrExp {

  static AutomatizationUtility utility = AutomatizationUtility.singleInstance();

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AbstractBinaryTreeAutomaton btaTail =
      ((AbstractBtrExp)getBtrExp3()).automatize(patternNameNumbers);


    AbstractBinaryTreeAutomaton btaAllButTail =
      createAllButTail(btaTail.maxState(),
                        btaTail.finals(),
                        patternNameNumbers);

    //(Stail, {}, Ttail)
    btaTail.clearFinalTransition();

    btaTail.merge(btaAllButTail);
    return btaTail;
  }


  private AbstractBinaryTreeAutomaton createAllButTail (
       int maxOfPreviousBTA,
       int[] actualStates,
       Hashtable patternNameNumbers) {

    //do nothing to btaBranching here.

    AbstractBinaryTreeAutomaton btaAllButTail =
      utility.createBinaryTreeAutomaton();

    AbstractBinaryTreeAutomaton branchingBta =
      createBranchingBta();

    int branchingBtaMax = branchingBta.maxState();

    AbstractBinaryTreeAutomaton bta1 =
      createIngredientBTA(((AbstractBtrExp)getBtrExp1()),
                          branchingBtaMax,
                          AutomatizationUtility.NEW1,
                          patternNameNumbers);

    int bta1Max = bta1.maxState();

    AbstractBinaryTreeAutomaton bta2 =
      createIngredientBTA(((AbstractBtrExp)getBtrExp2()),
                          (bta1Max == 0)?branchingBtaMax:bta1Max,
                          AutomatizationUtility.NEW2,
                          patternNameNumbers);

    int bta2Max = bta2.maxState();

    int max = (bta2Max == 0)?((bta1Max == 0)?branchingBtaMax:bta1Max):bta2Max;
    AbstractBinaryTreeAutomaton mergingBta =
      createMergingBta(max, bta1.finals(), bta2.finals());

    //  ({}, {}, T1)
    bta1.clearStartTransition();
    bta1.clearFinalTransition();

    //  ({}, {}, T2)
    bta2.clearStartTransition();
    bta2.clearFinalTransition();

    btaAllButTail.merge(branchingBta);
    btaAllButTail.merge(bta1);
    btaAllButTail.merge(bta2);
    btaAllButTail.merge(mergingBta);

    //renumber states in btaAllButTail
    //To use states (final states) of btaTail, expansion must follow renumbering.
    btaAllButTail.incrementBy(maxOfPreviousBTA);
    btaAllButTail = btaAllButTail.expand(AutomatizationUtility.DUMMY, actualStates);

    return btaAllButTail;
}

  private AbstractBinaryTreeAutomaton createBranchingBta() {
    AbstractBinaryTreeAutomaton branchingBta =
      utility.createBinaryTreeAutomaton();
    branchingBta.addBranchingTransition(
      utility.createBranchingTransition(AutomatizationUtility.DUMMY,
                                AutomatizationUtility.NEW1,
                                AutomatizationUtility.NEW2));
    return branchingBta;
  }

/** renumber states in bta1
 *  To use the newly created state (NEW1) in btaBranching, expansion must
 *  follow renumbering.
 */

  private AbstractBinaryTreeAutomaton createIngredientBTA(
       AbstractBtrExp btrExp,
       int maxOfPreviousBTA,
       int replacingState,
       Hashtable patternNameNumbers) {

    AbstractBinaryTreeAutomaton ingredientBta =
	btrExp.automatize(patternNameNumbers);

    ingredientBta.incrementBy(maxOfPreviousBTA);
    int[] actualStates = new int [1];
    actualStates[0] = replacingState;
    return ingredientBta.expand(AutomatizationUtility.DUMMY, actualStates);
  }

/**
 * btaMerging is replaced by the final states of bta1 and those of bta2.
 * Replacing is done by after applying incrementBy so that states
 * in bta1 and bta2 can be used.
 *
 */

  private AbstractBinaryTreeAutomaton createMergingBta(
    int max,
    int[] actualStates1,
    int[] actualStates2) {

    AbstractBinaryTreeAutomaton mergingBta =
      utility.createBinaryTreeAutomaton();
    mergingBta.addMergingTransition(
      utility.createMergingTransition(AutomatizationUtility.DUMMYEND1,
                                      AutomatizationUtility.DUMMYEND2,
                                      AutomatizationUtility.NEW1));
    mergingBta.addFinalTransition(
      utility.createFinalTransition(AutomatizationUtility.NEW1));

    mergingBta.incrementBy(max);
    mergingBta = mergingBta.expand(AutomatizationUtility.DUMMYEND1, actualStates1);
    mergingBta = mergingBta.expand(AutomatizationUtility.DUMMYEND2, actualStates2);
    return mergingBta;
  }

}