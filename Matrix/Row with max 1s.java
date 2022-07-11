class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int count;
        int max = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            count = 0;
            for(int j =0; j<m; j++){
                if(arr[i][j] == 1){
                    count++;
                }
                if(count > max){
                    max = count;
                    index = i;
                }
            }
        }
        return max==0?-1:index;
    }
}