package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyMergingTransition extends AbstractMergingTransition {
  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("mt ");
    writer.print(getFirstSource());
    writer.print(" ");
    writer.print(getSecondSource());
    writer.print(" ");
    writer.println(getTarget());
  }

  public int getSecondTarget() {
    return 0;
  }
  public int getFirstTarget() {
    return 0;
  }
  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }
  public void setSource(int parm1) { }
  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }
  public int getState() {
    return 0;
  }
  public int getSource() {
    return 0;
  }
  public int getRight() {
    return 0;
  }
  public void setRight(int parm1) { }
  public ArrayList expand(int dummyState, int[] actualStates) {
    return TransitionUtility.singleInstance().expand(this, dummyState, actualStates);
  }
  public void setSecondTarget(int parm1) { }
  public void setFirstTarget(int parm1) { }
  public void setLeft(int parm1) { }
  public int getLeft() {
    return 0;
  }
  public void setState(int parm1) { }
}
