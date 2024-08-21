package LinkedList;
import static LinkedList.ListNode.*;
public class DeleteMidNodeOfList {
    public static ListNode deleteLast(ListNode head1) {
        ListNode head = head1;
        while(head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return head;
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode ptr = head;
        while( ptr.next !=  slow) {
            ptr = ptr.next;
        }
        ptr.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
//        head.next.next.next = new ListNode(7);
//        head.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next = new ListNode(6);
        printList(deleteMiddle(head));
    }
}
