package LinkedList;
import static LinkedList.ListNode.printLinkedList;
public class PallindromeLinkedList {
    public static void isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        while(temp != null){
            ptr.next = new ListNode(temp.data);
            temp = temp.next;
            ptr = ptr.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode front = null;
        while(curr != null){
            front = ptr.next;
            curr.next = prev;
            prev = ptr;
            curr = front;
        }
        prev = dummy.next;
        temp = head;
        while(ptr != null && temp != null){
            if(!(ptr.data == temp.data)) System.out.println(false);
            ptr = ptr.next;
            temp = temp.next;
        }
        temp = head;
        printLinkedList(prev);
//        printLinkedList(temp);
//        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(0);
        head.next.next = new ListNode(30);
        isPalindrome(head);
    }
}
