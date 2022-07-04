class Reverse {

     static void printReverse(int a[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        printReverse(a, n);
    }

}