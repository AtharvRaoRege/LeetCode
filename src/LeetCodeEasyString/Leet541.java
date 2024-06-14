package LeetCodeEasyString;
// Given a string s and an integer k, reverse the first k characters for every 2k characters counting
// from the start of the string.
//
// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal
// to k characters, then reverse the first k characters and leave the other as original.
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"

public class Leet541 {
    public static void swap(Character s1, Character s2){
        char temp = s1;
        s1 =  s2;
        s2 = temp;
    }

    public static String reverseStr(String s, int k) {
        for(int i = 0; i < s.length(); i += k){
            for(int j = i; j < s.length() - i - 1; j++){
                swap(s.charAt(i),s.charAt(j));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("bacdfeg",2));
    }
}
