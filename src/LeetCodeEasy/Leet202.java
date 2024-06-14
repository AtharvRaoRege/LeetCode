package LeetCodeEasy;
import java.util.ArrayList;
// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

import java.util.ArrayList;

// Example 2:
// Input: n = 2
// Output: false
public class Leet202 {
    public static int cnt = 0;
    public static boolean isHappy(int n) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        while(true){
            int sum = 0;
            while(n>0){
                sum += Math.pow(n % 10,2.0);
                n /= 10;
            }
            if(sum == 1) return true;
            n = sum;
            if(list.contains(sum)) return false;
            list.add(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
