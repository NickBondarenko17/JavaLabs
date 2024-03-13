import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання : ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                Task3_1 t1 = new Task3_1 ();
                break;
            case 2:
                Task3_2 t2 = new Task3_2 ();
                break;
            case 3:
                Task3_3 t3 = new Task3_3 ();
                break;
            case 4:
                Task3_4 t4 = new Task3_4 ();
                break;
            case 5:
                Task3_5 t5 = new Task3_5 ();
                break;
            case 6:
                Task3_6 t6 = new Task3_6 ();
                break;
            default:
                System.out.println("Немає такого завдання =)");
        }
    }
}
