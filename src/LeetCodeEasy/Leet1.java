package LeetCodeEasy;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Leet1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                return new int[]{i,hm.get(nums[i])};
            }else{
                hm.put(target - nums[i],i);
            }
        }
        return new int []{-1,-1};
    }

    public static List<List<Integer>> re(int []nums){
//        int []nums = {2,4,6,8,10};
//        {(2,4),(2,6),(2,8),(2,10), (4,6) }
        List<List<Integer>> listoflist = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                listoflist.add(list);
            }
        }

        return listoflist;
    }

    public static void main(String[] args) {
        int []nums = {2,4,6,8,10};
        List<List<Integer>> res = re(nums);
            for(List<Integer> li: res){
                System.out.print("(");
                int cnt = 0;
                for(int i: li){
                    if(cnt == 1) System.out.println(i);
                    else System.out.print(i+",");
                    cnt = 1;
                }
                System.out.print(")");
                System.out.println(" ");
            }
    }

}
