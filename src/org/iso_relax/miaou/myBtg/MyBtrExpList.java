package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpList;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpList extends BtrExpList
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaLeft =
	((AbstractBtrExp)getBtrExp1()).automatize(patternNameNumbers);
    AbstractBinaryTreeAutomaton btaRight =
	((AbstractBtrExp)getBtrExp2()).automatize(patternNameNumbers);

    AbstractBinaryTreeAutomaton btaTemp = utility.createBinaryTreeAutomaton();

    btaTemp.addListTransition(utility.createListTransition(
                              AutomatizationUtility.NEW1,
                              AutomatizationUtility.DUMMYLEFT,
                              AutomatizationUtility.DUMMYRIGHT));

    btaTemp.addFinalTransition(utility.createFinalTransition(AutomatizationUtility.NEW1));

    int leftMax = btaLeft.maxState();
    btaRight.incrementBy(leftMax);
    int rightMax = btaRight.maxState();
    btaTemp.incrementBy((rightMax == 0)?leftMax:rightMax);

    int[] finalsLeft = btaLeft.finals();
    btaLeft.clearFinalTransition();
    int[] finalsRight = btaRight.finals();
    btaRight.clearFinalTransition();

    btaTemp = btaTemp.expand(AutomatizationUtility.DUMMYLEFT, finalsLeft);
    btaTemp = btaTemp.expand(AutomatizationUtility.DUMMYRIGHT, finalsRight);

    btaLeft.merge(btaRight);
    btaLeft.merge(btaTemp);
    return btaLeft;
  }

}
