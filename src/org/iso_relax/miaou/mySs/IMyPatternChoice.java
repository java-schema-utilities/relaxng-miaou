package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.btg.AbstractBinaryTreeGrammarFactory;
import org.iso_relax.miaou.ss.IPatternChoice;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IMyPatternChoice extends org.iso_relax.miaou.ss.IPatternChoice {
  public Object clone() throws CloneNotSupportedException;
  public org.iso_relax.miaou.btg.IBtrExpChoice binarize(java.util.Hashtable defineHash);
  public IPatternChoice deepCopy();
}
