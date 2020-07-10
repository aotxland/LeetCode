package linkedList;

/**
 * @author AoTxLand
 * @date 2020-05-17 21:38
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = head.next;
        dummy.next.next = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = temp;
        }
        return dummy.next;
    }
}
