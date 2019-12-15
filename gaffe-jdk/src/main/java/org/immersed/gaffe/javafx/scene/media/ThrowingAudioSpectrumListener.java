package org.immersed.gaffe.javafx.scene.media;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.scene.media.AudioSpectrumListener;
import lombok.SneakyThrows;

/**
 * Audio spectrum callback interface. The observer receives periodic updates of
 * the audio spectrum. A single observer may be attached to a given {@link MediaPlayer}
 * using {@link MediaPlayer#setAudioSpectrumListener}.
 *
 * @see MediaPlayer
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAudioSpectrumListener<X extends Throwable> extends AudioSpectrumListener {
  @Override
  @SneakyThrows
  default void spectrumDataUpdate(double timestamp, double duration, float[] magnitudes,
      float[] phases) {
    trySpectrumDataUpdate(timestamp,duration,magnitudes,phases);
  }

  /**
   * Notifies the observer about new data available for the audio spectrum.
   *
   * <p>The notification period for updates may be set using
   * {@link MediaPlayer#setAudioSpectrumInterval}, and the number of bands and
   * sensitivity threshold via {@link MediaPlayer#setAudioSpectrumNumBands} and
   * {@link MediaPlayer#setAudioSpectrumThreshold}, respectively. The default
   * values of the settings are an interval of <code>0.1</code> seconds,
   * <code>128</code> bands, and sensitivity threshold <code>-60.0</code> dB.
   *
   * <p>The arrays
   * passed to the listener should be considered to be read-only as the
   * underlying implementation may re-use them.</p>
   *
   * @param timestamp timestamp of the event in seconds.
   * @param duration duration for which the spectrum was computed in seconds.
   * @param magnitudes array containing the non-positive spectrum magnitude in decibels
   * (dB) for each band.
   * The size of the array equals the number of bands and should be considered
   * to be read-only.
   * @param phases array containing the phase in the range
   * [<code>Math.PI</code>,&nbsp;<code>Math.PI</code>] for each band.
   * The size of the array equals the number of bands and should be considered
   * to be read-only.
   *
   * @throws X any exception that may be thrown.
   */
  void trySpectrumDataUpdate(double timestamp, double duration, float[] magnitudes, float[] phases)
      throws X;
}
