package LeetCodeEasy;
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
// Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it.
//                                               SOLVED
public class Leet258 {
    public static int addDigits(int num) {
        int ans = num;
        while(true){
                int sum = 0;
                while(num > 0){
                    int rem = num % 10;
                    sum += rem;
                    num /= 10;
                }
                num = sum;
                if(String.valueOf(sum).length() < 2) return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(0));
    }
}
