package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.RVisitorBase;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class ElementVisitor extends RVisitorBase {

  private AttributeNormalizer attributeNormalizer;

  public ElementVisitor(AttributeNormalizer attributeNormalizer) {
    this.attributeNormalizer = attributeNormalizer;
  }

  public void leave(org.iso_relax.miaou.ss.DefineElement defineElement) {
    attributeNormalizer.introduceNonExistentAttributeForDefineElement(defineElement);
  }
}