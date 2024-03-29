package com.googlecode.whiteprint.jcip.task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;

/**
 * ThreadPerTaskWebServer
 * <p/>
 * Web server that starts a new thread for each request
 *
 * @author Brian Goetz and Tim Peierls
 */
public class ThreadPerTaskWebServer {
    
    @Test
    public void testThreadPerTaskWebServer() throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                public void run() {
                    handleRequest(connection);
                }
            };
            new Thread(task).start();
        }
    }

    private static void handleRequest(Socket connection) {
        // request-handling logic here
    }
}
