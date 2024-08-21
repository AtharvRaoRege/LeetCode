package GFG;
// Given a string s of lowercase English characters, determine whether the
// summation of x and y is EVEN or ODD.

// x is the count of distinct characters that occupy even positions in the English alphabet
// and have even frequency.

// y is the count of distinct characters that occupy odd positions in the English alphabet
// and have odd frequency.

// Input: s = "abbbcc"
// Output: ODD

//                                    a : 1, b : 3, c : 2

//                                    a b b b c c
// Input: s = "nobitaa"
// Output: EVEN

//                                    n o b i t a

import java.util.HashMap;
import java.util.Map;

public class OddEvenProblem {
    public static void oddEven(String s) {
        int x = 0, y = 0;
        Map<Character,Integer> hm = new HashMap<>();
        for(char i : s.toCharArray()){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(char i : s.toCharArray()){
            int ch = (int)i;
            if(ch % 2 == 0 && hm.get(i) % 2 == 0) x++;
            if(ch % 2 == 1 && hm.get(i) % 2 == 1) y++;
        }
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        oddEven("nobitaa");
    }
}
