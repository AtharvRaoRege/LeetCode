package LeetCodeEasy;

import java.util.*;

// Given two integer arrays nums1 and nums2, return an array of their
// intersection
//. Each element in the result must be unique and you may return the result in any order.
public class Leet349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i : nums2) {
            if (hm.containsKey(i) && hm.get(i) > 0) {
                l1.add(i);
                hm.put(i, 0);
            }
        }
        int[] arr = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            arr[i] = l1.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
