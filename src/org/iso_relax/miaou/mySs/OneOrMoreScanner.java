package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;
import java.util.LinkedList;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class OneOrMoreScanner extends RVisitorBase {

  private LinkedList attributeUnderChoiceList;
  private LinkedList nonAttributeUnderChoice;

  public OneOrMoreScanner(LinkedList attributeUnderChoiceList,
                            LinkedList nonAttributeUnderChoice) {

    this.attributeUnderChoiceList = attributeUnderChoiceList;
    this.nonAttributeUnderChoice = nonAttributeUnderChoice;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternText text) {
    nonAttributeUnderChoice.add(text);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternEmpty empty) {
    nonAttributeUnderChoice.add(empty);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternData data) {
    nonAttributeUnderChoice.add(data);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternValue value) {
    nonAttributeUnderChoice.add(value);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternList list) {
    nonAttributeUnderChoice.add(list);
    return false;
  }

  public boolean enter(org.iso_relax.miaou.ss.PatternAttribute attribute) {
    attributeUnderChoiceList.add(attribute);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternRef ref) {
    nonAttributeUnderChoice.add(ref);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternOneOrMore oneOrMore) {
    return true;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternChoice choice) {
    return true;
  }

 public boolean enter (org.iso_relax.miaou.ss.PatternGroup group) {
    nonAttributeUnderChoice.add(group);
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternInterleave interleave) {
    nonAttributeUnderChoice.add(interleave);
    return false;
  }
}