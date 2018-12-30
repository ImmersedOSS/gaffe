package org.immersed.gaffe.java.awt.print;

import java.awt.print.Printable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPrintable<X extends Throwable> extends Printable {
  @Override
  @SneakyThrows
  default int print(java.awt.Graphics a, java.awt.print.PageFormat b, int c) {
    return tryPrint(a,b,c);
  }

  int tryPrint(java.awt.Graphics a, java.awt.print.PageFormat b, int c) throws X;
}
