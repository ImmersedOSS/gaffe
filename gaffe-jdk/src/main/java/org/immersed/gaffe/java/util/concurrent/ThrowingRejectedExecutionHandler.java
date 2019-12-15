package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.RejectedExecutionHandler;
import lombok.SneakyThrows;

/**
 * A handler for tasks that cannot be executed by a {@link ThreadPoolExecutor}.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingRejectedExecutionHandler<X extends Throwable> extends RejectedExecutionHandler {
  @Override
  @SneakyThrows
  default void rejectedExecution(java.lang.Runnable r,
      java.util.concurrent.ThreadPoolExecutor executor) {
    tryRejectedExecution(r,executor);
  }

  /**
   * Method that may be invoked by a {@link ThreadPoolExecutor} when
   * {@link ThreadPoolExecutor#execute execute} cannot accept a
   * task.  This may occur when no more threads or queue slots are
   * available because their bounds would be exceeded, or upon
   * shutdown of the Executor.
   *
   * <p>In the absence of other alternatives, the method may throw
   * an unchecked {@link RejectedExecutionException}, which will be
   * propagated to the caller of {@code execute}.
   *
   * @param r the runnable task requested to be executed
   * @param executor the executor attempting to execute this task
   * @throws RejectedExecutionException if there is no remedy
   *
   * @throws X any exception that may be thrown.
   */
  void tryRejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor)
      throws X;
}
