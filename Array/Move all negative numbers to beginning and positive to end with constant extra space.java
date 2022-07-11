import java.util.Arrays;

class MoveElement {
    static void moveElementPosAndNeg(int arr[]){
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + ", ");
    }
    }

    static void method2(int arr[]) {
        int[] a1;
        int[] a2;
        for (int i = 0; i < arr.length; i++) {

        }
    }

    // static void Effie(int arr[], int left, int right) {
    //     left = 0;
    //     right = arr.length - 1;

    //     while (left <= right) {
    //         if (arr[left] < 0 && arr[right] < 0) {
    //             left++;
    //         }

    //         else if (arr[left] < 0 && arr[right] < 0) {
    //             int temp = arr[left];
    //             arr[left] = arr[right];
    //             arr[right] = temp;
    //             left++;
    //             right--;
    //         } else if (arr[left] > 0 && arr[right] > 0)
    //             right--;
    //         else {
    //             left++;
    //             right--;
    //         }

    //     }
    //     for (int i = 0; i <= right; ++i)
    //         System.out.print(arr[i] + " ");

    //     System.out.println();
    // }

    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
    }
}