package CyclicSortQuestions;
import java.util.*;
public class Leet41 {
        public static void swap(int [] nums, int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        public static void firstMissingPositive(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int idx = nums[i] - 1;
                if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[idx]){
                    swap(nums,i,idx);
                }else i++;
            }
            for(int j = 0; j < nums.length; j++){
//                if(j + 1 != nums[j]) return j+1;
                System.out.print(nums[j]+" ");
            }
//            return nums.length + 1;
        }

    public static void main(String[] args) {
        int []arr = {7,8,9,11,6};
        firstMissingPositive(arr);
    }
}
