package LeetCodeEasyString;


public class Leet2114 {
    public static int cnt(String s){
        int count = 0;
        String newstr = s.trim();
        for(int i = 0; i < newstr.length(); i++){
            if(newstr.charAt(i) == ' ') count++;
        }
        return count;
    }
    public static int max(int x, int y){
        return x > y ? x : y;
    }

    public static int mostWordsFound(String[] sentences) {
        int cnt = 0;
        for(String st : sentences){
            cnt = max(cnt(st),cnt);
        }
        return cnt+1;
    }

    public static void main(String[] args) {
        String[] nt = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(nt));
    }
}
