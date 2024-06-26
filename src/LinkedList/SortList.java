package LinkedList;
import java.util.*;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SortList{
    public static void printLinkedList(node head){
        node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }

    public static void sortList(node head) {
        List<Integer> list = new ArrayList<>();
        node ptr = head;
        while(ptr != null){
            list.add(ptr.data);
            ptr = ptr.next;
        }
        Collections.sort(list);
        node dummy = new node(1);
        ptr = dummy;
        for(int i: list){
            ptr.next = new node(i);
            ptr = ptr.next;
        }
        printLinkedList(dummy.next);
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(0);
        head.next.next = new node(30);
        System.out.println("Previous List");
        printLinkedList(head);
        System.out.println();
        System.out.println("After Sorting");
        sortList(head);
    }
}