package LeetCodeEasyString;
// You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string)
// that is a non-empty substring of num, or an empty string "" if no odd integer exists.
//A substring is a contiguous sequence of characters within a string.

//Example 1:
//
//Input: num = "52"
//Output: "5"
public class Leet1903 {
    public static String largestOddNumber(String num) {
        int max = num.charAt(0) - '0';
        for(int i = 0; i < num.length(); i++){
            int x = num.charAt(i) - '0';
            if (x > max) max = x;
//            System.out.println(max + x);
        }
        return String.valueOf(max);
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }
}
