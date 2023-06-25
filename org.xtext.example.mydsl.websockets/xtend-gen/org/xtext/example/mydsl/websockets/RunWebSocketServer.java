package org.xtext.example.mydsl.websockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.xtext.util.internal.Log;

@Log
@SuppressWarnings("all")
public class RunWebSocketServer {
  public static void main(final String[] args) throws InterruptedException, IOException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field localPortÂ is undefined for the type ServerSocket");
  }

  static <T extends Object> Launcher<T> createSocketLauncher(final Object localService, final Class<T> remoteInterface, final ExecutorService executorService, final Function<MessageConsumer, MessageConsumer> wrapper, final InputStream inputStream, final OutputStream outputStream) throws IOException {
    return Launcher.<T>createIoLauncher(localService, remoteInterface, inputStream, outputStream, executorService, wrapper);
  }

  private static final Logger LOG = Logger.getLogger(RunWebSocketServer.class);
}
