package RandomQuestions;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
// given an array of integers print the frequency of every number.

public class countFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,4,5,5,5,6,6,6,7,8,8,9,9,7,6,5,4,5,6,4,2,3,8};

        // { 1 : 2, 2 : 2, 3 : 2, 4 : 5, 5 : 5, 6 : 5, 7 : 2, 8 : 3, 9 : 2 }

        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> lis0 = new ArrayList<>();
        for(int i : nums){
            if(hm.containsKey(i)) hm.put(i,hm.get(i)+1);
            else hm.put(i,1);
        }
        AtomicInteger atom = new AtomicInteger();
        atom.set(1);
        atom.get();
        atom.set(Integer.MIN_VALUE);
        AtomicInteger atom1 = new AtomicInteger();
        hm.forEach((key,val)->{
            if(val >= atom.get()){
                atom.set(val);
                atom1.set(key);
            }
        });
        System.out.println(atom1.get());
    }
}
