import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by abhishekdewan on 8/19/15.
 */
public class Server {

    private int mPortNumber = 0;
    private HttpServer mHttpServer;

    public Server(int port){
        mPortNumber = port;
        createServer();
        setupHandlers();
    }

    private void setupHandlers() {

//        template for creating and adding handlers to the the httpserver.
//        mHttpServer.createContext("/test/this", new TestHandler());

          mHttpServer.createContext("/roku/netflix", new RokuHandler("netflix"));
          mHttpServer.createContext("/roku/spotify", new RokuHandler("spotify"));
          mHttpServer.createContext("/roku/prime", new RokuHandler("prime"));
          mHttpServer.createContext("/roku/hbo", new RokuHandler("hbo"));



//        make sure executor is set "null" and start the server
        mHttpServer.setExecutor(null);
        mHttpServer.start();
    }

    private void createServer(){
        try {
            this.mHttpServer = HttpServer.create(new InetSocketAddress(mPortNumber), 0);
            System.out.println("Starting a server on localhost:"+mPortNumber);
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
     Server mServer = new Server(12000);
    }
}
