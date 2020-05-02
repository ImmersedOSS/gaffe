package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.ForkJoinPool;
import lombok.SneakyThrows;

/**
 * Factory for creating new {@link ForkJoinWorkerThread}s. A
 * {@code ForkJoinWorkerThreadFactory} must be defined and used for
 * {@code ForkJoinWorkerThread} subclasses that extend base functionality or
 * initialize threads with different contexts.
 * 
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingForkJoinWorkerThreadFactory<X extends Throwable>
        extends ForkJoinPool.ForkJoinWorkerThreadFactory
{
    @Override
    @SneakyThrows
    default java.util.concurrent.ForkJoinWorkerThread newThread(java.util.concurrent.ForkJoinPool pool)
    {
        return tryNewThread(pool);
    }

    /**
     * Returns a new worker thread operating in the given pool.
     *
     * @param pool the pool this thread works in
     * @return the new worker thread
     * @throws NullPointerException if the pool is null
     *
     * @throws X                    any exception that may be thrown.
     */
    java.util.concurrent.ForkJoinWorkerThread tryNewThread(java.util.concurrent.ForkJoinPool pool) throws X;
}
