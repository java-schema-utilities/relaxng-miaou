package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpEnd;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpEnd extends BtrExpEnd
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {
    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton bta = utility.createBinaryTreeAutomaton();
    bta.setStartTransition(utility.createStartTransition(AutomatizationUtility.END));
    bta.setFinalTransition(utility.createFinalTransition(AutomatizationUtility.END));
    return bta;
  }
}