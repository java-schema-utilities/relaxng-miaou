package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternText;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternText extends PatternText
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {
    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();

    BtrExpChoice choice = factory.createBtrExpChoice();
    BtrExpOneOrMore oneOrMore = factory.createBtrExpOneOrMore();
    BtrExpText text =  factory.createBtrExpText();
    BtrExpVariable var =  factory.createBtrExpVariable();

    choice.setBtrExp1(oneOrMore);
    choice.setBtrExp2(factory.createBtrExpVariable());
    oneOrMore.setBtrExp(text);
    text.setBtrExp(factory.createBtrExpVariable());

    return choice;
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternText(makeDocument());
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
    PatternText copy = SimpleSyntaxFactory.getFactory().createPatternText();
    return copy;
  }
}
