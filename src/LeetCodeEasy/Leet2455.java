package LeetCodeEasy;
// Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
//
// Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
// Input: nums = [1,3,6,10,12,15]
// Output: 9
// Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
public class Leet2455 {
    public static int averageValue(int[] nums) {
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0){
                cnt++;
                sum += nums[i];
            }
        }
        if(cnt == 0) return 0;
        return sum/cnt;
    }

    public static void main(String[] args) {
        int []arr = {1,2,4,7,10};
        System.out.println(averageValue(arr));
    }
}
