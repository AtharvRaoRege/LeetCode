package LeetCodeEasy;

public class Leet2544 {
    public static int alternateDigitSum(int n) {
        int sum = 0;
        boolean sign = false;
        while(n > 0){
            int rem = n%10;
            if(!sign) {
                sum += rem;
                sign = !sign;
            }else {
                sum -= rem;
                sign = !sign;
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(886996));
    }
}
