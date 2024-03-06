import java.util.Scanner;

public class Task2 {

    public Task2 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть x: ");
        int x = scanner.nextInt();

        System.out.print("Введіть y: ");
        int y = scanner.nextInt();

        int quadrant;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }

        System.out.println("Точка числа знаходиться у " + quadrant + " квадрант");
    }
}