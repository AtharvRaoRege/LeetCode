package LeetCodeEasy;

public class Leet2413 {
    public static int smallestEvenMultiple(int n) {
        for(int i = 1; i <= n*2; i++){
            if(i % 2 == 0 && i % n ==0) return i;
            continue;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(6));
    }
}
