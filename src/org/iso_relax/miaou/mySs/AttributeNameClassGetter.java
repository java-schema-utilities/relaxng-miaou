package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class AttributeNameClassGetter extends RVisitorBase {

  private INameClassChoice nc;

  public boolean enter(PatternOneOrMoreAttribute oneOrMoreAttribute) {
    INameClassChoice newNc =
      ((org.iso_relax.miaou.mySs.IMyNameClassChoice)oneOrMoreAttribute.getNameClass()).deepCopy();
    if (nc == null) {
      nc = newNc;
    }
    else {
      NameClassChoice choice =
        SimpleSyntaxFactory.getFactory().createNameClassChoice();
      choice.setNameClass1(nc);
      choice.setNameClass2(newNc);
      nc = choice;
    }
    return false;
  }

  public INameClassChoice getNameClass() {
    return nc;
  }
}