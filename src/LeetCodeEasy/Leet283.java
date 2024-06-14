package LeetCodeEasy;
import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


// given an integer array and an integer k, return the first element of frequency equals to k of an element, if not
// present return -1;

// nums[] = {
public class Leet283 {
    public static void moveZeroes(int[] nums) {
        int r = 0 , l = 0;
        while(r < nums.length){
            if(nums[r] == 0) r++;
            else {
                int temp =  nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++; l++;
            }
        }
    }


    public static void main(String[] args) {
        int []arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
