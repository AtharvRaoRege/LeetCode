package LinkedList;

public class ListNode{
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    ListNode(){}
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
    public static int sizeOfLinkedList(ListNode head) {
        int size = 0;
        while(head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
    }
}
