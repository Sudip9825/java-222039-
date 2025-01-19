import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// read this for exam
public class NcitClient {
    public static void main(String[] args) {
        try {

            // Create socket to connect to the server at localhost on port 12345
            Socket socket = new Socket("localhost", 12345);
            // get input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // send message to the server
            out.println("hellow Server!");
            // read and print the response from the server
            String response = in.readLine();
            System.out.println("Reaponse from server:" + response);
            // close the connection
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
