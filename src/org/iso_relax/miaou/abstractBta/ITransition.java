package org.iso_relax.miaou.abstractBta;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface ITransition {
  public Object clone() throws CloneNotSupportedException;
  public void compactPrint(PrintWriter writer);
  public void binPrint(DataOutputStream dos) throws IOException;
  public int maxState();
  public void incrementBy (int delta);
  public ArrayList expand(int dummyState, int[] actualStates);
  public int getState();
  public int getLeft();
  public int getRight();
  public int getSource();
  public int getTarget();
  public int getFirstSource();
  public int getSecondSource();
  public int getFirstTarget();
  public int getSecondTarget();
  public void setState(int state);
  public void setLeft(int state);
  public void setRight(int state);
  public void setSource(int state);
  public void setTarget(int state);
  public void setFirstSource(int state);
  public void setSecondSource(int state);
  public void setFirstTarget(int state);
  public void setSecondTarget(int state);
}