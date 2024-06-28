package LinkedList;
import static LinkedList.ListNode.printLinkedList;
public class PallindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode pall = new ListNode(0);
        ListNode pal = pall;
        ListNode temp = head;

//      copy linked list

        while(temp != null){
            pal.next = new ListNode(temp.data);
            temp = temp.next;
            pal = pal.next;
        }
        pal = pall.next;

//      reverse linked list

        ListNode curr = head;
        ListNode prev = null;
        ListNode front = null;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        curr = prev;

//      check Linked List

        while(curr != null){
            if(curr.data != pal.data) return false;
            curr = curr.next;
            pal = pal.next;
        }
        System.out.println("hell");
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(0);
        head.next.next = new ListNode(10);
        System.out.println(isPalindrome(head));
    }
}
