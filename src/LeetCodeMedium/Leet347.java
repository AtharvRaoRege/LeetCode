package LeetCodeMedium;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
// Given an integer array nums and an integer k, return the k most frequent elements.
// You may return the answer in any order.

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
public class Leet347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int []ans = new int[k];
        int max = Integer.MIN_VALUE;
        AtomicInteger atom = new AtomicInteger();
        for(int i = 0; i < k; i++){
            hm.forEach((key,val)->{
                if(max < val) atom.set(val);
            });
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
