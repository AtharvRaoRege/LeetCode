package LeetCodeEasy;
// SOLVED BUT HAVE TO WORK ON TIME COMPLEXITY
// CURR TIME COMPLEXITY = 14 ms;
// DESIRED = APPROX (0 ms);

import java.util.Arrays;

//Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
//Input: nums = [10,4,8,3]
//Output: [15,1,11,22]
public class Leet2574 {
    public static int lftSum(int[]nums,int idx){
        int sum = 0;
        for(int i = idx+1; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public static int rgtSum(int []num,int idx){
        int sum = 0;
        for(int i = 0; i < idx; i++){
            sum += num[i];
        }
        return sum;
    }
    public static int[] leftRightDifference(int[] nums){
        int []arr = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = Math.abs(lftSum(nums,i) - rgtSum(nums,i));
        }
        return arr;
    }
    public static void main(String[] args) {
        int []nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
