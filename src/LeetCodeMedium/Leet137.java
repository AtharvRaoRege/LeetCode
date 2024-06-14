package LeetCodeMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
// Given an integer array nums where every element appears three times except for one,
// which appears exactly once.
// Find the single element and return it.
// You must implement a solution with a linear runtime complexity and use only constant
// extra space.

// Input: nums = [2,2,3,2]
// Output: 3
// 139 ms
public class Leet137 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i],1);
            }
        }
        AtomicInteger ans = new AtomicInteger();
        hm.forEach((key,val) ->{
            if(val == 1) ans.set(key);
        });
        int finalAns = ans.get();
        return finalAns;
    }

//    45ms

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                return new int[]{i,hm.get(nums[i])};
            }else{
                hm.put(target - nums[i],i);
            }
        }
        return new int []{-1,-1};
    }


    public static void main(String[] args) {
        int []arr = {2,2,2,3};
        System.out.println(singleNumber(arr));
//        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
