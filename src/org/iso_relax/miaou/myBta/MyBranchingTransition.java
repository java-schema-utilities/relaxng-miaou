package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyBranchingTransition extends AbstractBranchingTransition {
  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("bt ");
    writer.print(getSource());
    writer.print(" ");
    writer.print(getFirstTarget());
    writer.print(" ");
    writer.println(getSecondTarget());
  }

  public void binPrint(DataOutputStream dos) throws IOException {
    //not yet
  }

  public int getSecondSource() {
    return 0;
  }
  public int getFirstSource() {
    return 0;
  }
  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }
  public void setSecondSource(int parm1) { }
  public void setFirstSource(int parm1) { }
  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }
  public int getState() {
    return 0;
  }
  public int getTarget() {
    return 0;
  }
  public int getRight() {
    return 0;
  }
  public void setRight(int parm1) { }
  public ArrayList expand(int dummyState, int[] actualStates) {
    return TransitionUtility.singleInstance().expand(this, dummyState, actualStates);
  }
  public void setTarget(int parm1) { }
  public void setLeft(int parm1) { }
  public int getLeft() {
    return 0;
  }
  public void setState(int parm1) { }
}
