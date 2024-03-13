public class Task3_6 {

    public Task3_6() {
        int i = 0;


        for (double x = 3; x <= 6; x += 0.2) {
            i++;
        }
        System.out.print("кількість значень функцій, що знаходяться в діапазоні: ");
        System.out.println(i);


    }
    private double f(double x) {
        return 0.25 * Math.pow(x,3) * x + 1.2502;
    }
}
