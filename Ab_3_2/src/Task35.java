public class Task35 {
    void Timersec () {
        int sec = 0;
        int h = 0;
        int min = 0 ;
        while (h <= 2 && min < 60 && sec < 60) {
            System.out.println(h + " h " + min + " min " + sec + " sec");
            sec++;
            if (sec == 60) {
                min++;
                sec = 0;
            }
            if (min == 60) {
                h++;
                min = 0;
            }
        }
    }
}