package LeetCodeEasyString;
// You are given an array of strings names, and an array heights that consists of distinct positive integers.
// Both arrays are of length n.
//
//For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
//Return names sorted in descending order by the people's heights.

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]

//import static java.util.Collections.swap;

import java.util.Arrays;

public class Leet2418 {
    public static void swap(int []arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void swap(String[]arr,int idx1,int idx2){
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void bubbleSort(int []heights,String []names){
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length - i - 1; j++){
                if(heights[j] < heights[j+1]) {
                    swap(heights,j,j+1);
                    swap(names,j,j+1);
                }
            }
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        bubbleSort(heights,names);
        System.out.println(Arrays.toString(heights));
        return names;
    }

    public static void main(String[] args) {
        String []names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
