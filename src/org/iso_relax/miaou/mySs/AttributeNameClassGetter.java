package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.*;
import org.iso_relax.miaou.houseKeeping.SymbolTables;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class AttributeNameClassGetter extends RVisitorBase {

  private int nc = SymbolTables.NON_EXISTENT_INDEX;
  SymbolTables symbolTables;

  AttributeNameClassGetter(SymbolTables symbolTables) {
    this.symbolTables = symbolTables;
  }

  public boolean enter(PatternOneOrMoreAttribute oneOrMoreAttribute) {
    int newNc = oneOrMoreAttribute.getSyntaxExtensionNc();
    if (nc == SymbolTables.NON_EXISTENT_INDEX) {
      nc = newNc;
    }
    else {
      nc = symbolTables.getNameClassIdForChoice(nc, newNc);
    }
    return false;
  }

  public int getNameClassID() {
    return nc;
  }
}