public class Task3 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        int[] array = {15, 72,3, 434, 41, 56};

        double sum = 0;
        for (double v : array) {
            sum += v;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
