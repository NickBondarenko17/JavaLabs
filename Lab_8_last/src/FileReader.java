import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    private final String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public void readNumbers() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка зчитання з файлу " + e.getMessage());
        }
    }
}