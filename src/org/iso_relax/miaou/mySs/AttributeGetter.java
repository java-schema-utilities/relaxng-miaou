package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;
import java.util.LinkedList;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class AttributeGetter extends RVisitorBase {

  private LinkedList attributes;

  public AttributeGetter(LinkedList attributes) {
    this.attributes = attributes;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternOneOrMore oneOrMore) {
    return false;
  }

  public boolean enter (org.iso_relax.miaou.ss.PatternAttribute attribute) {
    attributes.add(attribute);
    return false;
  }
}