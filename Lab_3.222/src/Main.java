import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;

        while (true) {
            System.out.println("Виберіть завдання:");
            System.out.println("Цифра 1 - Ваше слово 50 разів в циклі while");
            System.out.println("Цифра 2 - Ваше слово 50 разів в циклі for");
            System.out.println("Цифра 3 - Таймер в циклі while");
            System.out.println("Цифра 4 - Таймер в циклі for");
            System.out.println("Цифра 5 - Таймер з секундами");
            System.out.println("Введіть номер завдання:");
            int tasks = scanner.nextInt();

            switch (tasks) {
                case 1:
                    System.out.println("Введіть слово для завдання 1:");
                    String word1 = scanner.next();
                    Task31 task31 = new Task31(word1);
                    task31.wordwhile();
                    break;
                case 2:
                    System.out.println("Введіть слово для завдання 2:");
                    String word2 = scanner.next();
                    Task32 task32 = new Task32(word2);
                    task32.wordfor();
                    break;
                case 3:
                    Task33 task33 = new Task33();
                    task33.Timerwhile();
                    break;
                case 4:
                    Task34 task34 = new Task34();
                    task34.Timerfor();
                    break;
                case 5:
                    Task35 task35 = new Task35();
                    task35.Timersec ();
                    break;
                default:
                    System.out.println("Немає такого завдання");
                    break;
            }

            System.out.println("Бажаєте повернутися до меню вибора завдань?(так/ні)");
            String answer1 = scanner.next();
            if (!answer1.equalsIgnoreCase("так")) {
                System.out.println("Я образився =(");
                break;
            } else {
                System.out.println("Для підтвердження операції введіть ПІДТВЕРДИТИ:");
                String answer2 = scanner.next();
                if (!answer2.equalsIgnoreCase("ПІДТВЕРДИТИ")) {
                    System.out.println("Ви не підтвердили свою дію.");
                    break;
                }
            }
        }
    }
}