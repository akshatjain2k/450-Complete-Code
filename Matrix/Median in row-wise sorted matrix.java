import java.util.Arrays;

class Solution {
    int median(int matrix[][], int r, int c) {
        // code here
        int[] temp = new int[r * c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        return temp[r * c / 2];
    }
}