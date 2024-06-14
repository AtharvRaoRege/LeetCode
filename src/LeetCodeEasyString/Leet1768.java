package LeetCodeEasyString;
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
public class Leet1768 {
    public static String mergeAlternately(String word1, String word2){
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < word1.length() && i < word2.length()){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i++));
        }
        if(word1.length() > i ){
            while(i < word1.length()){
                str.append(word1.charAt(i++));
            }
        }else{
            while(i < word2.length()){
                str.append(word2.charAt(i++));;
            }
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}
