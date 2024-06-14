package LeetCodeEasyString;
import java.util.*;
public class Leet290 {
    public static void wordPattern(String pattern, String s) {
        List<String> pat = new ArrayList<>();
        List<String> s1 = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        pattern.trim();
        for (int i = 0; i < pattern.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int j = i;
            while (pattern.charAt(j) != ' ') {
                sb.append(pattern.charAt(j++));
            }
            pat.add(String.valueOf(sb));
            i = j+1;
        }
        System.out.println(pat);
//        return true;
    }

    public static void main(String[] args) {
        wordPattern("abba","dog cat cat dog");
    }
}
