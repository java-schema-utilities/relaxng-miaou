package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BtrExpChoice;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBtrExpChoice extends BtrExpChoice
  implements AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(Hashtable patternNameNumbers) {

    AutomatizationUtility utility = AutomatizationUtility.singleInstance();

    AbstractBinaryTreeAutomaton btaLeft =
	((AbstractBtrExp)getBtrExp1()).automatize(patternNameNumbers);
    AbstractBinaryTreeAutomaton btaRight =
	((AbstractBtrExp)getBtrExp2()).automatize(patternNameNumbers);
    btaRight.incrementBy(btaLeft.maxState());

//    org.iso_relax.driver.Dumper.singleInstance().print(btaLeft, "operandLeft");
//    org.iso_relax.driver.Dumper.singleInstance().print(btaRight, "operandRight");

    AbstractBinaryTreeAutomaton result = utility.createBinaryTreeAutomaton();
    result.merge(btaLeft);
    result.merge(btaRight);

//    org.iso_relax.driver.Printer.singleInstance().print(result, "result");
    return result;
  }
}