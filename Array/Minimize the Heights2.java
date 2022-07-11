import java.util.Arrays;

class MinimizetheHeights2 {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        
        for(int i=1; i<n; i++){
            int smallest = Math.min(arr[0]+k, arr[i]-k);
            int largest = Math.max(arr[n-1]-k, arr[i-1]+k);
            if(smallest>=0)
                res = Math.min(res, largest-smallest);
        }
        return res;
    }    
    public static void main(String[] args) {
        int[] arr = {1,5,8,10};
        int n = arr.length;
        int k = 2;
        System.out.println(getMinDiff(arr, n, k));

    }
}
