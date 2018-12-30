package org.immersed.gaffe.java.awt;

import java.awt.PrintGraphics;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPrintGraphics<X extends Throwable> extends PrintGraphics {
  @Override
  @SneakyThrows
  default java.awt.PrintJob getPrintJob() {
    return tryGetPrintJob();
  }

  java.awt.PrintJob tryGetPrintJob() throws X;
}
