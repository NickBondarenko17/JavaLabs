public class Task2_3 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        int[] MyNum = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
        while (i < MyNum.length) {
            if (i % 2 != 0) {
                System.out.println(MyNum[i]);
            }
            i++;
        }
    }
}
