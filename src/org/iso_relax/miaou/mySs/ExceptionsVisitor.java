package org.iso_relax.miaou.mySs;
import org.iso_relax.miaou.btg.BinaryTreeGrammarFactory;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class ExceptionsVisitor extends org.iso_relax.miaou.ss.RVisitorBase{

  private org.iso_relax.miaou.btg.Data targetData;
  private java.util.Hashtable defineHash;

  public ExceptionsVisitor(org.iso_relax.miaou.btg.Data targetData) {

    this.targetData = targetData;
  }

  public boolean enter(org.iso_relax.miaou.ss.PatternData pdata) {
    targetData.addContent(((MyPatternData)pdata).convert());
    return false;
  }

  public boolean enter(org.iso_relax.miaou.ss.PatternValue pvalue) {
    targetData.addContent(((MyPatternValue)pvalue).convert());
    return false;
  }
}
