package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.Define;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyDefine extends Define {

/**
 * biniarize(&lt;define&gt;nameNCName
 *              &lt;element&gt;nameClass top&lt;/element&gt;&lt;/define&gt;) =
 *    &lt;Rule&gt;
 *      nameNCName
 *      bin(top)
 *    &lt;/Rule&gt;
 */

  public BinaryTreeGrammarRule binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();

    BinaryTreeGrammarRule btgRule = factory.createBinaryTreeGrammarRule();

    btgRule.setName(getName());

    BtrExpProduct product = factory.createBtrExpProduct();
    product.setBtrExp1(factory.createBtrExpEnd());

    IMyPatternChoice pattern =
      (IMyPatternChoice)getDefineElement().getPattern();
    product.setBtrExp2(pattern.binarize(defineHash));

    btgRule.setBtrExp(product);

    return btgRule;
  }
}
