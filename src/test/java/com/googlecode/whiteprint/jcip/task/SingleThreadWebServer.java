package com.googlecode.whiteprint.jcip.task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;

/**
 * SingleThreadWebServer
 * <p/>
 * Sequential web server
 *
 * @author Brian Goetz and Tim Peierls
 */

public class SingleThreadWebServer {
    
    @Test
    public void testSingleThreadWebServer() throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            Socket connection = socket.accept();
            handleRequest(connection);
        }
    }

    private static void handleRequest(Socket connection) {
        // request-handling logic here
    }
}
