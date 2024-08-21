package LeetCodeEasyString;

public class ReverseVowelsInString {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public static String swap(String input, int index1, int index2) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] charArray = input.toCharArray();
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        return new String(charArray);
    }
    public static String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end){
            char f = s.charAt(start);
            char l = s.charAt(end);
            while (start < end && !isVowel(f)) {
                start++;
                f = s.charAt(start);
            }
            while (start < end && !isVowel(l)) {
                end--;
                l = s.charAt(end);
            }
            s = swap(s,start++,end--);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
