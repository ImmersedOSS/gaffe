package org.immersed.gaffe.javafx.scene.media;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.scene.media.AudioSpectrumListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingAudioSpectrumListener<X extends Throwable> extends AudioSpectrumListener {
  @Override
  @SneakyThrows
  default void spectrumDataUpdate(double a, double b, float[] c, float[] d) {
    trySpectrumDataUpdate(a,b,c,d);
  }

  void trySpectrumDataUpdate(double a, double b, float[] c, float[] d) throws X;
}
