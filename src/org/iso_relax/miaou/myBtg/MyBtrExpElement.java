package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpElement;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpElement extends BtrExpElement
  implements AbstractBtrExp {


  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaLeft =
	((AbstractBtrExp)getBtrExp1()).automatize(patternNameNumbers);
    AbstractBinaryTreeAutomaton btaRight =
	((AbstractBtrExp)getBtrExp2()).automatize(patternNameNumbers);

    AbstractBinaryTreeAutomaton btaTemp = utility.createBinaryTreeAutomaton();

    btaTemp.addElementTransition(utility.createElementTransition(
      AutomatizationUtility.DUMMYLEFT,
      AutomatizationUtility.DUMMYRIGHT,
      AutomatizationUtility.NEW1,
      getNameClass()));
    btaTemp.addFinalTransition(utility.createFinalTransition(AutomatizationUtility.NEW1));

    int maxLeft = btaLeft.maxState();
    btaRight.incrementBy(maxLeft);
    int maxRight = btaRight.maxState();
    btaTemp.incrementBy((maxRight == 0)?maxLeft:maxRight);

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
