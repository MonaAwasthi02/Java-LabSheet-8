import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    public static void main(String[] args) {
        final int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Multi-client server running on port " + port);

            while (true) {
                Socket client = serverSocket.accept();
                Thread clientThread = new Thread(() -> handleClient(client));
                clientThread.start();
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    private static void handleClient(Socket client) {
        String threadName = Thread.currentThread().getName();
        try (client;
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(client.getInputStream()))) {
            String message = in.readLine();
            System.out.println("[" + threadName + "] Client "
                    + client.getInetAddress() + " sent: " + message);
        } catch (Exception e) {
            System.out.println("[" + threadName + "] Client error: " + e.getMessage());
        }
    }
}
