package LeetCodeEasy;
// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Input: nums = [1,1,0,1,1,1]
// Output: 3
public class Leet485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int cnt = 0;
            int j = i;
            while(nums[j] == 1 && j < nums.length) {
                System.out.print(nums[j]+" ");
                cnt++; j++;
            }
            if(cnt > max)  max = cnt;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
