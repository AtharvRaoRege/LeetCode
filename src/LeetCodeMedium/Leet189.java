package LeetCodeMedium;

import java.util.Arrays;

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

        //                                       Effective Approach ->
        // -> reverse full array
        // -> then reverse first k elements
        // -> then reverse the remaining elements.


public class Leet189 {
    public static void swap(int []nums, int i, int j){
        int temp = nums[i];
        nums[i] =  nums[j];
        nums[j] = temp;
    }
    public static void reverseArray(int []nums, int s, int e){
        while(s<e){
            swap(nums,s,e-1);
            s++;e--;
        }
    }
    public static void rotate(int[] nums, int k) {
        reverseArray(nums,0, nums.length);
        reverseArray(nums,0,k);
        reverseArray(nums,k, nums.length);
    }

    public static void main(String[] args) {
        int []arr = {-1};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
