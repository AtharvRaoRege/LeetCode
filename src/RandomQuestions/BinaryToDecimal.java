package RandomQuestions;
import java.util.*;
public class BinaryToDecimal {
    public static int binaryToDecimal(String s){
        int x = 0;
        int deci = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) == 0) {
                x++;
                continue;
            }else{
                deci += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(2,x++);
            }
        }
        return deci;
    }
    public static String DecimalToBinary(int x){
        StringBuilder sb = new StringBuilder();
        List<String> li = new ArrayList<>();
        while(x>0){
            int rem = x % 2;
            li.add(String.valueOf(rem));
            x /= 2;
        }
        for(int i = li.size()-1; i >= 0; i--){
            sb.append(li.get(i));
        }
        return sb.toString();
    }


//    String binaryNextNumber(String s) {
//        int dec = binaryToDecimal(s);
//
//    }

    public static void main(String[] args) {
//        System.out.println(binaryToDecimal("0"));
//        System.out.println(DecimalToBinary(0));
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(paragraph.substring(5,9));
    }
}
