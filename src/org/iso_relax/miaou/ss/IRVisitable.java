package org.iso_relax.miaou.ss;

import java.util.*;
import org.w3c.dom.*;

/**
 * IRVisitable
 *
 * @since   Apr. 30, 2000
 * @version Oct.  3, 2001
 * @author  ASAMI, Tomoharu (asami@zeomtech.com)
 */
public interface IRVisitable {
    boolean enter(IRVisitor visitor);
    void leave(IRVisitor visitor);
}
