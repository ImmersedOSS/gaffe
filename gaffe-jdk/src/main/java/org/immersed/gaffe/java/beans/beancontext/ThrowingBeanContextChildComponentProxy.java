package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextChildComponentProxy;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBeanContextChildComponentProxy<X extends Throwable> extends BeanContextChildComponentProxy {
  @Override
  @SneakyThrows
  default java.awt.Component getComponent() {
    return tryGetComponent();
  }

  java.awt.Component tryGetComponent() throws X;
}
