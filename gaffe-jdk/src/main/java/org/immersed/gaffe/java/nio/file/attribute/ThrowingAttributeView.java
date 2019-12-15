package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.AttributeView;
import lombok.SneakyThrows;

/**
 * An object that provides a read-only or updatable <em>view</em> of non-opaque
 * values associated with an object in a filesystem. This interface is extended
 * or implemented by specific attribute views that define the attributes
 * supported by the view. A specific attribute view will typically define
 * type-safe methods to read or update the attributes that it supports.
 *
 * @since 1.7
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAttributeView<X extends Throwable> extends AttributeView {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  /**
   * Returns the name of the attribute view.
   *
   * @return the name of the attribute view
   *
   * @throws X any exception that may be thrown.
   */
  java.lang.String tryName() throws X;
}
