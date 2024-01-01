package hello.java.server;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class ClientServer {
    private final int port = 3000;

    public void start() throws Exception {
        InetSocketAddress addr = new InetSocketAddress(this.port);
        HttpServer server = HttpServer.create(addr, 0);

        server.createContext("/", new RequestHandler());
        server.start();
        System.out.println("Server running on port:" + this.port);
    }
}
