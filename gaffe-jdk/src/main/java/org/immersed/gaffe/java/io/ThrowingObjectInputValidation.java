package org.immersed.gaffe.java.io;

import java.io.ObjectInputValidation;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Callback interface to allow validation of objects within a graph.
 * Allows an object to be called when a complete graph of objects has
 * been deserialized.
 *
 * @author  unascribed
 * @see     ObjectInputStream
 * @see     ObjectInputStream#registerValidation(java.io.ObjectInputValidation, int)
 * @since   JDK1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingObjectInputValidation<X extends Throwable> extends ObjectInputValidation {
  @Override
  @SneakyThrows
  default void validateObject() {
    tryValidateObject();
  }

  /**
   * Validates the object.
   *
   * @exception InvalidObjectException If the object cannot validate itself.
   *
   * @throws X any exception that may be thrown.
   */
  void tryValidateObject() throws X;
}
