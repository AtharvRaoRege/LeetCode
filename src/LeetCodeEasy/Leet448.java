package LeetCodeEasy;

import java.util.ArrayList;
import java.util.List;

// Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
public class Leet448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!list.contains(i)) list1.add(i);
        }
        return list1;
    }
}
