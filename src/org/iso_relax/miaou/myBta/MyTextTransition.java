package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyTextTransition
  extends AbstractTextTransition
  implements java.lang.Cloneable{

  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("tt ");
    writer.print(getRight());
    writer.print(" ");
    writer.println(getTarget());
  }

  public void setSecondTarget(int parm1) {
     }
  public int getFirstSource() {
    return 0;
  }
  public void setLeft(int parm1) {
     }
  public void setFirstTarget(int parm1) {
     }
  public void setSecondSource(int parm1) {
     }
  public int getSource() {
    return 0;
  }
  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }
  public void setState(int parm1) {
     }
  public void setFirstSource(int parm1) {
     }
  public int getLeft() {
    return 0;
  }
  public void setSource(int parm1) {
     }
  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }
  public int getState() {
    return 0;
  }
  public int getSecondTarget() {
    return 0;
  }
  public int getFirstTarget() {
    return 0;
  }
  public ArrayList expand(int dummyState, int[] actualStates) {
    return TransitionUtility.singleInstance().expand(this, dummyState, actualStates);
  }
  public int getSecondSource() {
    return 0;
  }
    /*
  public Object clone() {
    try {
      return super.clone();
    } catch (Exception e) {
      throw new java.lang.InternalError();
    }
  }
    */
}
