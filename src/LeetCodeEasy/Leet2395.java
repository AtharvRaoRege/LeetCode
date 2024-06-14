package LeetCodeEasy;
// Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum.
// Note that the two subarrays must begin at different indices.
//
// Return true if these subarrays exist, and false otherwise.
//
// A subarray is a contiguous non-empty sequence of elements within an array.
// Input: nums = [4,2,4]
// Output: true

// Input: nums = [1,2,3,4,5]
// Output: false
public class Leet2395 {
    public static int sumOf2(int []arr,int idx){
        int sum = 0;
        int j = 0;
        for(int i = idx+1; j < 2; i++){

        }
        return sum;
    }

    public static boolean findSubarrays(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;

        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(findSubarrays(arr));
    }
}
