package Daily;

/**
 * @author AoTxLand
 * @date 2020-05-16 22:32
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode(0);
        root.next = head;
        return root.next;
    }
    public ListNode reverseK(ListNode head, int k) {
        ListNode root = new ListNode(0);
        root.next = head;

        return root.next;
    }
}
