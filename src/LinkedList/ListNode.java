package LinkedList;

public class ListNode{
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    ListNode(int val,ListNode next){
        this.data = val;
        this.next = next;
    }

    public static void printLinkedList(ListNode head1){
        ListNode head = head1;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
