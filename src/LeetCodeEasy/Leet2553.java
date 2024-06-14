package LeetCodeEasy;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums
// after separating them in the same order they appear in nums.
// To separate the digits of an integer is to get all the digits it has in the same order.
// For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
// Input: nums = [13,25,83,77]
// Output: [1,3,2,5,8,3,7,7]
public class Leet2553 {
    public static int[] separateDigits(int[] nums) {
        List<Integer> vec = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int rev = 0;
            while(n > 0){
                int rem = n % 10;
                rev = rev * 10 + rem;
                n /= 10;
            }
            while(rev > 0){
                int rem = rev % 10;
                vec.add(0,rem);
                rev /= 10;
            }
        }
        System.out.println(vec);
//        System.out.println(vec.get(0));
        int []arr = new int [vec.size()];
        int k = vec.size() - 1;
        for(int i = 0; i < vec.size(); i++){
            System.out.println(vec.get(i));
            arr[k--] = vec.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
}
