public class Task3_4 {
    public Task3_4 () {
        int h = 0;
        int min = 0;

            while (h <= 2) {
                while (min < 60) {
                    System.out.printf("%d h : %d min\n", h, min);
                    min++;
                }
                min = 0;
                h++;
            }
        }
    }


