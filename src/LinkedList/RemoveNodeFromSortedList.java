package LinkedList;

public class RemoveNodeFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {

//        1 -> 1 -> 2 -> 3 -> 3

        ListNode temp = head;
        ListNode ptr = head;
        int prev = -101;
        while(ptr != null){
            if(ptr.val == prev){

            }else {
                prev = ptr.val;
                ptr = ptr.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
    }
}
