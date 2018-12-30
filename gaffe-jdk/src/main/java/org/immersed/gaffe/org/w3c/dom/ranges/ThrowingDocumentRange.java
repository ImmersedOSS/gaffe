package org.immersed.gaffe.org.w3c.dom.ranges;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.ranges.DocumentRange;

@FunctionalInterface
public interface ThrowingDocumentRange<X extends Throwable> extends DocumentRange {
  @Override
  @SneakyThrows
  default org.w3c.dom.ranges.Range createRange() {
    return tryCreateRange();
  }

  org.w3c.dom.ranges.Range tryCreateRange() throws X;
}
