package LeetCodeMedium;

public class Leet151 {
    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s.trim());
        return String.valueOf(str.reverse());
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
