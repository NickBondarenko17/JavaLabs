public class Task33 {
    void Timerwhile() {
        int h = 0;
        int min = 0;

        while (h <= 2) {
            System.out.println(h + " h : " + min + " min");
            min++;
            if (min == 60) {
                h++;
                min = 0;
            }
        }
    }
}