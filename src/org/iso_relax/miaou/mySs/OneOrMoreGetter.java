package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;
import java.util.LinkedList;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class OneOrMoreGetter extends RVisitorBase {

  private LinkedList topLevelOneOrMores;

  public OneOrMoreGetter(LinkedList topLevelOneOrMores) {

    this.topLevelOneOrMores = topLevelOneOrMores;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternOneOrMore oneOrMore) {
    topLevelOneOrMores.add(oneOrMore);
    return false;
  }

}