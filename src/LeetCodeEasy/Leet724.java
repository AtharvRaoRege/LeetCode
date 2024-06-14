package LeetCodeEasy;

// time complexity = 371 ms
// new time complexity = 1 ms


//import static JavaQuestions.Leet2574.lftSum;
//import static JavaQuestions.Leet2574.rgtSum;

// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the
// sum of all the numbers strictly to the index's right.
//
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.
//
// Return the leftmost pivot index. If no such index exists, return -1
// Input: nums = [1,7,3,6,5,6]
// Output: 3
public class Leet724 {
    public static int lftSum(int []arr,int idx){
        int sum = 0;
        for(int i = 0; i < idx; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int rgtSum(int []arr, int idx){
        int sum = 0;
//        int []lft = new int [arr.length];
//        int []rgt = new int [arr.length];
//
//        lft[0] = 0;
//        rgt[rgt.length - 1] = 0;
//        for(int i = 1; i < lft.length; i++){
//            lft[i] = lft[i-1] + arr[i-1];
//        }
//        for(int i = rgt.length - 2; i <= 0; i--){
//            rgt[i] = rgt[i+1] + arr[i+1];
//        }

        for(int i = idx + 1; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }


    public static int pivotIndex(int[] nums) {
        int []lft = new int [nums.length];
        int []rgt = new int [nums.length];

        lft[0] = 0;
        rgt[rgt.length - 1] = 0;
        for(int i = 1; i < lft.length; i++){
            lft[i] = lft[i-1] + nums[i-1];
        }
        for(int i = rgt.length - 2; i >= 0; i--){
            rgt[i] = rgt[i+1] + nums[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            if(lft[i] == rgt[i]) return i;
            continue;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
