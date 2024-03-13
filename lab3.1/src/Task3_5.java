public class Task3_5 {
    public Task3_5() {
        for (int h = 0; h <= 2; h++) {
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    System.out.printf("%d h %d min %d sec\n", h, min, sec);
                }
            }
        }
    }
}