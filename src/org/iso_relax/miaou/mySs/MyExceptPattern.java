package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.ExceptPattern;
import org.iso_relax.miaou.ss.IPatternChoice;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyExceptPattern extends ExceptPattern {
  public Object clone() throws CloneNotSupportedException {
    MyExceptPattern copy = (MyExceptPattern)super.clone();
    IMyPatternChoice origPattern = (IMyPatternChoice)copy.getPattern();
    IPatternChoice copiedPattern = (IPatternChoice)origPattern.clone();
    copy.setPattern(copiedPattern);
    return copy;
  }

}