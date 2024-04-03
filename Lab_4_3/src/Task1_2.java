public class Task1_2 implements InterfaceMetaZavdannya {
    public void MetaZavdannya() {
        System.out.println("Массив тільки з непарними числами");
        int[] chislo = new int[50];
        int currentNumber = 1; // Початкове парне число
        for (int i = 0; i < chislo.length; i++) {
            chislo[i] = currentNumber;
            currentNumber += 2;
        }
        for (int number : chislo) {
            System.out.print(number + " ");
        }
    }
}