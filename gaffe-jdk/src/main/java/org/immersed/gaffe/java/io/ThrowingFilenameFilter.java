package org.immersed.gaffe.java.io;

import java.io.FilenameFilter;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Instances of classes that implement this interface are used to
 * filter filenames. These instances are used to filter directory
 * listings in the <code>list</code> method of class
 * <code>File</code>, and by the Abstract Window Toolkit's file
 * dialog component.
 *
 * @author  Arthur van Hoff
 * @author  Jonathan Payne
 * @see     java.awt.FileDialog#setFilenameFilter(java.io.FilenameFilter)
 * @see     java.io.File
 * @see     java.io.File#list(java.io.FilenameFilter)
 * @since   JDK1.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFilenameFilter<X extends Throwable> extends FilenameFilter {
  @Override
  @SneakyThrows
  default boolean accept(java.io.File dir, java.lang.String name) {
    return tryAccept(dir,name);
  }

  /**
   * Tests if a specified file should be included in a file list.
   *
   * @param   dir    the directory in which the file was found.
   * @param   name   the name of the file.
   * @return  <code>true</code> if and only if the name should be
   * included in the file list; <code>false</code> otherwise.
   *
   * @throws X any exception that may be thrown.
   */
  boolean tryAccept(java.io.File dir, java.lang.String name) throws X;
}
