package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextContainerProxy;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBeanContextContainerProxy<X extends Throwable> extends BeanContextContainerProxy {
  @Override
  @SneakyThrows
  default java.awt.Container getContainer() {
    return tryGetContainer();
  }

  java.awt.Container tryGetContainer() throws X;
}
