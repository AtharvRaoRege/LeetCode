package LeetCodeEasy;
import java.util.HashMap;
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
public class Leet169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            if(map.containsValue(i)) {
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        int max = Integer.MIN_VALUE;
        for(int i: map.keySet()){
            if(map.get(i) > max) max = map.get(i);
            continue;
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
