package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.btg.*;
import java.util.Hashtable;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyRootGrammar extends RootGrammar {

  public BinaryTreeGrammar binarize() {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    Hashtable defineHash = new Hashtable();

    org.iso_relax.miaou.ss.Define[] defines = this.getDefine();
    for (int i = 0; i < defines.length; i++) {
      defineHash.put(defines[i].getName(), defines[i]);
    }

    BinaryTreeGrammar btg = factory.createBinaryTreeGrammar();
    addStart(btg, defineHash);
    for (int i = 0; i < getDefineCount(); i++) {
      MyDefine myDefine = (MyDefine)getDefine(i);
      btg.addBinaryTreeGrammarRule(myDefine.binarize(defineHash));
    }
    return btg;
  }
  private void addStart(BinaryTreeGrammar btg,
                         Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();

    BinaryTreeGrammarStart start = factory.createBinaryTreeGrammarStart();
    BtrExpProduct product = factory.createBtrExpProduct();
    product.setBtrExp1(factory.createBtrExpEnd());
    product.setBtrExp2(((IMyPatternChoice)getRootGrammarStart().getPattern()).
                      binarize(defineHash));
    start.setBtrExp(product);
    btg.setBinaryTreeGrammarStart(start);
  }


}
