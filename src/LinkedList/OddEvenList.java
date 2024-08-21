package LinkedList;
import static LinkedList.ListNode.*;
public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode p1 = odd;
        ListNode p2 = even;
        ListNode h = head;
        int i = 1;
        while(h != null) {
            if(i % 2 == 0) {
                p2.next = new ListNode(h.val);
                p2 = p2.next;
            } else {
                p1.next = new ListNode(h.val);
                p1 = p1.next;
            }
            i++;
            h = h.next;
        }
        p2.next = null;
        p1.next = even.next;
        return odd.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        printList(oddEvenList(head));
    }
}
