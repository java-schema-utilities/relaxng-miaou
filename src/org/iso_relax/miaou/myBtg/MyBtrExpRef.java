package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpRef;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpRef extends BtrExpRef
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton bta = utility.createBinaryTreeAutomaton();
    Integer anInteger =  (Integer)(patternNameNumbers.get(getName()));
    bta.setFinalTransition(
      utility.createFinalTransition(anInteger.intValue()));
    return bta;
  }
}