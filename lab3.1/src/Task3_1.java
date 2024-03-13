import java.util.Scanner;

public class Task3_1 {


    public Task3_1() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your Word:");
        String word = Scanner.next();

        for (int i = 0; i < 50; i++) {
            System.out.println(word);
        }
    }
}