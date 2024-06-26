package LinkedList;
import java.util.*;

import static LinkedList.ListNode.printLinkedList;

// Leetcode 2
public class Add2Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2  = l2;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while(h1 != null){
            arr1.add(h1.data);
            h1 = h1.next;
        }
        while(h2 != null){
            arr2.add(h2.data);
            h2 = h2.next;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sum1 = new StringBuilder();
        for(int i : arr1) sb1.append(i);
        for(int i : arr2) sb2.append(i);
        int sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        sum1.append(sum).reverse();
        System.out.println(sum1);
        int []arr = new int[sum1.toString().length()];
        ListNode dummy = new ListNode(0);
        h1 = dummy;
        int j = 0;
        for(char i : sum1.toString().toCharArray()){
            arr[j++] = Integer.parseInt(String.valueOf(i));
        }
        for(int i: arr){
            h1.next = new ListNode(i);
            h1 = h1.next;
        }
        return dummy.next;
//        System.out.println(Arrays.toString(arr));
//        printLinkedList(dummy.next);
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(2);
        h1.next = new ListNode(4);
        h1.next.next = new ListNode(3);

        ListNode h2 = new ListNode(5);
        h2.next = new ListNode(6);
        h2.next.next = new ListNode(4);

        addTwoNumbers(h1,h2);
//        printLinkedList(dummy.next);
    }
}
