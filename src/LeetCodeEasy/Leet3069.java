package LeetCodeEasy;
// You are given a 1-indexed array of distinct integers nums of length n.
//
// You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations.
// In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards,
// in the ith operation:
//
// If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise,
// append nums[i] to arr2.
// The array result is formed by concatenating the arrays arr1 and arr2. For example,
// if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].
//Return the array result.

import java.util.Vector;
import java.util.List;
import java.util.Arrays;
public class Leet3069 {
    public static int[] resultArray(int[] nums) {
        int [] ans = new int[nums.length];
        List<Integer> list1 = new Vector<>();
        List<Integer> list2 = new Vector<>();
        List<Integer> list3 = new Vector<>();
        list1.add(nums[1]);
        list2.add(nums[2]);
        for(int i = 3; i < nums.length; i++){
            if(list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) list1.add(nums[i]);
            else list2.add(nums[i]);
        }
        list3.addAll(list1);
        list3.addAll(list2);
        for(int i = 0; i <nums.length; i++){
            ans[i] = list3.get(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int []arr = {1,2,3};
        System.out.print(Arrays.toString(resultArray(arr)));
    }
}
