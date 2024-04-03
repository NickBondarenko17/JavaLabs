public class Task_4 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        int[] array = {1, 7, 19, 45, 32};

        for (int a = 0; a < array.length; a++) {
            if (a % 2 != 0) {
                array[a] *= -1;
            }
        }

        for (double v : array) {
            System.out.println(v);
        }
    }
}
