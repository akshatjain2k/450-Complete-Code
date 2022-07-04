import java.util.Arrays;

class Kthlargest {
    static int KthlargestElement(int arr[], int k){
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        return arr[arr.length-k-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,6,8,3};
        int k = 4;
        System.out.println(KthlargestElement(arr, k));
    }
}
