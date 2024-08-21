package LinkedList;

import java.util.ArrayList;

public class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int data) {
        this.val = data;
        this.next = null;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    public static int sizeOfLinkedList(ListNode head) {
        int size = 0;
        while(head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
    public static ListNode arrayToList(int []nums) {
        ListNode li = new ListNode(0);
        ListNode temp = li;
        for(int i: nums){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return li.next;
    }

    public static void main(String[] args) {
        ListNode li = new ListNode(0);
        li.next = new ListNode(1);
        li.next.next = new ListNode(2);
        li.next.next.next = new ListNode(3);
        int []nums = {1,2,3,4,5};
    }
}