package org.immersed.gaffe.org.omg.IOP;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.IOP.CodecFactoryOperations;

@FunctionalInterface
public interface ThrowingCodecFactoryOperations<X extends Throwable> extends CodecFactoryOperations {
  @Override
  @SneakyThrows
  default org.omg.IOP.Codec create_codec(org.omg.IOP.Encoding a) {
    return tryCreate_codec(a);
  }

  org.omg.IOP.Codec tryCreate_codec(org.omg.IOP.Encoding a) throws X;
}
