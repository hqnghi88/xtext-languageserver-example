/*******************************************************************************************************
 *
 * HeadlessSimulationLoader.java, in msi.gama.headless, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.2).
 *
 * (c) 2007-2023 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package msi.gama.headless.core;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.lsp4j.jsonrpc.JsonRpcException;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.jsonrpc.MessageIssueException;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.util.Modules2; 

import com.google.inject.Guice;
import com.google.inject.Injector;

import msi.gama.common.preferences.GamaPreferences;
import msi.gama.kernel.model.IModel;
import msi.gama.lang.gaml.GamlRuntimeModule;
import msi.gama.lang.gaml.GamlStandaloneSetup;
import msi.gama.lang.gaml.ide.GamlIdeModule;
import msi.gama.lang.gaml.validation.GamlModelBuilder;
import msi.gama.precompiler.GamlProperties;
import msi.gama.runtime.GAMA;
import msi.gama.runtime.NullGuiHandler;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gaml.compilation.GamlCompilationError;
import one.util.streamex.StreamEx;
import ummisco.gama.dev.utils.DEBUG;

/**
 * The Class HeadlessSimulationLoader.
 */
public class HeadlessSimulationLoader {

	static {
		DEBUG.ON();
	}

	/**
	 * The injector to use in headless mode
	 */
	Injector injector;

	/** The instance. */
	private static HeadlessSimulationLoader INSTANCE = new HeadlessSimulationLoader();

	/**
	 * Instantiates a new headless simulation loader.
	 */
	// Singleton
	private HeadlessSimulationLoader() {
	}

	/**
	 * Gets the injector.
	 *
	 * @return the injector
	 */
	public static Injector getInjector() {
		return INSTANCE.configureInjector();
	}

	/**
	 * Preload GAMA.
	 */
	public static void preloadGAMA() {
		INSTANCE.configureInjector();
	}

	/**
	 * Configure injector.
	 *
	 * @return the injector
	 */
	private Injector configureInjector() {
		if (injector != null)
			return injector;
		DEBUG.LOG("GAMA configuring and loading...");
		System.setProperty("java.awt.headless", "true");
		var isServer = GAMA.isInServerMode();
		GAMA.setHeadLessMode(false, new NullGuiHandler());
//		try {
//			// We initialize XText and Gaml.
			injector = GamlStandaloneSetup.doSetup();
//		} catch (final Exception e1) {
//			throw GamaRuntimeException.create(e1, GAMA.getRuntimeScope());
//		}
		// SEED HACK // WARNING AD : Why ?
//		GamaPreferences.External.CORE_SEED_DEFINED.set(true);
//		GamaPreferences.External.CORE_SEED.set(1.0);
		// SEED HACK
//		Injector injector1 = injector.createChildInjector(new XServerModule()); 

//		Injector injector1 = Guice.createInjector(new XServerModule());

		try {
//			injector.getBinding(IResourceDescriptions.class)
//			Injector injector1 = injector.createChildInjector(new MyDslIdeModule());// Guice.createInjector(new XServerModule());
			Injector injector1 = Guice.createInjector(Modules2.mixin(new GamlRuntimeModule(), new GamlIdeModule()));

//			Injector injector1 = MyDslStandaloneSetup.doSetup();// Guice.createInjector(new XServerModule());
			LanguageServerImpl languageServer = injector1.getInstance(LanguageServerImpl.class);
			Function<MessageConsumer, MessageConsumer> wrapper = consumer -> {
				MessageConsumer result = new MessageConsumer() {

					@Override
					public void consume(Message message) throws MessageIssueException, JsonRpcException {
						System.out.println(message);
						consumer.consume(message);

					}
				};
				return result;
			};
			Launcher<LanguageClient> launcher = createSocketLauncher(languageServer, LanguageClient.class,
					new InetSocketAddress("localhost", 5007), Executors.newCachedThreadPool(), wrapper);
			languageServer.connect(launcher.getRemoteProxy());
			Future<?> future = launcher.startListening();
			while (!future.isDone()) {
				Thread.sleep(10_000l);
			}
//			LanguageServerImpl languageServer = injector1.getInstance(LanguageServerImpl.class);
//			Function<MessageConsumer, MessageConsumer> wrapper = consumer -> {
//				MessageConsumer result = new MessageConsumer() {
//
//					@Override
//					public void consume(Message message) throws MessageIssueException, JsonRpcException {
//						System.out.println(message);
//						consumer.consume(message);
//
//					}
//				};
//				return result;
//			};
//			Launcher<LanguageClient> launcher;
//			launcher = createSocketLauncher(languageServer, LanguageClient.class,
//					new InetSocketAddress("localhost", 5007), Executors.newCachedThreadPool(), wrapper);
//
//			languageServer.connect(launcher.getRemoteProxy());
//			Future<?> future = launcher.startListening();
//			while (!future.isDone()) {
//				Thread.sleep(10_000l);
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return injector;
	}

	<T> Launcher<T> createSocketLauncher(Object localService, Class<T> remoteInterface, SocketAddress socketAddress,
			ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper) throws IOException {
		AsynchronousServerSocketChannel serverSocket = AsynchronousServerSocketChannel.open().bind(socketAddress);
		AsynchronousSocketChannel socketChannel;
		try {
			socketChannel = serverSocket.accept().get();
			return Launcher.createIoLauncher(localService, remoteInterface, Channels.newInputStream(socketChannel),
					Channels.newOutputStream(socketChannel), executorService, wrapper);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
