package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpOneOrMore;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpOneOrMore extends BtrExpOneOrMore
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers){

    AbstractBinaryTreeAutomaton btaLeft =
	((AbstractBtrExp)getBtrExp()).automatize(patternNameNumbers);

    int[] btaLeftFinals = btaLeft.finals();
    int[] newFinals = new int[btaLeftFinals.length + 1];
    for (int i = 0; i < btaLeftFinals.length; i++)
      newFinals[i] = btaLeftFinals[i];
    newFinals[btaLeftFinals.length] = AutomatizationUtility.DUMMY;

    return btaLeft.expand(AutomatizationUtility.DUMMY, newFinals);
  }
}