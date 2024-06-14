package RandomQuestions;
import java.util.HashMap;
public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "accb";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char i : s.toCharArray()){
            if(hm.containsKey(i)) hm.put(i,hm.get(i)+1);
            else hm.put(i,1);
        }
        for(char i : s.toCharArray()){
            if(hm.get(i) == 3) System.out.println(i);
            break;
        }

    }
}
