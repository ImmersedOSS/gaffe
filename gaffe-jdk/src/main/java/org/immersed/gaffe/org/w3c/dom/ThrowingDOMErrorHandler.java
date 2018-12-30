package org.immersed.gaffe.org.w3c.dom;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.DOMErrorHandler;

@FunctionalInterface
public interface ThrowingDOMErrorHandler<X extends Throwable> extends DOMErrorHandler {
  @Override
  @SneakyThrows
  default boolean handleError(org.w3c.dom.DOMError a) {
    return tryHandleError(a);
  }

  boolean tryHandleError(org.w3c.dom.DOMError a) throws X;
}
