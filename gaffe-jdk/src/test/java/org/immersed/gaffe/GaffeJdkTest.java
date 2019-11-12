package org.immersed.gaffe;

import static org.immersed.gaffe.GaffeJdk.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public final class GaffeJdkTest {
  @Test
  public void testThrowingActiveEventCanThrowCheckedException() {
    java.awt.ActiveEvent iface = throwingActiveEvent(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCompositeCanThrowCheckedException() {
    java.awt.Composite iface = throwingComposite((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingKeyEventDispatcherCanThrowCheckedException() {
    java.awt.KeyEventDispatcher iface = throwingKeyEventDispatcher(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingKeyEventPostProcessorCanThrowCheckedException() {
    java.awt.KeyEventPostProcessor iface = throwingKeyEventPostProcessor(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPrintGraphicsCanThrowCheckedException() {
    java.awt.PrintGraphics iface = throwingPrintGraphics(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingStrokeCanThrowCheckedException() {
    java.awt.Stroke iface = throwingStroke(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingTransparencyCanThrowCheckedException() {
    java.awt.Transparency iface = throwingTransparency(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingClipboardOwnerCanThrowCheckedException() {
    java.awt.datatransfer.ClipboardOwner iface = throwingClipboardOwner((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFlavorListenerCanThrowCheckedException() {
    java.awt.datatransfer.FlavorListener iface = throwingFlavorListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDragGestureListenerCanThrowCheckedException() {
    java.awt.dnd.DragGestureListener iface = throwingDragGestureListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDragSourceMotionListenerCanThrowCheckedException() {
    java.awt.dnd.DragSourceMotionListener iface = throwingDragSourceMotionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAWTEventListenerCanThrowCheckedException() {
    java.awt.event.AWTEventListener iface = throwingAWTEventListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingActionListenerCanThrowCheckedException() {
    java.awt.event.ActionListener iface = throwingActionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAdjustmentListenerCanThrowCheckedException() {
    java.awt.event.AdjustmentListener iface = throwingAdjustmentListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingHierarchyListenerCanThrowCheckedException() {
    java.awt.event.HierarchyListener iface = throwingHierarchyListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingItemListenerCanThrowCheckedException() {
    java.awt.event.ItemListener iface = throwingItemListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingMouseWheelListenerCanThrowCheckedException() {
    java.awt.event.MouseWheelListener iface = throwingMouseWheelListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingTextListenerCanThrowCheckedException() {
    java.awt.event.TextListener iface = throwingTextListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingWindowStateListenerCanThrowCheckedException() {
    java.awt.event.WindowStateListener iface = throwingWindowStateListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingImageObserverCanThrowCheckedException() {
    java.awt.image.ImageObserver iface = throwingImageObserver((a,b,c,d,e,f) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingTileObserverCanThrowCheckedException() {
    java.awt.image.TileObserver iface = throwingTileObserver((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRenderedImageFactoryCanThrowCheckedException() {
    java.awt.image.renderable.RenderedImageFactory iface = throwingRenderedImageFactory((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingSystemTrayPeerCanThrowCheckedException() {
    java.awt.peer.SystemTrayPeer iface = throwingSystemTrayPeer(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPrintableCanThrowCheckedException() {
    java.awt.print.Printable iface = throwingPrintable((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPrinterGraphicsCanThrowCheckedException() {
    java.awt.print.PrinterGraphics iface = throwingPrinterGraphics(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingExceptionListenerCanThrowCheckedException() {
    java.beans.ExceptionListener iface = throwingExceptionListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPropertyChangeListenerCanThrowCheckedException() {
    java.beans.PropertyChangeListener iface = throwingPropertyChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingVetoableChangeListenerCanThrowCheckedException() {
    java.beans.VetoableChangeListener iface = throwingVetoableChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBeanContextChildComponentProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextChildComponentProxy iface = throwingBeanContextChildComponentProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBeanContextContainerProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextContainerProxy iface = throwingBeanContextContainerProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBeanContextProxyCanThrowCheckedException() {
    java.beans.beancontext.BeanContextProxy iface = throwingBeanContextProxy(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBeanContextServiceRevokedListenerCanThrowCheckedException() {
    java.beans.beancontext.BeanContextServiceRevokedListener iface = throwingBeanContextServiceRevokedListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCloseableCanThrowCheckedException() {
    java.io.Closeable iface = throwingCloseable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFileFilterCanThrowCheckedException() {
    java.io.FileFilter iface = throwingFileFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFilenameFilterCanThrowCheckedException() {
    java.io.FilenameFilter iface = throwingFilenameFilter((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFlushableCanThrowCheckedException() {
    java.io.Flushable iface = throwingFlushable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingObjectInputValidationCanThrowCheckedException() {
    java.io.ObjectInputValidation iface = throwingObjectInputValidation(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAutoCloseableCanThrowCheckedException() {
    java.lang.AutoCloseable iface = throwingAutoCloseable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingComparableCanThrowCheckedException() {
    java.lang.Comparable iface = throwingComparable(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIterableCanThrowCheckedException() {
    java.lang.Iterable iface = throwingIterable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingReadableCanThrowCheckedException() {
    java.lang.Readable iface = throwingReadable(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRunnableCanThrowCheckedException() {
    java.lang.Runnable iface = throwingRunnable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingThreadUncaughtExceptionHandlerCanThrowCheckedException() {
    java.lang.Thread.UncaughtExceptionHandler iface = throwingThreadUncaughtExceptionHandler((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingClassFileTransformerCanThrowCheckedException() {
    java.lang.instrument.ClassFileTransformer iface = throwingClassFileTransformer((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPlatformManagedObjectCanThrowCheckedException() {
    java.lang.management.PlatformManagedObject iface = throwingPlatformManagedObject(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingGenericArrayTypeCanThrowCheckedException() {
    java.lang.reflect.GenericArrayType iface = throwingGenericArrayType(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingInvocationHandlerCanThrowCheckedException() {
    java.lang.reflect.InvocationHandler iface = throwingInvocationHandler((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingContentHandlerFactoryCanThrowCheckedException() {
    java.net.ContentHandlerFactory iface = throwingContentHandlerFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCookiePolicyCanThrowCheckedException() {
    java.net.CookiePolicy iface = throwingCookiePolicy((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDatagramSocketImplFactoryCanThrowCheckedException() {
    java.net.DatagramSocketImplFactory iface = throwingDatagramSocketImplFactory(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFileNameMapCanThrowCheckedException() {
    java.net.FileNameMap iface = throwingFileNameMap(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingProtocolFamilyCanThrowCheckedException() {
    java.net.ProtocolFamily iface = throwingProtocolFamily(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingSocketImplFactoryCanThrowCheckedException() {
    java.net.SocketImplFactory iface = throwingSocketImplFactory(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingURLStreamHandlerFactoryCanThrowCheckedException() {
    java.net.URLStreamHandlerFactory iface = throwingURLStreamHandlerFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDirectoryStreamFilterCanThrowCheckedException() {
    java.nio.file.DirectoryStream.Filter iface = throwingDirectoryStreamFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPathMatcherCanThrowCheckedException() {
    java.nio.file.PathMatcher iface = throwingPathMatcher(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingWatchEventModifierCanThrowCheckedException() {
    java.nio.file.WatchEvent.Modifier iface = throwingWatchEventModifier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.AttributeView iface = throwingAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFileAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.FileAttributeView iface = throwingFileAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFileStoreAttributeViewCanThrowCheckedException() {
    java.nio.file.attribute.FileStoreAttributeView iface = throwingFileStoreAttributeView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingActivationInstantiatorCanThrowCheckedException() {
    java.rmi.activation.ActivationInstantiator iface = throwingActivationInstantiator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingActivatorCanThrowCheckedException() {
    java.rmi.activation.Activator iface = throwingActivator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRMIClientSocketFactoryCanThrowCheckedException() {
    java.rmi.server.RMIClientSocketFactory iface = throwingRMIClientSocketFactory((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRMIFailureHandlerCanThrowCheckedException() {
    java.rmi.server.RMIFailureHandler iface = throwingRMIFailureHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRMIServerSocketFactoryCanThrowCheckedException() {
    java.rmi.server.RMIServerSocketFactory iface = throwingRMIServerSocketFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingUnreferencedCanThrowCheckedException() {
    java.rmi.server.Unreferenced iface = throwingUnreferenced(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDomainCombinerCanThrowCheckedException() {
    java.security.DomainCombiner iface = throwingDomainCombiner((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingGuardCanThrowCheckedException() {
    java.security.Guard iface = throwingGuard(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingKeyStoreLoadStoreParameterCanThrowCheckedException() {
    java.security.KeyStore.LoadStoreParameter iface = throwingKeyStoreLoadStoreParameter(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPrivilegedActionCanThrowCheckedException() {
    java.security.PrivilegedAction iface = throwingPrivilegedAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPrivilegedExceptionActionCanThrowCheckedException() {
    java.security.PrivilegedExceptionAction iface = throwingPrivilegedExceptionAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCertPathParametersCanThrowCheckedException() {
    java.security.cert.CertPathParameters iface = throwingCertPathParameters(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCertPathValidatorResultCanThrowCheckedException() {
    java.security.cert.CertPathValidatorResult iface = throwingCertPathValidatorResult(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCertStoreParametersCanThrowCheckedException() {
    java.security.cert.CertStoreParameters iface = throwingCertStoreParameters(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDSAKeyCanThrowCheckedException() {
    java.security.interfaces.DSAKey iface = throwingDSAKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingECKeyCanThrowCheckedException() {
    java.security.interfaces.ECKey iface = throwingECKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRSAKeyCanThrowCheckedException() {
    java.security.interfaces.RSAKey iface = throwingRSAKey(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingECFieldCanThrowCheckedException() {
    java.security.spec.ECField iface = throwingECField(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDriverActionCanThrowCheckedException() {
    java.sql.DriverAction iface = throwingDriverAction(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEraCanThrowCheckedException() {
    java.time.chrono.Era iface = throwingEra(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingTemporalAdjusterCanThrowCheckedException() {
    java.time.temporal.TemporalAdjuster iface = throwingTemporalAdjuster(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingTemporalQueryCanThrowCheckedException() {
    java.time.temporal.TemporalQuery iface = throwingTemporalQuery(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFormattableCanThrowCheckedException() {
    java.util.Formattable iface = throwingFormattable((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingObserverCanThrowCheckedException() {
    java.util.Observer iface = throwingObserver((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCallableCanThrowCheckedException() {
    java.util.concurrent.Callable iface = throwingCallable(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingExecutorCanThrowCheckedException() {
    java.util.concurrent.Executor iface = throwingExecutor(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingForkJoinPoolForkJoinWorkerThreadFactoryCanThrowCheckedException() {
    java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory iface = throwingForkJoinPoolForkJoinWorkerThreadFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingRejectedExecutionHandlerCanThrowCheckedException() {
    java.util.concurrent.RejectedExecutionHandler iface = throwingRejectedExecutionHandler((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingThreadFactoryCanThrowCheckedException() {
    java.util.concurrent.ThreadFactory iface = throwingThreadFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBiConsumerCanThrowCheckedException() {
    java.util.function.BiConsumer iface = throwingBiConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBiFunctionCanThrowCheckedException() {
    java.util.function.BiFunction iface = throwingBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBiPredicateCanThrowCheckedException() {
    java.util.function.BiPredicate iface = throwingBiPredicate((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBinaryOperatorCanThrowCheckedException() {
    java.util.function.BinaryOperator iface = throwingBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBooleanSupplierCanThrowCheckedException() {
    java.util.function.BooleanSupplier iface = throwingBooleanSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingConsumerCanThrowCheckedException() {
    java.util.function.Consumer iface = throwingConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleBinaryOperatorCanThrowCheckedException() {
    java.util.function.DoubleBinaryOperator iface = throwingDoubleBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleConsumerCanThrowCheckedException() {
    java.util.function.DoubleConsumer iface = throwingDoubleConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleFunctionCanThrowCheckedException() {
    java.util.function.DoubleFunction iface = throwingDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoublePredicateCanThrowCheckedException() {
    java.util.function.DoublePredicate iface = throwingDoublePredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleSupplierCanThrowCheckedException() {
    java.util.function.DoubleSupplier iface = throwingDoubleSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleToIntFunctionCanThrowCheckedException() {
    java.util.function.DoubleToIntFunction iface = throwingDoubleToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleToLongFunctionCanThrowCheckedException() {
    java.util.function.DoubleToLongFunction iface = throwingDoubleToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDoubleUnaryOperatorCanThrowCheckedException() {
    java.util.function.DoubleUnaryOperator iface = throwingDoubleUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFunctionCanThrowCheckedException() {
    java.util.function.Function iface = throwingFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntBinaryOperatorCanThrowCheckedException() {
    java.util.function.IntBinaryOperator iface = throwingIntBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntConsumerCanThrowCheckedException() {
    java.util.function.IntConsumer iface = throwingIntConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntFunctionCanThrowCheckedException() {
    java.util.function.IntFunction iface = throwingIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntPredicateCanThrowCheckedException() {
    java.util.function.IntPredicate iface = throwingIntPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntSupplierCanThrowCheckedException() {
    java.util.function.IntSupplier iface = throwingIntSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntToDoubleFunctionCanThrowCheckedException() {
    java.util.function.IntToDoubleFunction iface = throwingIntToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntToLongFunctionCanThrowCheckedException() {
    java.util.function.IntToLongFunction iface = throwingIntToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingIntUnaryOperatorCanThrowCheckedException() {
    java.util.function.IntUnaryOperator iface = throwingIntUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongBinaryOperatorCanThrowCheckedException() {
    java.util.function.LongBinaryOperator iface = throwingLongBinaryOperator((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongConsumerCanThrowCheckedException() {
    java.util.function.LongConsumer iface = throwingLongConsumer(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongFunctionCanThrowCheckedException() {
    java.util.function.LongFunction iface = throwingLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongPredicateCanThrowCheckedException() {
    java.util.function.LongPredicate iface = throwingLongPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongSupplierCanThrowCheckedException() {
    java.util.function.LongSupplier iface = throwingLongSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongToDoubleFunctionCanThrowCheckedException() {
    java.util.function.LongToDoubleFunction iface = throwingLongToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongToIntFunctionCanThrowCheckedException() {
    java.util.function.LongToIntFunction iface = throwingLongToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLongUnaryOperatorCanThrowCheckedException() {
    java.util.function.LongUnaryOperator iface = throwingLongUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingObjDoubleConsumerCanThrowCheckedException() {
    java.util.function.ObjDoubleConsumer iface = throwingObjDoubleConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingObjIntConsumerCanThrowCheckedException() {
    java.util.function.ObjIntConsumer iface = throwingObjIntConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingObjLongConsumerCanThrowCheckedException() {
    java.util.function.ObjLongConsumer iface = throwingObjLongConsumer((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPredicateCanThrowCheckedException() {
    java.util.function.Predicate iface = throwingPredicate(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingSupplierCanThrowCheckedException() {
    java.util.function.Supplier iface = throwingSupplier(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToDoubleBiFunctionCanThrowCheckedException() {
    java.util.function.ToDoubleBiFunction iface = throwingToDoubleBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToDoubleFunctionCanThrowCheckedException() {
    java.util.function.ToDoubleFunction iface = throwingToDoubleFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToIntBiFunctionCanThrowCheckedException() {
    java.util.function.ToIntBiFunction iface = throwingToIntBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToIntFunctionCanThrowCheckedException() {
    java.util.function.ToIntFunction iface = throwingToIntFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToLongBiFunctionCanThrowCheckedException() {
    java.util.function.ToLongBiFunction iface = throwingToLongBiFunction((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingToLongFunctionCanThrowCheckedException() {
    java.util.function.ToLongFunction iface = throwingToLongFunction(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingUnaryOperatorCanThrowCheckedException() {
    java.util.function.UnaryOperator iface = throwingUnaryOperator(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingFilterCanThrowCheckedException() {
    java.util.logging.Filter iface = throwingFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPreferenceChangeListenerCanThrowCheckedException() {
    java.util.prefs.PreferenceChangeListener iface = throwingPreferenceChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingResourceBundleControlProviderCanThrowCheckedException() {
    java.util.spi.ResourceBundleControlProvider iface = throwingResourceBundleControlProvider(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingInterpolatableCanThrowCheckedException() {
    javafx.animation.Interpolatable iface = throwingInterpolatable((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingInvalidationListenerCanThrowCheckedException() {
    javafx.beans.InvalidationListener iface = throwingInvalidationListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingWeakListenerCanThrowCheckedException() {
    javafx.beans.WeakListener iface = throwingWeakListener(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingChangeListenerCanThrowCheckedException() {
    javafx.beans.value.ChangeListener iface = throwingChangeListener((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingArrayChangeListenerCanThrowCheckedException() {
    javafx.collections.ArrayChangeListener iface = throwingArrayChangeListener((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingListChangeListenerCanThrowCheckedException() {
    javafx.collections.ListChangeListener iface = throwingListChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingMapChangeListenerCanThrowCheckedException() {
    javafx.collections.MapChangeListener iface = throwingMapChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingSetChangeListenerCanThrowCheckedException() {
    javafx.collections.SetChangeListener iface = throwingSetChangeListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEventDispatcherCanThrowCheckedException() {
    javafx.event.EventDispatcher iface = throwingEventDispatcher((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEventHandlerCanThrowCheckedException() {
    javafx.event.EventHandler iface = throwingEventHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEventTargetCanThrowCheckedException() {
    javafx.event.EventTarget iface = throwingEventTarget(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingInitializableCanThrowCheckedException() {
    javafx.fxml.Initializable iface = throwingInitializable((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAudioSpectrumListenerCanThrowCheckedException() {
    javafx.scene.media.AudioSpectrumListener iface = throwingAudioSpectrumListener((a,b,c,d) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBuilderCanThrowCheckedException() {
    javafx.util.Builder iface = throwingBuilder(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingBuilderFactoryCanThrowCheckedException() {
    javafx.util.BuilderFactory iface = throwingBuilderFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCallbackCanThrowCheckedException() {
    javafx.util.Callback iface = throwingCallback(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDomainManagerOperationsCanThrowCheckedException() {
    org.omg.CORBA.DomainManagerOperations iface = throwingDomainManagerOperations(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingInvokeHandlerCanThrowCheckedException() {
    org.omg.CORBA.portable.InvokeHandler iface = throwingInvokeHandler((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingValueBaseCanThrowCheckedException() {
    org.omg.CORBA.portable.ValueBase iface = throwingValueBase(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingValueFactoryCanThrowCheckedException() {
    org.omg.CORBA.portable.ValueFactory iface = throwingValueFactory(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingCodecFactoryOperationsCanThrowCheckedException() {
    org.omg.IOP.CodecFactoryOperations iface = throwingCodecFactoryOperations(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingPolicyFactoryOperationsCanThrowCheckedException() {
    org.omg.PortableInterceptor.PolicyFactoryOperations iface = throwingPolicyFactoryOperations((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAdapterActivatorOperationsCanThrowCheckedException() {
    org.omg.PortableServer.AdapterActivatorOperations iface = throwingAdapterActivatorOperations((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDOMErrorHandlerCanThrowCheckedException() {
    org.w3c.dom.DOMErrorHandler iface = throwingDOMErrorHandler(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingUserDataHandlerCanThrowCheckedException() {
    org.w3c.dom.UserDataHandler iface = throwingUserDataHandler((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingElementCSSInlineStyleCanThrowCheckedException() {
    org.w3c.dom.css.ElementCSSInlineStyle iface = throwingElementCSSInlineStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDocumentEventCanThrowCheckedException() {
    org.w3c.dom.events.DocumentEvent iface = throwingDocumentEvent(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEventListenerCanThrowCheckedException() {
    org.w3c.dom.events.EventListener iface = throwingEventListener(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLSResourceResolverCanThrowCheckedException() {
    org.w3c.dom.ls.LSResourceResolver iface = throwingLSResourceResolver((a,b,c,d,e) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDocumentRangeCanThrowCheckedException() {
    org.w3c.dom.ranges.DocumentRange iface = throwingDocumentRange(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDocumentStyleCanThrowCheckedException() {
    org.w3c.dom.stylesheets.DocumentStyle iface = throwingDocumentStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingLinkStyleCanThrowCheckedException() {
    org.w3c.dom.stylesheets.LinkStyle iface = throwingLinkStyle(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingNodeFilterCanThrowCheckedException() {
    org.w3c.dom.traversal.NodeFilter iface = throwingNodeFilter(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingAbstractViewCanThrowCheckedException() {
    org.w3c.dom.views.AbstractView iface = throwingAbstractView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingDocumentViewCanThrowCheckedException() {
    org.w3c.dom.views.DocumentView iface = throwingDocumentView(() -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingXPathExpressionCanThrowCheckedException() {
    org.w3c.dom.xpath.XPathExpression iface = throwingXPathExpression((a,b,c) -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingXPathNSResolverCanThrowCheckedException() {
    org.w3c.dom.xpath.XPathNSResolver iface = throwingXPathNSResolver(a -> {
      throw new IOException();
    });
    iface.toString();
  }

  @Test
  public void testThrowingEntityResolverCanThrowCheckedException() {
    org.xml.sax.EntityResolver iface = throwingEntityResolver((a,b) -> {
      throw new IOException();
    });
    iface.toString();
  }
}
