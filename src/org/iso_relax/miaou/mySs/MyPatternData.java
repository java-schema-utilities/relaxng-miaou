package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.PatternData;
import org.iso_relax.miaou.ss.ExceptPattern;
import org.iso_relax.miaou.ss.Param;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.SimpleSyntaxFactory;
import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyPatternData extends PatternData
  implements IMyPatternChoice, Cloneable {

  public IBtrExpChoice binarize(java.util.Hashtable defineHash) {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    BtrExpAtomic atomic = factory.createBtrExpAtomic();
    atomic.setContent(convert());
    atomic.setBtrExp(factory.createBtrExpVariable());
    return atomic;
  }

    /*
  public IMyPatternChoice deepCopy() {
    try {
      return (IMyPatternChoice)
              SimpleSyntaxFactory.getFactory().createPatternData(makeDocument());
    }
    catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
      return null;
    }
  }
    */


  public Object clone() throws CloneNotSupportedException {
    PatternData copy = (PatternData)super.clone();
    if (getExceptPattern() != null) {
      MyExceptPattern origExcept = (MyExceptPattern)getExceptPattern();
      ExceptPattern copiedExcept = (ExceptPattern)origExcept.clone();
      copy.setExceptPattern(copiedExcept);
    }
    for (int i = 0; i < getParamCount(); i++) {
      copy.addParam(((MyParam)getParam(i)).deepCopy());
    }
    return copy;
  }

  public IPatternChoice deepCopy() {
    PatternData copy = SimpleSyntaxFactory.getFactory().createPatternData();
    copy.setType(getType());
    copy.setDatatypeLibrary(getDatatypeLibrary());

    if (getExceptPattern() != null) {
      ExceptPattern exceptPattern =
        SimpleSyntaxFactory.getFactory().createExceptPattern();
      exceptPattern.setPattern(
        ((IMyPatternChoice)getExceptPattern().getPattern()).deepCopy());
      copy.setExceptPattern(exceptPattern);
    }
    for (int i = 0; i < getParamCount(); i++) {
      copy.addParam(((MyParam)getParam(i)).deepCopy());
    }

    return copy;
  }

  public org.iso_relax.miaou.btg.Data convert() {

    IBinaryTreeGrammarFactory factory = BinaryTreeGrammarFactory.getFactory();
    org.iso_relax.miaou.btg.Data copy = factory.createData();

    copy.setType(getType());
    copy.setDatatypeLibrary(getDatatypeLibrary());

    for (int i = 0; i < getParamCount(); i++) {
      copy.addParam(((MyParam)getParam(i)).convert());
    }

    if (getExceptPattern() != null) {
      ExceptionsVisitor exceptionsVisitor =
          new ExceptionsVisitor(copy);
      org.iso_relax.miaou.ss.URVisitor.traverse(
          getExceptPattern(),
          exceptionsVisitor);
    }

    return copy;
  }

}
