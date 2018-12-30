package org.immersed.gaffe.javafx.fxml;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.fxml.Initializable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingInitializable<X extends Throwable> extends Initializable {
  @Override
  @SneakyThrows
  default void initialize(java.net.URL a, java.util.ResourceBundle b) {
    tryInitialize(a,b);
  }

  void tryInitialize(java.net.URL a, java.util.ResourceBundle b) throws X;
}
