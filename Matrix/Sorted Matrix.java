import java.util.Arrays;

class Solution {
    static int[][] sortedMatrix(int N, int Mat[][]) {
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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = temp[k++];
            }
        }
        return Mat;
    }
    public static void main(String[] args) {
        int[][] Mat = {{16, 28, 60, 64},
        {22, 41, 63, 91},
        {27, 50, 87, 93},
        {36, 78, 87, 94 }};
        
        System.out.println(sortedMatrix(4, Mat));
    }
    
}
