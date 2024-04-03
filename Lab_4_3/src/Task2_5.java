public class Task2_5 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        int[] MyNum = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        for (int i = MyNum.length - 1; i >= 0; i--) {
            System.out.println(MyNum[i]);
        }
    }
}
