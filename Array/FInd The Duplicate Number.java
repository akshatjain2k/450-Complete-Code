import java.util.ArrayList;
import java.util.Arrays;

class findduplicateinanarray {
    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dupli = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                dupli = nums[i];
            }
        }
        return dupli;
    }

    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> num = new ArrayList<Integer>();
        Arrays.sort(arr);
        int curr = -1;
        for(int i=0; i< n-1; i++){
            if(arr[i] != curr && arr[i]==arr[i+1]){
                num.add(arr[i]);
                curr = arr[i];
            }
        }
        if(!num.isEmpty()){
            return num;
        }
        else{
            num.add(-1);
            return num;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 6, 1, 2 };
        System.out.println(findDuplicate(nums));

    }
}
