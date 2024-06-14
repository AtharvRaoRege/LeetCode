package LeetCodeEasy;
// Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
//
// The digit sum of a positive integer is the sum of all its digits.
// Input: num = 30
// Output: 14
// Explanation:
// The 14 integers less than or equal to 30 whose digit sums are even are
// 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
public class Leet2180 {
    public static boolean isEven(int n){
        int sum = 0;
        int cnt = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        if(sum%2==0) return true;
        return false;
    }

    public static int countEven(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if(isEven(i)) sum ++;
            continue;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countEven(30));
    }
}
