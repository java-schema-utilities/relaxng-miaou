package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpText;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpText extends BtrExpText
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaLeft =
	((AbstractBtrExp)getBtrExp()).automatize(patternNameNumbers);

    AbstractBinaryTreeAutomaton btaTemp = utility.createBinaryTreeAutomaton();
    btaTemp.addTextTransition(
      utility.createTextTransition(AutomatizationUtility.DUMMYRIGHT, AutomatizationUtility.NEW1));
    btaTemp.addFinalTransition(
      utility.createFinalTransition(AutomatizationUtility.NEW1));

    btaTemp.incrementBy(btaLeft.maxState());

    int[] finalsLeft = btaLeft.finals();
    btaLeft.clearFinalTransition();
    btaLeft.merge(btaTemp);

    return btaLeft.expand(AutomatizationUtility.DUMMYRIGHT, finalsLeft);
  }
}