package RandomQuestions;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class mostFrequentELement {
    public static int mostFrequent(int []nums){
//        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        AtomicInteger num = new AtomicInteger();
        AtomicInteger num1 = new AtomicInteger();
        num.set(nums[0]);
        hm.forEach((key,val)->{
//            System.out.print(key+" : "+val+" ");
            if(val > num.get()) {
                num1.set(key);
                num.set(val);
            }
        });
        return num1.get();
    }

    public static void main(String[] args) {
        int[]nums = {1, 3, 2, 1, 4, 1, 2, 3};
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(para.toLowerCase());
        //        System.out.println(mostFrequent(nums));
    }
}