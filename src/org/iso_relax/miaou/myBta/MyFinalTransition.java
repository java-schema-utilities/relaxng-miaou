package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import org.iso_relax.miaou.houseKeeping.BinaryPrinter;
import java.util.ArrayList;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyFinalTransition extends AbstractFinalTransition {
  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("fs ");
    writer.println(getState());
  }

  public void binPrint(DataOutputStream dos) throws IOException {
    dos.writeByte(BinaryPrinter.FINAL_STATE);
    dos.writeShort(getState());
  }

  public void setSecondTarget(int parm1) { }
  public int getFirstSource() {
    return 0;
  }
  public void setLeft(int parm1) { }
  public int getTarget() {
    return 0;
  }
  public void setFirstTarget(int parm1) { }
  public void setSecondSource(int parm1) { }
  public void setTarget(int parm1) { }
  public int getSource() {
    return 0;
  }
  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }
  public void setFirstSource(int parm1) { }
  public void setSource(int parm1) { }
  public int getLeft() {
    return 0;
  }
  public int getRight() {
    return 0;
  }
  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }

  public int getSecondTarget() {
    return 0;
  }
  public void setRight(int parm1) { }
  public int getFirstTarget() {
    return 0;
  }
  public ArrayList expand(int dummyState, int[] actualStates) {
    return TransitionUtility.singleInstance().expand(this, dummyState, actualStates);
  }
  public int getSecondSource() {
    return 0;
  }
}
