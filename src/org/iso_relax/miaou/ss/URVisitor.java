package org.iso_relax.miaou.ss;

import java.util.*;
import org.w3c.dom.*;

/**
 * URVisitor
 *
 * @since   Apr. 30, 2000
 * @version Oct.  3, 2001
 * @author  ASAMI, Tomoharu (asami@zeomtech.com)
 */
public final class URVisitor {
    public static void traverse(IRNode node, IRVisitor visitor) {
	traverseDepth(node, visitor);
    }

    public static void traverseDepth(IRNode node, IRVisitor visitor) {
	IRVisitable visitable = (IRVisitable)node;
	if (visitable.enter(visitor)) {
	    traverseDepthChildren(node, visitor);
	    visitable.leave(visitor);
	}
    }

    public static void traverseDepthChildren(
	IRNode node,
	IRVisitor visitor
    ) {
	IRNode[] children = node.getRNodes();
	for (int i = 0;i < children.length;i++) {
	    traverseDepth(children[i], visitor);
	}
    }

    public static void traverseBreadth(IRNode node, IRVisitor visitor) {
	IRVisitable visitable = (IRVisitable)node;
	if (visitable.enter(visitor)) {
	    traverseBreadthChildren(node, visitor);
	}
	visitable.leave(visitor);
    }

    public static void traverseBreadthChildren(
	IRNode node,
	IRVisitor visitor
    ) {
	IRNode[] children = node.getRNodes();
	boolean[] enterResult = new boolean[children.length];
	for (int i = 0;i < children.length;i++) {
	    IRVisitable visitable = (IRVisitable)children[i];
	    enterResult[i] = visitable.enter(visitor);
	    visitable.leave(visitor);
	}
	for (int i = 0;i < children.length;i++) {
	    IRNode child = children[i];
	    if (enterResult[i]) {
		traverseBreadthChildren(child, visitor);
	    }
	}
    }
}
