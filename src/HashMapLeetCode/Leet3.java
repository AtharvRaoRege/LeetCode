package HashMapLeetCode;
import java.util.*;
public class Leet3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hm = new HashMap();
        int cnt = 0;
        for(char i: s.toCharArray()){
            if(hm.containsKey(i)) return cnt;
            else{
                hm.put(i,hm.getOrDefault(i,0)+1);
                cnt++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
