import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        while (exit != 0) {
            System.out.println("Введіть номер завдання 1, 2, 3, або введіть 0 для виходу:");
            System.out.println("Ваше завдання:");
            int taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1:
                    PloshchaPryamokutnika task1 = new Task1();
                    System.out.print("Введіть довжину прямокутника: ");
                    double length = scanner.nextDouble();
                    System.out.print("Введіть ширину прямокутника: ");
                    double width = scanner.nextDouble();
                    double area = task1.calculatePloshchaPryamokutnika(length, width);
                    System.out.println("Площа прямокутника: " + area);
                    break;
                case 2:
                    MinimalneChislo task2 = new Task2();
                    System.out.print("Введіть перше число: ");
                    int a = scanner.nextInt();
                    System.out.print("Введіть друге число: ");
                    int b = scanner.nextInt();
                    System.out.print("Введіть третє число: ");
                    int c = scanner.nextInt();
                    int minimum = task2.findMinimum(a, b, c);
                    System.out.println("Найменше число: " + minimum);
                    break;
                case 3:
                    System.out.print("Введіть яка розмірність буде для масиву: ");
                    int size = scanner.nextInt();
                    int[] Rozmir = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.print("Введіть " + (i + 1) + "-й елемент вашого масиву: ");
                        Rozmir[i] = scanner.nextInt();
                        NashArray task3 = new Task3();
                        task3.printNashArray(Rozmir);
                    }
                    break;
                case 0:
                    exit = 0;
                    System.out.println("Вихід з програми виконано успішно");
                    break;
                default:
                    System.out.println("Введено неправильний номер завдання. Виберіть завдання ще раз.");
            }
        }
    }
}
