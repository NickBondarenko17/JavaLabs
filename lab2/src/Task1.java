import java.util.Scanner;

public class Task1 {

    public Task1 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть c: ");
        double c = scanner.nextDouble();

        double dsc = b * b - 4 * a * c;

        if (dsc > 0) {
            double x1 = (-b + Math.sqrt(dsc)) / (2 * a);
            double x2 = (-b - Math.sqrt(dsc)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (dsc == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Рівняння не маэ коренів");
        }
    }
}