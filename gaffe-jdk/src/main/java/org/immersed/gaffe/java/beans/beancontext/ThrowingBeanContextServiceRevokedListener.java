package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBeanContextServiceRevokedListener<X extends Throwable> extends BeanContextServiceRevokedListener {
  @Override
  @SneakyThrows
  default void serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent a) {
    tryServiceRevoked(a);
  }

  void tryServiceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent a) throws X;
}
