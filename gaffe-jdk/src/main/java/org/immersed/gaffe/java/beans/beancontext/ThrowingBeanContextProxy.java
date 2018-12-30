package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextProxy;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBeanContextProxy<X extends Throwable> extends BeanContextProxy {
  @Override
  @SneakyThrows
  default java.beans.beancontext.BeanContextChild getBeanContextProxy() {
    return tryGetBeanContextProxy();
  }

  java.beans.beancontext.BeanContextChild tryGetBeanContextProxy() throws X;
}
