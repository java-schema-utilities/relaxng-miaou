package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class NameClassNameGetter extends RVisitorBase {
  private java.util.LinkedList nameList;

  public NameClassNameGetter(java.util.LinkedList nameList) {
    this.nameList = nameList;
  }

  public boolean enter (org.iso_relax.miaou.ss.NameClassName name) {
    nameList.add(name);
    return true;
  }

  public boolean enter (org.iso_relax.miaou.ss.NameClassAnyName anyName) {
    System.err.println("anyName should not be found here");
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.NameClassNsName nsName) {
    System.err.println("nsName should not be found here");
    return false;
  }
}