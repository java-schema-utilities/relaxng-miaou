package org.iso_relax.miaou.mySs;
import org.iso_relax.miaou.ss.RootGrammar;
import org.iso_relax.miaou.ss.PatternInterleave;
import org.iso_relax.miaou.ss.PatternGroup;
import org.iso_relax.miaou.ss.URVisitor;

/**
 * This class converts interleave to group when possible.
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class InterleaveNormalizer {

  private org.iso_relax.miaou.ss.ISimpleSyntaxFactory factory;

  public InterleaveNormalizer() {
    factory = org.iso_relax.miaou.ss.SimpleSyntaxFactory.getFactory();
  }

  /**
   * Interleave normalization for an entire grammar.
   */

  public void simplify(RootGrammar grammar) {

    org.iso_relax.miaou.ss.URVisitor.traverse(grammar, new InterleaveGetter(this));

  }

  /**
   * Interleave normalization for an intetleave.
   * This function is invoked by InterleaveGetter.
   * @param interleave
   */
  public void simplify(PatternInterleave interleave) {
    IMyPatternChoice patternOne = (IMyPatternChoice)interleave.getPattern1();
    IMyPatternChoice patternTwo = (IMyPatternChoice)interleave.getPattern2();

    AtomOccurrenceChecker checkerOne = new AtomOccurrenceChecker();
    AtomOccurrenceChecker checkerTwo = new AtomOccurrenceChecker();

    URVisitor.traverse(patternOne, checkerOne);
    URVisitor.traverse(patternTwo, checkerOne);

    if (checkerOne.nonAttributeless() ||
        checkerTwo.nonAttributeless()) {

      PatternGroup  group   = factory.createPatternGroup();
      group.setPattern1(patternOne.deepCopy());
      group.setPattern2(patternTwo.deepCopy());

      Object parent = interleave.getParentRNode();

      PatternRewriter.singleInstance().replace(parent, interleave, group );

    }
  }

}