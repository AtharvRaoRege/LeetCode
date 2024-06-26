package LeetCodeMedium;
import java.util.*;
import java.util.HashMap;

// Bucket Sort

// stores many thing in the form of a list of bucket

public class Leet451BucketSort {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> hm = new HashMap<>();
        List<Character> []arr = new ArrayList[s.length() + 1];
        for(char i: s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0) + 1);
        }
        for(var e: hm.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(arr[v] == null) {
                arr[v] = new ArrayList<>();
            }
            arr[v].add((char)k);
        }
        for(int i = arr.length - 1; i > -1; i--){
            if(arr[i] != null){
                for(char ch : arr[i]){
                    for(int j = 0; j < i; j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("cccaaa"));
    }
}
