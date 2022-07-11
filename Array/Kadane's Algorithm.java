class Solution {

    long maxSubarraySum(int arr[], int n) {

        // Your code here
        long max = Integer.MIN_VALUE;
        long sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            if (sum + curr < curr) {
                sum = curr;
            } else {
                sum += curr;
            }
            max = Math.max(sum, max);
        }
        return max;
    }

}