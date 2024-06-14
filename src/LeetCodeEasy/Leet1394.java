package LeetCodeEasy;
//                                                  Submitted ✅
import java.util.Arrays;

// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer return -1.
// Input: arr = [2,2,3,4]
// Output: 2
public class Leet1394 {
    public static int findLucky(int[] arr) {
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--){
            if(cnt(arr,arr[i]) == arr[i]) return arr[i];
            continue;
        }
        return -1;
    }

    public static int cnt(int[] arr, int num) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[]arr = {2,2,2,3,3};
        System.out.println(findLucky(arr));
    }
}
