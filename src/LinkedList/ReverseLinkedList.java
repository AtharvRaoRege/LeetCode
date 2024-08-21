package LinkedList;
import static LinkedList.ListNode.*;
import static LinkedList.ReverseBetween.*;
public class ReverseLinkedList {
        public static ListNode reverseLinkedList(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode front = null;
            while(curr != null) {
                front = curr.next;
                curr.next = prev;
                prev = curr;
                curr = front;
            }
            return prev;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(0);
        head.next.next = new ListNode(20);
        printList(reverseBetween(head,1,3));
    }
}
