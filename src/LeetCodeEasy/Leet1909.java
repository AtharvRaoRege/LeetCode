package LeetCodeEasy;
// Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element,
// or false otherwise. If the array is already strictly increasing, return true.
//
// The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
// Input: nums = [1,2,10,5,7]
// Output: true
public class Leet1909 {
    public static boolean canBeIncreasing(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) cnt++;
        }
        System.out.println(cnt);
        if(cnt == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        int []arr = {2,3,1,2};
        System.out.println(canBeIncreasing(arr));
    }
}
