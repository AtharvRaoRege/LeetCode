package Notes;
import java.util.*;
public class BucketSort451 {
    public static String frequencySort(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char i : s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        // a:4, v:3, i:1, l:1, o:1, e:1, s:1, t:1, h:1, r:1;
        List<Character>[] arr = new ArrayList[s.length()+1];
        for(var e : hm.entrySet()){
            char k = e.getKey();
            int v = e.getValue();

            if(arr[v] == null) {
                arr[v] = new ArrayList<>();
            }
            arr[v].add(k);
        }
        return "";
    }
}
