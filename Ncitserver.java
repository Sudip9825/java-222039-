import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// read this for exam
public class Ncitserver{
    public static void main(String[] args) {
        try {
            //Create server socket to listen on port 
            ServerSocket serverSocket=new ServerSocket(12345);
            System.out.println("server is listening on port 12345");
            //wait for a client xonnection
            Socket clienSocket= serverSocket.accept();
            System.out.println("client connected");
            //get input and output streams
            BufferedReader in =new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
            PrintWriter out=new PrintWriter(clienSocket.getOutputStream() ,true);
            //read and print the message from the client
            String message=in.readLine();
            System.out.println("message from client" + message);
            //send a response to the client
            out.println("hello from Server!");
            // close the connection
            clienSocket.close();
            serverSocket.close();
        } catch (IOException e) {

            // TODO: handle exception
        e.printStackTrace();
        }
    }
}