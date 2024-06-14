package LeetCodeEasyString;
import java.util.*;
// Roman To Integer
public class Leet13 {
    public static void romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            char curr = s.charAt(i);
            char front = s.charAt(i + 1);
            if(hm.get(curr) < hm.get(front)) sum -= hm.get(curr);
            else sum += hm.get(curr);
        }
        sum += hm.get(s.charAt(s.length()-1));
        System.out.println(sum);
//        return sum;
    }

    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
}
