package linkedList;


/**
 * @author AoTxLand
 * @date 2020-05-17 17:07
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;
        ListNode ptr2 = dummy;
        for(int i = 0; i < n + 1; i++)
            ptr2 = ptr2.next;
        while (ptr2 != null){
            ptr2 = ptr2.next;
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return dummy.next;
    }
}
