package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternRef;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternRef extends PatternRef
  implements IMyPatternChoice, Cloneable {

 /**
  * binarize(&lt;ref name=nm"/&gt;) =
  *   &lt;Element&gt;
  *     nameClass
  *     &lt;Product&gt; &lt;End/&gt; &lt;Ref name="nm"/&gt; &lt;/Product&gt;
  *     &lt;Variable/&gt;
  *   &lt;/Element&gt;
  */

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();

    MyDefine define = (MyDefine)defineHash.get(getName());
    if (define == null) {
      System.err.print("Undefined label: ");
      System.err.println(getName());
      throw new java.lang.InternalError();
    }
    BtrExpElement elem = factory.createBtrExpElement();
    BtrExpRef ref = factory.createBtrExpRef();

    elem.setNameClass(((MyDefineElement)define.getDefineElement()).getMyNameClass().convert());
    elem.setBtrExp1(ref);
    ref.setName(getName());
    elem.setBtrExp2(factory.createBtrExpVariable());

    return elem;
  }
    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternRef(makeDocument());
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
    PatternRef copy = SimpleSyntaxFactory.getFactory().createPatternRef();
    copy.setName(getName());
    return copy;
  }
}
