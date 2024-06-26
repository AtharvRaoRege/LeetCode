package Sorting;

import java.util.*;

public class QuickSort {
    public static void swap(int []nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static int partition(int[] nums, int s, int e){
        int pivot = nums[s];
        int cnt = 0;
        for(int i = s+1; i <= e; i++){
            if(pivot >= nums[i]) cnt++;
        }
        int curr_idx = s + cnt;
        swap(nums,s,curr_idx);
        int i = s, j = e;
        while(i < curr_idx && j > curr_idx){
            while(pivot >= nums[i]) i++;
            while(pivot < nums[j]) j--;
            if(i < curr_idx && j > curr_idx) swap(nums,i++,j--);
        }
        return curr_idx;
    }
    public static int[] quickSort(int[] nums, int s, int e){
        if(s < e) {
            int p = partition(nums,s,e);
            quickSort(nums,s,p-1);
            quickSort(nums,p+1,e);
        }
        return nums;
    }

    public static void main(String[] args) {
        int []nums = {5,1,1,2,0,0};

        System.out.println(Arrays.toString(quickSort(nums,0, nums.length - 1)));
    }
}