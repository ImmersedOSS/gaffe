package org.immersed.gaffe.java.lang.reflect;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.lang.reflect.InvocationHandler;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingInvocationHandler<X extends Throwable> extends InvocationHandler {
  @Override
  @SneakyThrows
  default java.lang.Object invoke(java.lang.Object a, java.lang.reflect.Method b,
      java.lang.Object[] c) {
    return tryInvoke(a,b,c);
  }

  java.lang.Object tryInvoke(java.lang.Object a, java.lang.reflect.Method b, java.lang.Object[] c)
      throws X;
}
