package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.ExceptNameClass;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyExceptNameClass extends ExceptNameClass implements Cloneable {

  public Object clone() throws CloneNotSupportedException {
    ExceptNameClass copy = (ExceptNameClass)super.clone();
    INameClassChoice copiedNameClass =
      (INameClassChoice)((IMyNameClassChoice)getNameClass()).clone();
    copy.setNameClass(copiedNameClass);
    return copy;
  }

  public ExceptNameClass deepCopy() {
    ExceptNameClass copy = SimpleSyntaxFactory.getFactory().createExceptNameClass();
    copy.setNameClass(((IMyNameClassChoice)getNameClass()).deepCopy());
    return (MyExceptNameClass)copy;
  }

  public org.iso_relax.miaou.btg.ExceptNameClass convert() {
    org.iso_relax.miaou.btg.ExceptNameClass copy =
      BinaryTreeGrammarFactory.getFactory().createExceptNameClass();
    copy.setNameClass(((IMyNameClassChoice)getNameClass()).convert());
    return copy;
  }
}