package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class InterleaveGetter extends RVisitorBase {

  private InterleaveNormalizer interleaveNormalizer;

  public InterleaveGetter(InterleaveNormalizer interleaveNormalizer) {
    this.interleaveNormalizer = interleaveNormalizer;
  }


  public void leave(org.iso_relax.miaou.ss.PatternInterleave interleave) {
    interleaveNormalizer.simplify(interleave);
  }

}