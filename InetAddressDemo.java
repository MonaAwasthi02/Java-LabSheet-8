import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Host name: " + localHost.getHostName());
            System.out.println("IP address: " + localHost.getHostAddress());
        } catch (Exception e) {
            System.out.println("Unable to find host information: " + e.getMessage());
        }
    }
}
