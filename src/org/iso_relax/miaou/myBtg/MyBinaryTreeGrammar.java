package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.BinaryTreeGrammar;
import org.iso_relax.miaou.myBtg.*;
import org.iso_relax.miaou.btg.*;
import org.iso_relax.miaou.abstractBta.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyBinaryTreeGrammar extends BinaryTreeGrammar {

  AutomatizationUtility utility = AutomatizationUtility.singleInstance();

  public AbstractBinaryTreeAutomaton automatize(){
    Hashtable patternNameNumbers = new Hashtable();

    for (int i = 0; i<getBinaryTreeGrammarRuleCount(); i++) {
      patternNameNumbers.put(getBinaryTreeGrammarRule(i).getName(),
                            new Integer (AutomatizationUtility.NAMEDDUMMIES - i));
    }

    AbstractBinaryTreeAutomaton startAutomaton =
      createStartAutomaton(patternNameNumbers);

    AbstractBinaryTreeAutomaton[] ruleAutomata =
      createRuleAutomata(startAutomaton.maxState(), patternNameNumbers);

    for (int j = 0; j<ruleAutomata.length; j++)
      startAutomaton = startAutomaton.expand(AutomatizationUtility.NAMEDDUMMIES - j,
                            ruleAutomata[j].finals());

    for (int i = 0; i<ruleAutomata.length; i++)
      for (int j = 0; j<ruleAutomata.length; j++)
        ruleAutomata[i] = ruleAutomata[i].expand(AutomatizationUtility.NAMEDDUMMIES - j,
                               ruleAutomata[j].finals());

    AbstractBinaryTreeAutomaton resultAutomaton =
      utility.createBinaryTreeAutomaton();

    resultAutomaton.merge(startAutomaton);
    for (int i = 0; i<ruleAutomata.length; i++) {
      ruleAutomata[i].clearFinalTransition();
      resultAutomaton.merge(ruleAutomata[i]);
    }
    return resultAutomaton;
  }

  private AbstractBinaryTreeAutomaton createStartAutomaton(
                Hashtable patternNameNumbers) {

    AbstractBtrExp startExp =
      (AbstractBtrExp)getBinaryTreeGrammarStart().getBtrExp();
    return startExp.automatize(patternNameNumbers);
  }

  private AbstractBinaryTreeAutomaton[] createRuleAutomata(
                int base,
                Hashtable patternNameNumbers) {

    AbstractBinaryTreeAutomaton[] ruleAutomata =
      new AbstractBinaryTreeAutomaton[getBinaryTreeGrammarRuleCount()];

    for (int i = 0; i<ruleAutomata.length; i++) {
      AbstractBtrExp ruleBody =
        ((AbstractBtrExp)getBinaryTreeGrammarRule(i).getBtrExp());
      ruleAutomata[i] = ruleBody.automatize(patternNameNumbers);
      ruleAutomata[i].incrementBy(base);
      int tmpBase = ruleAutomata[i].maxState();
      base = (tmpBase == 0)?base:tmpBase;
    }
    return ruleAutomata;
  }



}