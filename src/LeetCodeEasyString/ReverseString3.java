package LeetCodeEasyString;

public class ReverseString3 {
    public static String reverse(String s){
        int j = 0, e = s.length() - 1;
        char[] str = new char[s.length()];
        for(int i = 0; i < s.length()-1; i++) str[i] = s.charAt(i);
        while(j < e){
            char temp = str[j];
            str[j++] = str[e];
            str[e--] = temp;
        }
        return new String(str);
    }
    public static String  reverseWords(String s) {
        String[] st = s.split("");
        StringBuilder sb = new StringBuilder();
        for(String i : st) {
            sb.append(reverse(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
