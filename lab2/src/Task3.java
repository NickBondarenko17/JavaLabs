import java.util.Scanner;

public class Task3 {

    public Task3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        boolean chislo = number >= 10 && number <= 99;
        boolean dilnik = number % 2 == 0;

        if (chislo && dilnik) {
            System.out.println("Число є двозначним і парним");
        } else if (chislo) {
            System.out.println("Число є двозначним, але не парним");
        } else if (dilnik) {
            System.out.println("Число не є двозначним, але парне");
        } else {
            System.out.println("Число не є двозначним та не парне");
        }
    }
}