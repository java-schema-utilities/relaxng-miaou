package org.iso_relax.miaou.mySs;


import org.iso_relax.miaou.ss.PatternAttribute;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.PatternChoice;
import org.iso_relax.miaou.ss.PatternGroup;
import org.iso_relax.miaou.ss.PatternInterleave;
import org.iso_relax.miaou.ss.PatternOneOrMore;
import org.iso_relax.miaou.ss.PatternOneOrMoreAttribute;
import org.iso_relax.miaou.ss.PatternEmpty;
import org.iso_relax.miaou.ss.DefineElement;
import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.NameClassName;
import org.iso_relax.miaou.ss.ExceptNameClass;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class PatternRewriter {

  static private PatternRewriter patternRewriter;

  private PatternRewriter() {
  }

  static public PatternRewriter singleInstance() {
    if (patternRewriter == null)
      patternRewriter = new PatternRewriter();
    return patternRewriter;
  }



  /**
   * replaces an old pattern with a new pattern.
   */
  public void replace(Object parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

    if (parent instanceof PatternGroup)
       replace((PatternGroup)parent, oldPattern, newPattern);
    else if (parent instanceof PatternChoice)
       replace((PatternChoice)parent, oldPattern, newPattern);
    else if (parent instanceof PatternInterleave)
       replace((PatternInterleave)parent, oldPattern, newPattern);
    else if (parent instanceof DefineElement)
       replace((DefineElement)parent, oldPattern, newPattern);
    else
      System.out.println("strange parent");
  }

  private void replace(PatternGroup parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

    if (parent.getPattern1() == oldPattern)
      parent.setPattern1(newPattern);
    else if (parent.getPattern2() == oldPattern)
      parent.setPattern2(newPattern);
    else
      System.err.println("cannot be replaced");
  }

   private void replace(PatternChoice parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {

     if (parent.getPattern1() == oldPattern)
       parent.setPattern1(newPattern);
     else if (parent.getPattern2() == oldPattern)
       parent.setPattern2(newPattern);
     else
       System.err.println("cannot be replaced");
  }

   private void replace(PatternInterleave parent,
                        IPatternChoice oldPattern,
                        IPatternChoice newPattern) {
     if (parent.getPattern1() == oldPattern)
       parent.setPattern1(newPattern);
     else if (parent.getPattern2() == oldPattern)
       parent.setPattern2(newPattern);
     else
       System.err.println("cannot be replaced");
  }


  private void replace(DefineElement parent,
                  IPatternChoice oldPattern,
                  IPatternChoice newPattern) {
    if (parent.getPattern() == oldPattern)
      parent.setPattern(newPattern);
    else
      System.err.println("cannot be replaced");
  }
}