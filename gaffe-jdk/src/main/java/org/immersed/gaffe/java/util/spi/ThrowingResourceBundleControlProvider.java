package org.immersed.gaffe.java.util.spi;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.spi.ResourceBundleControlProvider;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingResourceBundleControlProvider<X extends Throwable> extends ResourceBundleControlProvider {
  @Override
  @SneakyThrows
  default java.util.ResourceBundle.Control getControl(java.lang.String a) {
    return tryGetControl(a);
  }

  java.util.ResourceBundle.Control tryGetControl(java.lang.String a) throws X;
}
