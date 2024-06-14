package LeetCodeEasy;
//ou are given a positive integer array nums.
//
//The element sum is the sum of all the elements in nums.
//The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
//Return the absolute difference between the element sum and digit sum of nums.
//
//Note that the absolute difference between two integers x and y is defined as |x - y|.
//Input: nums = [1,15,6,3]
// Output: 9
// 1+1+5+6+3 = 16
// 1+15+6+3 = 25
// diff = 9;
public class Leet2535 {
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static int differenceOfSum(int[] nums) {
        int diff = 0;
        int sumDigits = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sumDigits += sumOfDigit(nums[i]);
            sum += nums[i];
        }
        diff = Math.abs(sumDigits - sum);
        return diff;
    }
    public static void main(String[] args) {
        int []arr = {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
}
