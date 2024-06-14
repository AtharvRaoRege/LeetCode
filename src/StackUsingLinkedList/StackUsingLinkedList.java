package StackUsingLinkedList;

public class StackUsingLinkedList {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static  node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            node newNode = new node(10);
            if(!isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;

            head = newNode;
        }
        public static int pop(){
            if(isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(11);
        s.push(20);
        s.pop();
        s.push(10);
        s.push(11);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
