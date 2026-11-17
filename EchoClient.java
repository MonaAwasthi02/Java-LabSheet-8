import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a message: ");
            String message = keyboard.readLine();
            out.println(message);
            System.out.println("Echo from server: " + in.readLine());
        } catch (Exception e) {
            System.out.println("Echo client error: " + e.getMessage());
        }
    }
}
