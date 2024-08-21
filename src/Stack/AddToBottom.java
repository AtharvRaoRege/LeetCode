package Stack;
import java.util.*;

public class AddToBottom {
    public static void addToBottom(int data, Stack<Integer> s){
        if(s.isEmpty()) {
            s.add(data);
            return;
        }
        int top = s.pop();
        addToBottom(data,s);
        s.add(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);    // [40, 30, 20, 10]
        s.add(20);
        s.add(30);
        s.add(40);
        addToBottom(50,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
