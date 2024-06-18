package CyclicSortQuestions;
import java.util.*;
public class Leet448 {
    public static void swap(int [] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int idx = nums[i] - 1;
            if(nums[i] != nums[idx]) swap(nums, i, idx);
            else i++;
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j] - 1) li.add(j+1);
        }
        return li;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDisappearedNumbers(arr);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}
