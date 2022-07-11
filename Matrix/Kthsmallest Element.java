import java.util.Arrays;

class KthsmallestElement {

    static void sortedMatrix(int N, int Mat[][], int x) {
        // code here
        int[] temp = new int[N * N];
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[k++] = Mat[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;
        for (int i = 0; i < N*N; i++) {
            System.out.println(temp[i]);
        }
        int kSmall = temp[x-1];
        System.out.println(kSmall);
    }

    public static void main(String[] args) {
        int[][] Mat = { { 16, 28, 60, 64 },
                { 22, 41, 63, 91 },
                { 27, 50, 87, 93 },
                { 36, 78, 87, 94 } };
        int x = 3;
        sortedMatrix(4, Mat, 3);
    }

}
