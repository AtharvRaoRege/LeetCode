package LeetCodeEasy;

import java.util.ArrayList;
import java.util.List;

// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers
// and the number of negative integers.
// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg,
// then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.
// Input: nums = [-2,-1,-1,1,2,3]
// Output: 3
public class Leet2529 {
    public static int maximumCount(int[] nums) {
//        List<Integer> list = new ArrayList<Integer>();

        int negCnt = 0;
        int posCnt = 0;
        if(nums[0] > 0) posCnt++;
        else if (nums[0] < 0) {
            negCnt++;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]) continue;
            if(nums[i] > 0) posCnt++;
            else negCnt++;
//            list.add(nums[i]);
        }
        System.out.println(negCnt +" "+ posCnt);
        if(posCnt > negCnt) return posCnt;
        return negCnt;
    }

    public static void main(String[] args) {
        int []num = {-1924,-1910,-1840,-1797,-1714,-1640,-1638,-1567,-1564,-1409,-1141,-1115,-1068,-658,-465,-447,-434,-386,
                -321,-191,-186,-127,-63,69,186,253,334,401,482,805,809,812,833,913,955,991,1113,1128,1133,1178,1204,1570,1616,
                1725,1729,1787,1853,1943,1980,1980};
        int []arr = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(num));
    }
}
