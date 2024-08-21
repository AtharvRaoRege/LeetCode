package Stack;

import java.util.Stack;

public class ReverseStack extends StackOperations{
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStack(s);
        addToBottom(top,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);    // [40, 30, 20, 10]
        s.add(20);
        s.add(30);
        s.add(40);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
