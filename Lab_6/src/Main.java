import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean checkIsExit = true;

        while(checkIsExit){
            int taskIndex = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Вибери завдання:");
                    System.out.println("Вийти з програми --> натисни 0");
                    System.out.println("Завдання 1-4");

                    taskIndex = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Введіть число! \n\n\n");
                    scan.next();
                }
            }

            if (taskIndex < 0 || taskIndex > 4 || taskIndex == 3){
                System.out.println("Нема такого завдання");
            }
            else{
                TaskInterface taskInterface = new Task1();

                switch (taskIndex) {
                    case 0:
                        checkIsExit = false;
                        break;
                    case 1:
                        taskInterface = new Task1();
                        break;
                    case 2:
                        taskInterface = new Task2();
                        break;
                    case 4:
                        taskInterface = new Task4();
                        break;
                }

                if (checkIsExit){
                    taskInterface.StartTask();
                }
            }
        }
    }
}

