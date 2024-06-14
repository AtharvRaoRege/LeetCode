package LeetCodeEasyString;
import java.util.*;
// Isomorphic String

public class Leet205 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char keys = s.charAt(i);
            char replace = t.charAt(i);
            if (!hm.containsKey(keys)) {
                if(!hm.containsValue(replace)){
                    hm.put(keys,replace);
                }else{
                    return false;
                }
            }else{
                if(hm.get(keys) != replace) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba")  );
    }
}
