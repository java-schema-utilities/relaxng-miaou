package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpProduct;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpProduct extends BtrExpProduct
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AbstractBinaryTreeAutomaton bta1 =
	((AbstractBtrExp)getBtrExp1()).automatize(patternNameNumbers);
    AbstractBinaryTreeAutomaton bta2 =
	((AbstractBtrExp)getBtrExp2()).automatize(patternNameNumbers);

    bta2.incrementBy(bta1.maxState());

    int[] bta1Finals = bta1.finals();
    bta1.clearFinalTransition();
    bta2 = bta2.expand(AutomatizationUtility.DUMMY, bta1Finals);

    bta1.merge(bta2);
    return bta1;
  }
}