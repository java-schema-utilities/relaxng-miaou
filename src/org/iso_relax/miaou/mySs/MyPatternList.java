package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternList;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternList extends PatternList
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();

    BtrExpList list = factory.createBtrExpList();
    BtrExpProduct product = factory.createBtrExpProduct();
    product.setBtrExp1(factory.createBtrExpEnd());
    product.setBtrExp2(((IMyPatternChoice)getPattern()).binarize(defineHash));

    list.setBtrExp1(product);

    list.setBtrExp2(BinaryTreeGrammarFactory.getFactory().createBtrExpVariable());
    return list;
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternList(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */

  public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

  public IPatternChoice deepCopy() {
    PatternList copy = SimpleSyntaxFactory.getFactory().createPatternList();
    copy.setPattern(((IMyPatternChoice)getPattern()).deepCopy());
    return copy;
  }
}
