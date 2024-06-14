package LeetCodeEasyString;
import java.util.*;
public class Leet2351 {
    public static char repeatedCharacter(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get(c) == 2) return c;
        }
        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
        Map<Character, Integer> hm = new HashMap<>();
        String s = "abccbaacz";
//        for (int i = 0; i < s.length(); i++) {
//            if(hm.get(s.charAt(i)) == 2) System.out.println();
//            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
//        }
//        hm.forEach((key,val)->{
//            System.out.println(key+" : "+val);
//        });
//
//        for (int i = 0; i < s.length(); i++) {
//            if (hm.get(s.charAt(i)) == 2) {
//                System.out.println(s.charAt(i));
//            }
//        }
    }
}
