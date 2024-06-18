package LeetCodeEasy;
import java.util.*;
// Given a string array words, return an array of all characters that show up in all strings within
// the words (including duplicates). You may return the answer in any order.

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]

public class Leet1002 {
    public static List<String> commonChars(String[] words) {
        // csf = common so far array
        int []csf = new int[26];
        for(char c : words[0].toCharArray()){
            csf[c - 'a']++;
        }
        for(int i = 1; i < words.length; i++){
            int []curWord = new int[26];
            for(char c : words[i].toCharArray()){
                curWord[c - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                csf[j] = Math.min(curWord[j],csf[j]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            if(csf[i] != 0){
                for(int j = 0; j < csf[i]; j++){
                    String x = String.valueOf((char) (i+'a'));
                    list.add(x);
                }
            }
        }
        return list;
    }
}
