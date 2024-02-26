import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        final String serverAddress = "localhost"; // Change to the server's IP address if not running locally
        final int serverPort = 12345; // Change to the port on which the server is running

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Create output stream to send data to the server
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter out = new PrintWriter(outputStream, true);

            // Send "Hello" message to the server
            out.println("Hello");

            // Close the socket
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + serverAddress);
        } catch (IOException e) {
            System.err.println("Error occurred while communicating with the server: " + e.getMessage());
        }
    }
}
