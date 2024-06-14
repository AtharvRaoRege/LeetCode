package QuestionsOfTheDay;
import java.util.*;
public class Leeet1002 {
    public static List<String> commonChars(String[] words) {
//        cun = common until now
        int []cun = new int[26];
        for(char c : words[0].toCharArray()){
            cun[c-'a']++;
        }
        for(int i = 1; i < words.length; i++){
            int []curWord = new int[26];
            for(char c : words[i].toCharArray()){
                curWord[c-'a']++;
            }
            for(int j = 0; j < 26; j++){
                cun[j] = Math.min(cun[j],curWord[j]);
            }
        }
        List<String> li = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            if(cun[i] != 0){
                for(int j = 0; j < cun[i]; j++){
                    li.add((String.valueOf((char) (i+'a'))));
                }
            }
        }
        return li;
    }

    public static void main(String[] args) {
        String []word = {"cool","lock","cook"};
        List<String> res = commonChars(word);
        for(String s : res){
            System.out.print(s+" ");
        }
    }
}
