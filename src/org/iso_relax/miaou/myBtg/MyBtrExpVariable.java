package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpVariable;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpVariable extends BtrExpVariable
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton bta = utility.createBinaryTreeAutomaton();
//    bta.setStartTransition(
//      utility.createStartTransition(org.iso_relax.driver.Automatize.DUMMY));
    bta.setFinalTransition(
      utility.createFinalTransition(AutomatizationUtility.DUMMY));
    return bta;
  }
}