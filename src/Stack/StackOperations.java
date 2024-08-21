package Stack;

import java.util.Stack;


public class StackOperations {
    public static void addToBottom(int data, Stack<Integer> s){
        if(s.isEmpty()) {
            s.add(data);
            return;
        }
        int top = s.pop();
        addToBottom(data,s);
        s.add(top);
    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStack(s);
        addToBottom(top,s);
    }
}
