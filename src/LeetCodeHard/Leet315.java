package LeetCodeHard;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Leet315 {
//    public static List<Integer> countSmaller(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < nums.length - 1; i++){
//            int cnt = 0;
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] > nums[j]) cnt++;
//            }
//            list.add(cnt);
//        }
//        list.add(list.size(),0);
//        return list;
//    }
    // TLE


    public static List<Integer> countSmaller(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(i, nums[i]);
        }
//        0 = 5 , 1 = 2 , 2 = 6 , 3 = 1
        return list;
    }
    public static void main(String[] args) {
        int[]nums = {5,2,6,1};
        List<Integer> res = countSmaller(nums);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}