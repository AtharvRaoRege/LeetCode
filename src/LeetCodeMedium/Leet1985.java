package LeetCodeMedium;
import java.util.Arrays;
public class Leet1985 {
    public static String kthLargestNumber(String[] nums, int k) {
        int []num = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            num[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(num);
        return String.valueOf(num[0]);
    }
    public static int[] plusOne(int[] nums) {
        for(int i = nums.length - 1; i > -1; i--){
            if(nums[i] < 9) {
                nums[i] += 1;
                return nums;
            }else{
                nums[i] = 0;
            }
        }
        int []n = new int[nums.length + 1];
        n[0] = 1;
        return nums;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,9};
//        System.out.println(kthLargestNumber(nums,4));
//        String s = "dfa12321afd";
//        StringBuilder str = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i)>='0' && s.charAt(i)<='9') str.append(s.charAt(i));
//        }
//        System.out.println(String.valueOf(str));

        System.out.println(Arrays.toString(plusOne(nums)));
    }

}
