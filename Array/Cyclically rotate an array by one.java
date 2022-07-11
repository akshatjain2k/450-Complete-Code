class cyclicallyShift {
    static void cShift(int arr[], int n) {
        int res = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = res;
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        cShift(arr, n);
    }
}