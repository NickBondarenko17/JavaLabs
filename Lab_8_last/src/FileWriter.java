import java.io.IOException;
import java.util.Random;
public class FileWriter {
    private final String filename;
    private final int min;
    private final int max;
    public FileWriter(String filename, int min, int max) {
        this.filename = filename;
        this.min = min;
        this.max = max;
    }
    public void writeNumbers() {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename, true)) {
            Random random = new Random();
            for (int i = 0; i < 15; i++) {
                int number = random.nextInt(max - min + 1) + min;
                writer.append(String.valueOf(number));
                writer.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Помилка запису з файлу: " + e.getMessage());
        }
    }
}