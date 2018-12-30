package org.immersed.gaffe.java.lang.reflect;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.lang.reflect.GenericArrayType;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingGenericArrayType<X extends Throwable> extends GenericArrayType {
  @Override
  @SneakyThrows
  default java.lang.reflect.Type getGenericComponentType() {
    return tryGetGenericComponentType();
  }

  java.lang.reflect.Type tryGetGenericComponentType() throws X;
}
