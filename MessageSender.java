import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class MessageSender {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] data = "Ping".getBytes(StandardCharsets.UTF_8);
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(data, data.length, address, 6000);
            socket.send(packet);
            System.out.println("Sent: Ping");
        } catch (Exception e) {
            System.out.println("Sender error: " + e.getMessage());
        }
    }
}
