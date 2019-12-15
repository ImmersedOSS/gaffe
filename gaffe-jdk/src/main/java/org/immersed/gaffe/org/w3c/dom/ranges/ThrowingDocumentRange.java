package org.immersed.gaffe.org.w3c.dom.ranges;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.ranges.DocumentRange;

/**
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>Document Object Model (DOM) Level 2 Traversal and Range Specification</a>.
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDocumentRange<X extends Throwable> extends DocumentRange {
  @Override
  @SneakyThrows
  default org.w3c.dom.ranges.Range createRange() {
    return tryCreateRange();
  }

  /**
   * This interface can be obtained from the object implementing the
   * <code>Document</code> interface using binding-specific casting
   * methods.
   * @return The initial state of the Range returned from this method is
   * such that both of its boundary-points are positioned at the
   * beginning of the corresponding Document, before any content. The
   * Range returned can only be used to select content associated with
   * this Document, or with DocumentFragments and Attrs for which this
   * Document is the <code>ownerDocument</code>.
   *
   * @throws X any exception that may be thrown.
   */
  org.w3c.dom.ranges.Range tryCreateRange() throws X;
}
