package QuestionsOfTheDay;

public class PassThePillow {
    public static int passThePillow(int n, int time) {
        // n = 4, time = 10
        // 1 -> 2 -> 3 -> 4
        int pos = 1;
        int t = 0;
        boolean d = false;
        while(t < time) {
            if(!d) pos++;
            else pos--;
            if(pos == 1 || pos == n) d = !d;
            t++;
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(passThePillow(4,5));
    }
}
