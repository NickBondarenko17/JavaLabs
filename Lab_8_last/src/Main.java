import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Треба ввести назву файлу: ");
        String filename = scanner.nextLine();

        System.out.println("Виберіть завдання:");
        System.out.println("1. Записати у файл");
        System.out.println("2. Прочитати з файлу");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Мінімальне число вибірки: ");
                int min = scanner.nextInt();

                System.out.print("Максимальне число вибірки: ");
                int max = scanner.nextInt();
                FileWriter writetask = new FileWriter(filename, min, max);
                writetask.writeNumbers();
                break;
            case 2:
                FileReader readtask = new FileReader(filename);
                readtask.readNumbers();
                break;
            default:
                System.out.println("Невірна операція");
        }

        scanner.close();
    }
}