package HashMapLeetCode;
import java.util.*;
// pangram -> a sentence which consists every alphabet atleast once
public class Leet1832 {
    public static boolean checkIfPangram(String sentence) {
//        Map<Character,Integer> hm = new HashMap<>();
        Set<Character> hs = new HashSet<>();
        for(char i: sentence.toCharArray()){
            hs.add(i);
        }
        if(hs.size() == 26) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
}
