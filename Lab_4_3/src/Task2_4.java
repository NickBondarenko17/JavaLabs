public class Task2_4 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        int[] MyNum = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        for (int i = 0; i < MyNum.length; i += 2) {
            System.out.println(MyNum[i]);
        }
    }
}
