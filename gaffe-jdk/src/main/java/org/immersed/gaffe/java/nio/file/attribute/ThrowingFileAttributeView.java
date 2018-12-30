package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.FileAttributeView;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFileAttributeView<X extends Throwable> extends FileAttributeView {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  java.lang.String tryName() throws X;
}
