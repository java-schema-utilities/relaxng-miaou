package org.iso_relax.miaou.myBta;

import java.util.ArrayList;
import java.io.PrintWriter;
import org.iso_relax.miaou.abstractBta.AbstractAtomicTransition;
import org.iso_relax.miaou.abstractBta.IDataOrValue;
import org.iso_relax.miaou.bta.Value;
import org.iso_relax.miaou.bta.Data;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyAtomicTransition extends AbstractAtomicTransition
  implements java.lang.Cloneable {

  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("a ");
    writer.print(getRight());
    writer.print(" ");
    writer.print(getTarget());
    writer.print(" ");
    ((IDataOrValue)getContent()).compactPrint(writer);
    writer.println();
  }

  public int getSecondTarget() {
    return 0;
  }

  public int getSecondSource() {
    return 0;
  }

  public void setSecondTarget(int parm1) { }

  public int getFirstSource() {
    return 0;
  }

  public void setLeft(int parm1) { }

  public int getFirstTarget() {
    return 0;
  }

  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }

  public void setSecondSource(int parm1) { }

  public void setSource(int parm1) { }

  public void setFirstSource(int parm1) { }

  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }

  public int getState() {
    return 0;
  }

  public int getSource() {
    return 0;
  }

  public ArrayList expand(int dummyState, int[] actualStates) {
    return TransitionUtility.singleInstance().expand(this, dummyState, actualStates);
  }

  public void setFirstTarget(int parm1) { }

  public int getLeft() {
    return 0;
  }

  public void setState(int parm1) { }

}
