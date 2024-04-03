import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfaceMetaZavdannya MyInterface;
        MyInterface = new Task1();
        boolean i = true;


        while (true) {
            System.out.println("Виберіть завдання:");
            System.out.println("Цифра 1 - Масив з парними числами");
            System.out.println("Цифра 2 - Масив з непарними числами");
            System.out.println("Цифра 3 - перебрати масив циклом while");
            System.out.println("Цифра 4 - перебрати його циклом for");
            System.out.println("Цифра 5 - перебрати циклом while та вивести  числа тільки з непарним індексом");
            System.out.println("Цифра 6 - перебрати циклом for та вивести  числа тільки з парним індексом");
            System.out.println("Цифра 7 - вивести масив в зворотньому порядку.");
            System.out.println("Цифра 8 - Обчислити в заданому масиві суму елементів масиву");
            System.out.println("Цифра 9 - Змінити знак всіх непарних елементів масиву.");

            System.out.println("Введіть номер завдання:");
            int tasks = scanner.nextInt();

            switch (tasks) {
                case 1:
                    MyInterface = new Task1();
                    break;
                case 2:
                    MyInterface = new Task1_2();
                    break;
                case 3:
                    MyInterface = new Task2();
                    break;
                case 4:
                    MyInterface = new Task2_2();
                    break;
                case 5:
                    MyInterface = new Task2_3();
                    break;
                case 6:
                    MyInterface = new Task2_4();
                    break;
                case 7:
                    MyInterface = new Task2_5();
                    break;
                case 8:
                    MyInterface = new Task3();
                    break;
                case 9:
                    MyInterface = new Task_4();
                    break;
                default:
                    System.out.println("Немає такого завдання");
                    break;
            }
            MyInterface.MetaZavdannya();
            System.out.println("Бажаєте повернутися до меню вибора завдань?(так/ні)");
            String answer1 = scanner.next();
            if (!answer1.equalsIgnoreCase("так")) {
                System.out.println("Я образився =(");
                break;
            } else {
                System.out.println("Для підтвердження операції введіть +:");
                String answer2 = scanner.next();
                if (!answer2.equalsIgnoreCase("+")) {
                    System.out.println("Ви не підтвердили свою дію.");
                    break;
                }
            }
        }

    }
}