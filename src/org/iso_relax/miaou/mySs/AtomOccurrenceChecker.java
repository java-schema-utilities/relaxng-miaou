package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternList;
import org.iso_relax.miaou.ss.PatternRef;
import org.iso_relax.miaou.ss.PatternText;
import org.iso_relax.miaou.ss.PatternData;
import org.iso_relax.miaou.ss.PatternValue;
import org.iso_relax.miaou.ss.PatternOneOrMoreAttribute;
import org.iso_relax.miaou.ss.PatternNonExistentAttribute;

import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * This class tests if a pattern contains non-attribute atoms
 * and also tests if it contains attribute atoms.
 *
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class AtomOccurrenceChecker extends RVisitorBase {

    private boolean nonAttributeless = true;
    private boolean attributeless = true;

    public boolean enter(PatternList list) {
      nonAttributeless = false;
      return (false);
    }

    public boolean enter(PatternRef ref) {
      nonAttributeless = false;
      return (false);
    }

    public boolean enter(PatternText text) {
      nonAttributeless = false;
      return (false);
    }

    public boolean enter(PatternData data) {
      nonAttributeless = false;
      return (false);
    }

    public boolean enter(PatternValue value) {
      nonAttributeless = false;
      return (false);
    }

    public boolean enter(PatternOneOrMoreAttribute oma) {
      attributeless = false;
      return (false);
    }

    public boolean enter(PatternNonExistentAttribute nea) {
      attributeless = false;
      return (false);
    }

    public boolean attributeless() {
      return attributeless;
    }

    public boolean nonAttributeless() {
      return nonAttributeless;
    }

}