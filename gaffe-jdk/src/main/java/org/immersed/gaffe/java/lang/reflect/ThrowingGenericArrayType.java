package org.immersed.gaffe.java.lang.reflect;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.lang.reflect.GenericArrayType;
import lombok.SneakyThrows;

/**
 * {@code GenericArrayType} represents an array type whose component
 * type is either a parameterized type or a type variable.
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingGenericArrayType<X extends Throwable> extends GenericArrayType {
  @Override
  @SneakyThrows
  default java.lang.reflect.Type getGenericComponentType() {
    return tryGetGenericComponentType();
  }

  /**
   * Returns a {@code Type} object representing the component type
   * of this array. This method creates the component type of the
   * array.  See the declaration of {@link
   * java.lang.reflect.ParameterizedType ParameterizedType} for the
   * semantics of the creation process for parameterized types and
   * see {@link java.lang.reflect.TypeVariable TypeVariable} for the
   * creation process for type variables.
   *
   * @return  a {@code Type} object representing the component type
   * of this array
   * @throws TypeNotPresentException if the underlying array type's
   * component type refers to a non-existent type declaration
   * @throws MalformedParameterizedTypeException if  the
   * underlying array type's component type refers to a
   * parameterized type that cannot be instantiated for any reason
   *
   * @throws X any exception that may be thrown.
   */
  java.lang.reflect.Type tryGetGenericComponentType() throws X;
}
