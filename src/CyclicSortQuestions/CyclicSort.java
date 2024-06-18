package CyclicSortQuestions;

import java.util.Arrays;

// cyclic sort is a technique in which numbers from 0 to n or 1 to n are sorted in O(N).
public class CyclicSort {
    public static void swap(int [] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void cyclicSort(int []nums){
        int i = 0;
        while(i < nums.length){
            int currIdx = nums[i]-1;

            if(nums[i] != nums[currIdx]) swap(nums,i,currIdx);
            else i++;
        }
    }
    public static void cyclicSort0(int []nums){
        int i = 0;
        while(i < nums.length){
            int curIdx = nums[i];
            if(nums[i] != nums[curIdx]) swap(nums,i,curIdx);
            else i++;
        }
    }
    public static void main(String[] args){
        int []arr = {1,0,4,2,6,3,7,9,8,5};
        cyclicSort0(arr);
        System.out.println(Arrays.toString(arr));
    }
}
