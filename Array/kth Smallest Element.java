import java.util.PriorityQueue;

// Expected Time Complexity - O(n)
// Actual tc is more
class KthSmall {
    static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int x = k - 1;
        while (x > 0) {
            pq.remove();
            x--;
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int a[] = { 5, 8, 3, 7, 9, 1, 4, 6 };
        int k = 4;
        System.out.println(kthSmallest(a, k));
    }
}