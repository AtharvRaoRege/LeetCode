package LeetCodeEasy;
import java.util.ArrayList;
import java.util.List;
public class Leet989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < num.length; i++) s.append(num[i]);
        String s1 = String.valueOf(s);
        int num1 = Integer.parseInt(s1) + k;
        String newStr = String.valueOf(num1);
        for(int i = 0; i < newStr.length(); i++){
            int num2 = newStr.charAt(i) - '0';
            list.add(num2);
        }
        return list;
    }

    public static void main(String[] args) {
        int []arr = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> result = addToArrayForm(arr,1);

        // Print the elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
