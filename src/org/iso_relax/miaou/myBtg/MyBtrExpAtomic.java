package org.iso_relax.miaou.myBtg;


import org.iso_relax.miaou.btg.BtrExpAtomic;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpAtomic extends BtrExpAtomic
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers){

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaRight =
	((AbstractBtrExp)getBtrExp()).automatize(patternNameNumbers);

    AbstractBinaryTreeAutomaton btaTemp = utility.createBinaryTreeAutomaton();

    btaTemp.addAtomicTransition(
      utility.createAtomicTransition(
        AutomatizationUtility.DUMMYRIGHT,
        AutomatizationUtility.NEW1,
        getContent()));

    btaTemp.addFinalTransition(
      utility.createFinalTransition(AutomatizationUtility.NEW1));

    btaTemp.incrementBy(btaRight.maxState());

    int[] finalsRight = btaRight.finals();
    btaRight.clearFinalTransition();

    btaTemp = btaTemp.expand(AutomatizationUtility.DUMMYRIGHT, finalsRight);

    btaRight.merge(btaTemp);
    return btaRight;
  }
}
