package LeetCodeEasy;
// Given a positive integer n, find the pivot integer x such that:
//
// The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one
// pivot index for the given input.
// Input: n = 8
// Output: 6
// Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
public class Leet2485 {
    public int pivotInteger(int n) {
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int []lft = new int [n];
        int []rgt = new int[n];
        lft[0] = 0;
        rgt[n-1] = 0;
        for(int i = 1; i < n; i++){
            lft[i] = lft[i-1] + arr[i-1];
        }
        for(int i = 0; i < n-1; i++){
            rgt[i] = rgt[i+1] + arr[i+1];
        }
        for(int i = 0; i < n; i++){
            if(lft[i] == rgt[i]) return arr[i];
        }
        return -1;
    }
}
