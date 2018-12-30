package org.immersed.gaffe.org.w3c.dom;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.UserDataHandler;

@FunctionalInterface
public interface ThrowingUserDataHandler<X extends Throwable> extends UserDataHandler {
  @Override
  @SneakyThrows
  default void handle(short a, java.lang.String b, java.lang.Object c, org.w3c.dom.Node d,
      org.w3c.dom.Node e) {
    tryHandle(a,b,c,d,e);
  }

  void tryHandle(short a, java.lang.String b, java.lang.Object c, org.w3c.dom.Node d,
      org.w3c.dom.Node e) throws X;
}
