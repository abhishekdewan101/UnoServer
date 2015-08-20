import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by abhishekdewan on 8/19/15.
 * This file is a template for the rest of the handler classes and could be removed if needed later on.
 */
public class TestHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

//        Template for creating and sending responses in response to incoming messages.
//        String responseString = "All accepeted";
//
//        httpExchange.sendResponseHeaders(200,responseString.length());
//        OutputStream os = httpExchange.getResponseBody();
//        os.write(responseString.getBytes());
//        os.close();
    }
}
