package LinkedList;
import static LinkedList.ListNode.*;
public class Add2Numbers_II {
    public static ListNode reverse(ListNode li){
        ListNode prev = null;
        ListNode curr = li;
        ListNode front = null;
        while(curr != null) {
            front  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int sum = carry;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum %= 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry == 1) temp.next = new ListNode(1);
        return reverse(dummy.next);
    }

    public static void main(String[] args) {
        int []arr = {7,2,4,3};
        int []arr2 = {5,6,4};
        ListNode l1 = ListNode.arrayToList(arr);
        ListNode l2 = ListNode.arrayToList(arr2);
        printList(addTwoNumbers(l1,l2));
    }
}
