import java.util.ArrayList;

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && A[i] == C[k]) {
                if (!result.contains(A[i])) {
                    result.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] > B[j]) {
                j++;
            } else if (A[i] > C[k]) {
                k++;
            } else {
                i++;
            }

        }
        return result;
    }
}
