package HashMapLeetCode;
import java.util.*;
public class Leet771 {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char i : stones.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int cnt = 0;
        for(char i : jewels.toCharArray()){
            if(hm.containsKey(i)) {
                cnt += hm.get(i);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
