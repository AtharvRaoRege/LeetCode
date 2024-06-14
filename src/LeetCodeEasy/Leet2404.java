package LeetCodeEasy;
import java.util.HashMap;
import java.util.Map;
// Given an integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.
public class Leet2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int num: nums){
            if(num % 2 == 0){
                if(hm.containsKey(num)) {
                    hm.put(num,hm.get(num)+1);
                }else hm.put(num,1);
            }
        }
        int maxFreq = 0;
        int mostFreqElem = 0;
        for(int num: hm.keySet()){
            int freq = hm.get(num);
            if(freq > maxFreq){
                maxFreq = freq;
                mostFreqElem = num;
            }
        }
        return mostFreqElem;
    }
}
