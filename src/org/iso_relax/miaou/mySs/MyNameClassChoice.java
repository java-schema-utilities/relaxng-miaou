package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.NameClassChoice;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;
import org.iso_relax.miaou.houseKeeping.SymbolTables;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyNameClassChoice
  extends NameClassChoice
  implements IMyNameClassChoice, Cloneable {
    /*
  public org.iso_relax.miaou.ss.INameClassChoice deepCopy() {
    try {
      return SimpleSyntaxFactory.getFactory().createNameClassChoice(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }

  public org.iso_relax.miaou.btg.INameClassChoice convert() {
    try {
      return BinaryTreeGrammarFactory.getFactory().createNameClassChoice(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      return null;
    }
  }
    */
  public Object clone() throws CloneNotSupportedException {
    NameClassChoice copy = (NameClassChoice)super.clone();
    INameClassChoice nc1 =
      (INameClassChoice)((IMyNameClassChoice)getNameClass1()).clone();
    INameClassChoice nc2 =
      (INameClassChoice)((IMyNameClassChoice)getNameClass2()).clone();
    copy.setNameClass1(nc1);
    copy.setNameClass2(nc2);
    return copy;
  }

  public INameClassChoice deepCopy() {
    NameClassChoice copy = SimpleSyntaxFactory.getFactory().createNameClassChoice();
    copy.setNameClass1(((IMyNameClassChoice)getNameClass1()).deepCopy());
    copy.setNameClass2(((IMyNameClassChoice)getNameClass2()).deepCopy());
    return copy;
  }

  public int getID(SymbolTables symbolTables) {
    int first = ((IMyNameClassChoice)getNameClass1()).getID(symbolTables);
    int second = ((IMyNameClassChoice)getNameClass2()).getID(symbolTables);
    return symbolTables.getNameClassIdForChoice(first, second);
  }
}
