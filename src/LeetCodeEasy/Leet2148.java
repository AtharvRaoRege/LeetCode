package LeetCodeEasy;
//Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater
//element appear in nums
//Input: nums = [11,7,2,15]
//Output: 2
public class Leet2148 {
    public static boolean isAvailabeGreater(int []nums,int val){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > val) return true;
            continue;
        }
        return false;
    }
    public static boolean isAvailableSmaller(int []nums,int val){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < val) return true;
            continue;
        }
        return false;
    }
    public static int countElements(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(isAvailabeGreater(nums,nums[i]) && isAvailableSmaller(nums,nums[i])) ans++;
            continue;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {11,7,2,15};
        System.out.println(countElements(arr));
    }
}
