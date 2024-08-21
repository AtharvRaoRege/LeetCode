package LinkedList;
import java.util.*;

import static LinkedList.ListNode.arrayToList;
import static LinkedList.ListNode.printList;

// Leetcode 2
public class Add2Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int carry = 0;
        ListNode list1 = l1;
        ListNode list2 = l2;
        while(list1 != null || list2 != null){
            int sum = carry;
            if(list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }
            if(list2 != null){
                sum += list2.val;
                list2 = list2.next;
            }
            carry = sum/10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry == 1) temp.next = new ListNode(1);
        return res.next;
    }

    public static void main(String[] args) {
        int []arr1 = {2,4,3};
        int []arr2 = {5,6,4};
        printList(addTwoNumbers(arrayToList(arr1),arrayToList(arr2)));
    }
}
