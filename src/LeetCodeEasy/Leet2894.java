package LeetCodeEasy;
// You are given positive integers n and m.
//
// Define two integers, num1 and num2, as follows:
//
// num1: The sum of all integers in the range [1, n] that are not divisible by m.
// num2: The sum of all integers in the range [1, n] that are divisible by m.
// Return the integer num1 - num2
// Input: n = 10, m = 3
// Output: 19
public class Leet2894 {
    public static int differenceOfSums(int n, int m) {
        int num1 = 0,num2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0) num1 += i;
            if(i % m == 0) num2 += i;
            else continue;
        }

        return num1 - num2;
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }
}
