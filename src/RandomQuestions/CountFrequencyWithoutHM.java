package RandomQuestions;

import java.util.Arrays;

// return the freq of all the character without using hashmap
public class CountFrequencyWithoutHM {
    public static int[] cntFreq(String s){
        // s = abcbaba;
       int []freq = new int[26];
       for(char c: s.toCharArray()){
           freq[c-'a']++;
       }
       return freq;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cntFreq("abcbaba")));
    }
}
