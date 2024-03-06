import java.util.Scanner;

public class Task5 {

    public Task5 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть порядковий номер місяця : ");
        int month = scanner.nextInt();

        String season = switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Літо";
            case 9, 10, 11 -> "Осінь";
            default -> "Невірний номер місяця";
        };

        System.out.println("Місяць " + month + " відноситься до " + season);
    }
}