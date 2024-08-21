package LinkedList;
import static LinkedList.ListNode.*;
public class DoubleListNumber {
    public static ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        StringBuilder num = new StringBuilder();
        while(temp != null) {
            num.append(temp.val);
            temp = temp.next;
        }
        StringBuilder temp1 = new StringBuilder();

        temp1.append(2 * Integer.parseInt(num.toString()));
        String res = temp1.toString();
        ListNode dummy = new ListNode(0);
        temp = dummy;
        int i = 0;
        while(i < res.length()){
            temp.next = new ListNode(res.charAt(i) - '0');
            i++;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        printList(doubleIt(head));
    }
}
