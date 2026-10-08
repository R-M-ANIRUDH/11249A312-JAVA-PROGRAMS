import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class MyClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("Hello Server! I am the client.");
            String serverResponse = in.readLine();
            System.out.println("Response from server: " + serverResponse);
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
