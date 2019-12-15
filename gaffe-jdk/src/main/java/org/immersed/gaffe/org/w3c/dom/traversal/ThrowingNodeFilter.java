package org.immersed.gaffe.org.w3c.dom.traversal;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.traversal.NodeFilter;

/**
 * Filters are objects that know how to "filter out" nodes. If a
 * <code>NodeIterator</code> or <code>TreeWalker</code> is given a
 * <code>NodeFilter</code>, it applies the filter before it returns the next
 * node. If the filter says to accept the node, the traversal logic returns
 * it; otherwise, traversal looks for the next node and pretends that the
 * node that was rejected was not there.
 * <p>The DOM does not provide any filters. <code>NodeFilter</code> is just an
 * interface that users can implement to provide their own filters.
 * <p><code>NodeFilters</code> do not need to know how to traverse from node
 * to node, nor do they need to know anything about the data structure that
 * is being traversed. This makes it very easy to write filters, since the
 * only thing they have to know how to do is evaluate a single node. One
 * filter may be used with a number of different kinds of traversals,
 * encouraging code reuse.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>Document Object Model (DOM) Level 2 Traversal and Range Specification</a>.
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingNodeFilter<X extends Throwable> extends NodeFilter {
  @Override
  @SneakyThrows
  default short acceptNode(org.w3c.dom.Node n) {
    return tryAcceptNode(n);
  }

  /**
   * Test whether a specified node is visible in the logical view of a
   * <code>TreeWalker</code> or <code>NodeIterator</code>. This function
   * will be called by the implementation of <code>TreeWalker</code> and
   * <code>NodeIterator</code>; it is not normally called directly from
   * user code. (Though you could do so if you wanted to use the same
   * filter to guide your own application logic.)
   * @param n The node to check to see if it passes the filter or not.
   * @return A constant to determine whether the node is accepted,
   * rejected, or skipped, as defined above.
   *
   * @throws X any exception that may be thrown.
   */
  short tryAcceptNode(org.w3c.dom.Node n) throws X;
}
