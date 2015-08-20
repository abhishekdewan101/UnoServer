import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by a.dewan on 8/20/15.
 */
public class RokuHandler implements HttpHandler {
    String mPath = "";

    public RokuHandler(String path){
        mPath = path;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        handleRequest();

        //added to close the connection
        String responseString = "All accepeted";
        httpExchange.sendResponseHeaders(200,responseString.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(responseString.getBytes());
        os.close();
    }

    private void handleRequest() {
        System.out.println(mPath);
        switch (mPath){
            case "netflix":
                System.out.println("Netflix URL Detected");
                break;

            case "spotify":
                System.out.println("Spotify URL Detected");
                break;

            case "prime":
                System.out.println("Prime URL Detected");
                break;

            case "hbo":
                System.out.println("HBO URL Detected");
                break;

            default:
                System.out.println("Action has not been configured");
        }
    }
}
