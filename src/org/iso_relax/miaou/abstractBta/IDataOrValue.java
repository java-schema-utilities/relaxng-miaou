package org.iso_relax.miaou.abstractBta;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public interface IDataOrValue {
  public void compactPrint(PrintWriter writer);
  public void binPrint(DataOutputStream dos) throws IOException;
}