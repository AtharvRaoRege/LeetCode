package LeetCodeEasy;
// You are given a 0-indexed integer array nums, and an integer k.
//
// In one operation, you can remove one occurrence of the smallest element of nums.
//
// Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.

// Input: nums = [2,11,10,1,3], k = 10
// Output: 3
// Explanation: After one operation, nums becomes equal to [2, 11, 10, 3].
// After two operations, nums becomes equal to [11, 10, 3].
// After three operations, nums becomes equal to [11, 10].
// At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
// It can be shown that 3 is the minimum number of operations needed so that all elements of the array are greater than
// or equal to 10.
public class Leet3065 {
    public static int minOperations(int[] nums, int k) {
//        List<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int []arr = {2,11,10,1,3};
        System.out.println(minOperations(arr,10));
    }

}
