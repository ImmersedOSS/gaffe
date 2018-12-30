package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.FileStoreAttributeView;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFileStoreAttributeView<X extends Throwable> extends FileStoreAttributeView {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  java.lang.String tryName() throws X;
}
