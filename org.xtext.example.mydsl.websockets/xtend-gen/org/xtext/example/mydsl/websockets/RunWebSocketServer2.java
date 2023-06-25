package org.xtext.example.mydsl.websockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.eclipse.lsp4j.jsonrpc.Endpoint;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.jsonrpc.RemoteEndpoint;
import org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethodProvider;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.xtext.util.internal.Log;

@Log
@SuppressWarnings("all")
public class RunWebSocketServer2 {
  public static void main(final String[] args) throws InterruptedException, IOException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field localPortÂ is undefined for the type ServerSocket");
  }

  static <T extends Object> Launcher<T> createSocketLauncher(final Object localService, final Class<T> remoteInterface, final ExecutorService executorService, final Function<MessageConsumer, MessageConsumer> wrapper, final InputStream inputStream, final OutputStream outputStream) throws IOException {
    return RunWebSocketServer2.<T>createIoLauncher(localService, remoteInterface, inputStream, outputStream, executorService, wrapper);
  }

  static <T extends Object> Launcher<T> createIoLauncher(final Object localService, final Class<T> remoteInterface, final InputStream in, final OutputStream out, final ExecutorService executorService, final Function<MessageConsumer, MessageConsumer> wrapper) {
    Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<String, JsonRpcMethod>();
    supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(remoteInterface));
    if ((localService instanceof JsonRpcMethodProvider)) {
      JsonRpcMethodProvider rpcMethodProvider = ((JsonRpcMethodProvider) localService);
      supportedMethods.putAll(rpcMethodProvider.supportedMethods());
    } else {
      supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(localService.getClass()));
    }
    MessageJsonHandler jsonHandler = new MessageJsonHandler(supportedMethods);
    MessageConsumer outGoingMessageStream = new StreamMessageConsumer2(out, jsonHandler);
    outGoingMessageStream = wrapper.apply(outGoingMessageStream);
    Endpoint _endpoint = ServiceEndpoints.toEndpoint(localService);
    final RemoteEndpoint serverEndpoint = new RemoteEndpoint(outGoingMessageStream, _endpoint);
    jsonHandler.setMethodProvider(serverEndpoint);
    final MessageConsumer messageConsumer = wrapper.apply(serverEndpoint);
    final StreamMessageProducer reader = new StreamMessageProducer(in, jsonHandler);
    final T remoteProxy2 = ServiceEndpoints.<T>toServiceObject(serverEndpoint, remoteInterface);
    return new Launcher<T>() {
      @Override
      public Future<Void> startListening() {
        return ConcurrentMessageProcessor.startProcessing(reader, messageConsumer, executorService);
      }

      @Override
      public T getRemoteProxy() {
        return remoteProxy2;
      }

      @Override
      public RemoteEndpoint getRemoteEndpoint() {
        return serverEndpoint;
      }
    };
  }

  private static final Logger LOG = Logger.getLogger(RunWebSocketServer2.class);
}
