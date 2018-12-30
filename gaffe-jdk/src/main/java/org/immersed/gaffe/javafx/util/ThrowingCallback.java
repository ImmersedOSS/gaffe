package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.Callback;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCallback<P, R, X extends Throwable> extends Callback<P, R> {
  @Override
  @SneakyThrows
  default R call(P a) {
    return tryCall(a);
  }

  R tryCall(P a) throws X;
}
