package LeetCodeEasy;
import java.util.Arrays;
// Given an array arr, replace every element in that array with the greatest element among the elements to its right,
// and replace the last element with -1.
// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
public class Leet1299 {
    public static int maxOnRight(int[]arr,int idx){
        int max = Integer.MIN_VALUE;
        for(int i = idx + 1; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    public static int[] replaceElements(int[] arr) {
        int []temp = new int[arr.length];
        int []temp2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) temp[i] = arr[i];

        for(int i = 0; i < arr.length - 1; i++){
            temp2[i] = maxOnRight(temp,i);
        }
        temp2[temp.length -  1] = -1;
        return temp2;
    }
    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
