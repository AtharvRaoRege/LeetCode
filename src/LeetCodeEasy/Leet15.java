package LeetCodeEasy;
import java.util.List;
import java.util.*;

// 3 Sum
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
// and j != k, and nums[i] + nums[j] + nums[k] == 0.
public class Leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if( i != j && j != k && nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list.add(list1);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []arr = {-1,0,1,2,-1,-4};

    }
}
