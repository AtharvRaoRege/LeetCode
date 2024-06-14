package LeetCodeEasy;
import java.util.ArrayList;
// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays.
// If there is no common integer amongst nums1 and nums2, return -1.
//
// Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer

// Input: nums1 = [1,2,3], nums2 = [2,4]
// Output: 2
public class Leet2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(list.contains(nums2[i])) return nums2[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int []num1 = {1,2,3};
        int []num2 = {2,4};
        System.out.println(getCommon(num1,num2));
    }
}

