package LinkedList;

public class Merge2SortedLists {
    public static void printLinkedList(ListNode head){
        ListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode list = list3;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                list.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                list.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            list = list.next;
        }

        while(l1 != null){
            list.next = new ListNode(l1.val);
            l1 = l1.next;
            list = list.next;
        }
        while(l2 != null){
            list.next = new ListNode(l2.val);
            l2 = l2.next;
            list = list.next;
        }
        return list3.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        ListNode head1 = new ListNode(11);
        head1.next = new ListNode(22);
        head1.next.next = new ListNode(23);
        head1.next.next = new ListNode(24);
        head1.next.next.next = new ListNode(25);

        ListNode ptr1 = mergeTwoLists(head,head1);
        printLinkedList(ptr1);
    }
}