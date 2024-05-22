class Task2 implements MinimalneChislo {
    public int findMinimum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
