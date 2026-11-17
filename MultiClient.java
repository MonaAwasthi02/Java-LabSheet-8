import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter message: ");
            out.println(scanner.nextLine());
            System.out.println("Message sent.");
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
