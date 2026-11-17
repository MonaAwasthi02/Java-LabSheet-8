import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDownloader {
    public static void main(String[] args) {
        String fileUrl = "https://www.example.com/sample.txt";
        Path destination = Path.of("sample.txt");

        try {
            URL url = new URL(fileUrl);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);

            try (InputStream input = connection.getInputStream();
                 OutputStream output = Files.newOutputStream(destination)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("File downloaded to: " + destination.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("Download failed: " + e.getMessage());
            System.out.println("The sample.txt URL may not point to an existing file.");
        }
    }
}
