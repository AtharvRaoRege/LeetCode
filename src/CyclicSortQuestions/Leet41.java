package CyclicSortQuestions;
import java.util.*;
public class Leet41 {
    public static void swap(int [] nums ,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int idx = nums[i];
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[idx]) swap(nums,i,idx);
            else i++;
        }
//        for(int j = 0; j < nums.length; j++){
//            if
//        }
        return -1;
    }
}
