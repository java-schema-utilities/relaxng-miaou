package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import org.iso_relax.miaou.houseKeeping.BinaryPrinter;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */


public class MyElementTransition extends AbstractElementTransition {

  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("et left:");
    writer.print(getLeft());
    writer.print(" right:");
    writer.print(getRight());
    writer.print(" target:");
    writer.print(getTarget());
    writer.print(" nc:");
    writer.print(getNameClass());
    writer.println();
  }

  public void binPrint(DataOutputStream dos) throws IOException {
    dos.writeByte(BinaryPrinter.ELEMENT_TRANSITION);
    dos.writeShort(getLeft());
    dos.writeShort(getRight());
    dos.writeShort(getTarget());
    dos.writeShort(getNameClass());
  }

  public int getSecondTarget() {
    return 0;
  }
  public int getSecondSource() {
    return 0;
  }
  public int getFirstSource() {
    return 0;
  }
  public int getFirstTarget() {
    return 0;
  }
  public void incrementBy(int delta) {
    TransitionUtility.singleInstance().incrementBy(this, delta);
  }
  public void setSource(int parm1) {  }
  public void setSecondSource(int parm1) {  }
  public void setFirstSource(int parm1) {  }
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
  public void setSecondTarget(int parm1) {  }
  public void setFirstTarget(int parm1) {  }
  public void setState(int parm1) {  }
}
