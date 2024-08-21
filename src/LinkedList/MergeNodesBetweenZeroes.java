package LinkedList;
import static LinkedList.ListNode.*;
public class MergeNodesBetweenZeroes {
    public static ListNode mergeNodes(ListNode head) {
        ListNode ptr = head.next;
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        while(ptr != null) {
            int sum = 0;
            while(ptr.val != 0){
                sum += ptr.val;
                ptr = ptr.next;
            }
            ptr = ptr.next;
            t.next = new ListNode(sum);
            t = t.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[]arr1 = {0,1,0,3,0,2,2,0};
        printList(mergeNodes(arrayToList(arr1)));
    }
}
