package org.iso_relax.miaou.myBta;

import org.iso_relax.miaou.abstractBta.*;
import org.iso_relax.miaou.houseKeeping.SymbolTables;
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


public class MyNonExistentAttributeTransition extends AbstractNonExistentAttributeTransition {
  /**
   * Print a compact textual representation.
   * @param writer
   */
  public void compactPrint(PrintWriter writer) {
    writer.print("nonExisAtt right:");
    writer.print(getRight());
    writer.print(" target:");
    writer.print(getTarget());
    writer.print(" nc:");
    writer.print(getNameClass());
    if (getExceptNameClass() != SymbolTables.NON_EXISTENT_INDEX) {
      writer.print(" - (");
      writer.print(getExceptNameClass());
      writer.print(")");
    }
    writer.println();
  }

  public void binPrint(DataOutputStream dos) throws IOException {
    dos.writeByte(BinaryPrinter.NON_EXISTENT_ATTRIBUTE_TRANSITION);
    dos.writeShort(getRight());
    dos.writeShort(getTarget());
    dos.writeShort(getNameClass());
    dos.writeShort(getExceptNameClass());
  }

  public void setSecondTarget(int parm1) { }
  public int getFirstSource() {
    return 0;
  }
  public void setLeft(int parm1) { }
  public void setFirstTarget(int parm1) { }
  public void setSecondSource(int parm1) { }
  public int getSource() {
    return 0;
  }
  public int maxState() {
    return TransitionUtility.singleInstance().maxState(this);
  }
  public void setState(int parm1) { }
  public void setFirstSource(int parm1) { }
  public int getLeft() {
    return 0;
  }
  public void setSource(int parm1) { }
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
}
