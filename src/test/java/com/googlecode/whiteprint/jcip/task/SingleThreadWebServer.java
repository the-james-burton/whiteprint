package com.googlecode.whiteprint.jcip.task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * SingleThreadWebServer
 * <p/>
 * Sequential web server
 * 
 * @author Brian Goetz and Tim Peierls
 */

public class SingleThreadWebServer {

    // @Test
    public void test() throws IOException {
	ServerSocket socket = new ServerSocket(80);
	while (true) {
	    Socket connection = socket.accept();
	    handleRequest(connection);
	}
    }

    private void handleRequest(Socket connection) {
	// request-handling logic here
    }
}
