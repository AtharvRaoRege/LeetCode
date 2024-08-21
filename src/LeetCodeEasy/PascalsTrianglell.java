package LeetCodeEasy;
import java.util.*;
public class PascalsTrianglell {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> li = new ArrayList<>();
        res.add(1);
        li.add(res);
        if(rowIndex == 0) return res;
        if(rowIndex == 1){
            res.add(1);
            return res;
        }
        for(int i = 1; i < rowIndex; i++){
            List<Integer> prev = li.get(i-1);
        }
        return res;
    }
}
