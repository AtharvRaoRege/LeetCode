package LeetCodeEasy;
import java.util.*;
public class Leet2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listoflist = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Map<Integer,Integer> hm1 = new HashMap<>();
        Map<Integer,Integer> hm2 = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            hm1.put(nums1[i],hm1.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0; i < nums2.length; i++){
            hm2.put(nums2[i],hm2.getOrDefault(nums2[i],0)+1);
        }
        for(int i: nums1){
            if(!hm2.containsKey(i) && !l1.contains(i)){
                l1.add(i);
            }
        }
        for(int i: nums2){
            if(!hm1.containsKey(i) && l2.contains(i)){
                l2.add(i);
            }
        }
        listoflist.add(l1);
        listoflist.add(l2);
        return listoflist;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        List<List<Integer>> res = findDifference(nums1,nums2);
        for(List<Integer> i : res){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
