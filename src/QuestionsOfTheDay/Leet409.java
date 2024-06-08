package QuestionsOfTheDay;
import java.util.*;
// Input: s = "abccccdd"
// Output: 7
public class Leet409 {
    public static int longestPalindrome(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int sum = 0;
        boolean x = false;
        for(var e : hm.entrySet()){
            if(e.getValue() % 2 == 0) sum += e.getValue();
            else if(e.getValue() != 1){
                sum += e.getValue() - 1;
                x = true;
            }
            else x = true;
        }
        return x ? sum + 1 : sum;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
