import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання : ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                Task1 t1 = new Task1 ();
                break;
            case 2:
                Task2 t2 = new Task2 ();
                break;
            case 3:
                Task3 t3 = new Task3 ();
                break;
            case 5:
                Task5 t4 = new Task5 ();
                break;
            default:
                System.out.println("Немає такого завдання =)");
        }
    }
}
