package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpNotAllowed;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpNotAllowed extends BtrExpNotAllowed
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    return utility.createBinaryTreeAutomaton();
  }
}