package LeetCodeEasy;

// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
//
// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] +
// nums[middleIndex+2] + ... + nums[nums.length-1].
//
// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1,
// the right side sum is considered to be 0.
//
// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
// Input: nums = [2,3,-1,8,4]
// Output: 3
public class Leet1991 {
    public static int findMiddleIndex(int[] nums) {
        int []rgtSumArr = new int[nums.length];
        int []lftSumArr = new int[nums.length];
        rgtSumArr[nums.length - 1] = 0;
        lftSumArr[0] = 0;
        //                       2 , 3 , -1 , 8 , 4
        //                       0 , 0+2, 2+3 , 5+(-1), ....
        for(int i = 1; i < nums.length; i++){
            lftSumArr[i] = lftSumArr[i-1] + nums[i-1];
        }
        for(int i = rgtSumArr.length - 2; i >= 0; i--){
            rgtSumArr[i] = rgtSumArr[i+1] + nums[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            if(lftSumArr[i] == rgtSumArr[i]) return i;
            continue;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(arr));
    }
}
