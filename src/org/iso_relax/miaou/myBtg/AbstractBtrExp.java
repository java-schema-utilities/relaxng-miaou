package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.abstractBta.AbstractBinaryTreeAutomaton;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface AbstractBtrExp {

  public AbstractBinaryTreeAutomaton automatize(java.util.Hashtable patternNameNumbers);
}