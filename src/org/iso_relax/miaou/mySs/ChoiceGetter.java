package org.iso_relax.miaou.mySs;


import org.iso_relax.miaou.ss.PatternChoice;
import org.iso_relax.miaou.ss.INameClassChoice;
import org.iso_relax.miaou.ss.IPatternChoice;
import org.iso_relax.miaou.ss.PatternNonExistentAttribute;
import org.iso_relax.miaou.ss.ISimpleSyntaxFactory;
import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class ChoiceGetter extends RVisitorBase {

  private AttributeNormalizer attributeNormalizer;

  public ChoiceGetter(AttributeNormalizer attributeNormalizer) {
    this.attributeNormalizer = attributeNormalizer;
  }


  public void leave(org.iso_relax.miaou.ss.PatternChoice choice) {
    attributeNormalizer.introduceNonExistentAttributeForChoice(choice);
  }

}