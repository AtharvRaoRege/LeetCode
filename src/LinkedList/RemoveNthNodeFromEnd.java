package LinkedList;
import static LinkedList.ListNode.*;
public class RemoveNthNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        1->2->3->4->5->6
        if(sizeOfLinkedList(head) < 2) return null;
        if(sizeOfLinkedList(head) == n) return head.next;
        ListNode ptr = head;
        int size = sizeOfLinkedList(head);
        int pos = size - n; // pos - 6 - 2 = 4
        for(int i = 0; i < pos - 1; i++){
            ptr = ptr.next;
        }
        System.out.println(ptr.val);
        ptr.next = ptr.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        printList(removeNthFromEnd(head,2));
    }
}
