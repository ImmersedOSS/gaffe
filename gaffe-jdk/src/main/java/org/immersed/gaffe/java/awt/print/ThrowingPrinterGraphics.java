package org.immersed.gaffe.java.awt.print;

import java.awt.print.PrinterGraphics;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPrinterGraphics<X extends Throwable> extends PrinterGraphics {
  @Override
  @SneakyThrows
  default java.awt.print.PrinterJob getPrinterJob() {
    return tryGetPrinterJob();
  }

  java.awt.print.PrinterJob tryGetPrinterJob() throws X;
}
