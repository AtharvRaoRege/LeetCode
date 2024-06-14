package LeetCodeEasy;
import java.util.List;
import java.util.ArrayList;
// A self-dividing number is a number that is divisible by every digit it contains.
// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
// Input: left = 1, right = 22
// Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
public class Leet728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            if(isSelf(i)) list.add(i);
        }
        return list;
    }

    public static boolean isSelf(int i) {
        int num = i;
        while(i > 0){
            int rem = i % 10;
            if(rem == 0) return false;
            if(rem != 0 && num % rem != 0) return false;
            i /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
}
