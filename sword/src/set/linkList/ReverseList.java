package set.linkList;

/**
 * @author AoTxLand
 * @date 2020-07-18 10:12
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head.next;
        head.next = null;
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (node != null){
            ListNode temp = node;
            node = node.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return pre.next;
    }
}
