package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.AttributeView;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingAttributeView<X extends Throwable> extends AttributeView {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  java.lang.String tryName() throws X;
}
