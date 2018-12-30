package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.CookiePolicy;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCookiePolicy<X extends Throwable> extends CookiePolicy {
  @Override
  @SneakyThrows
  default boolean shouldAccept(java.net.URI a, java.net.HttpCookie b) {
    return tryShouldAccept(a,b);
  }

  boolean tryShouldAccept(java.net.URI a, java.net.HttpCookie b) throws X;
}
