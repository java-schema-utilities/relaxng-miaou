package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.Data;
import org.iso_relax.miaou.bta.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyData extends Data implements IMyDataChoice, Cloneable  {
/*
  public org.iso_relax.bta.IDataChoice duplicate () {
    org.w3c.dom.Document doc = null;
    try {
      doc = makeDocument();
    } catch (javax.xml.parsers.ParserConfigurationException pce) {
      pce.printStackTrace();
    }
    return new org.iso_relax.bta.Value(doc);
  }
*/

  public Object clone() throws CloneNotSupportedException {
    MyData copy = (MyData)super.clone();
    for (int i = 0; i < getParamCount(); i++) {
      copy.addParam((MyParam)(((MyParam)getParam(i)).clone()));
    }
    for (int i = 0; i < getContentCount(); i++) {
      copy.addContent((IMyDataChoice)(((IMyDataChoice)getContent(i)).clone()));
    }
    return copy;
  }

  public org.iso_relax.miaou.bta.IAtomicTransitionChoice convert() {

    org.iso_relax.miaou.bta.Data copy =
      BinaryTreeAutomatonFactory.getFactory().createData();

    copy.setType(getType());
    copy.setDatatypeLibrary(getDatatypeLibrary());

    for (int i = 0; i < getParamCount(); i++) {
      Param copiedParam = ((MyParam)getParam(i)).convert();
      copy.addParam(copiedParam);
    }

    for (int i = 0; i < getContentCount(); i++) {
      IMyDataChoice dataOrValue = (IMyDataChoice)getContent(i);
      copy.addContent((IDataChoice)dataOrValue.convert());
    }

    return copy;
  }
}