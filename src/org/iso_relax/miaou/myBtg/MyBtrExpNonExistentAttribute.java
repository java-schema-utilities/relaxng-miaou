package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpNonExistentAttribute;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpNonExistentAttribute extends BtrExpNonExistentAttribute
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers){

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaRight =
	((AbstractBtrExp)getBtrExp()).automatize(patternNameNumbers);

    AbstractBinaryTreeAutomaton btaTemp = utility.createBinaryTreeAutomaton();

    AbstractNonExistentAttributeTransition mneat =
      utility.createNonExistentAttributeTransition(
                  AutomatizationUtility.DUMMYRIGHT,
                  AutomatizationUtility.NEW1,
                  getNameClass(),
                  getExceptNameClass());

    btaTemp.addNonExistentAttributeTransition(mneat);

    btaTemp.addFinalTransition(
        utility.createFinalTransition(AutomatizationUtility.NEW1));

    btaTemp.incrementBy(btaRight.maxState());

    int[] btaRightFinals = btaRight.finals();
    btaRight.clearFinalTransition();

    btaTemp = btaTemp.expand(AutomatizationUtility.DUMMYRIGHT, btaRightFinals);

    btaRight.merge(btaTemp);
    return btaRight;
  }
}
