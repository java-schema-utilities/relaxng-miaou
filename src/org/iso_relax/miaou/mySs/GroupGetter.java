package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class GroupGetter extends RVisitorBase {

  private GroupNormalizer groupNormalizer;

  public GroupGetter(GroupNormalizer groupNormalizer) {
    this.groupNormalizer = groupNormalizer;
  }

  public void leave(org.iso_relax.miaou.ss.PatternGroup group) {
    groupNormalizer.simplify(group);
  }

}