package set.linkList;

/**
 * @author AoTxLand
 * @date 2020-08-17 20:45
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA, h2 = headB;
        while (h1 != h2) {
            if (h1 == null) {
                h1 = headA;
            } else {
                h1 = h1.next;
            }
            if (h2 == null) {
                h2 = headB;
            } else {
                h2 = h2.next;
            }
        }
        return h1;
    }
}
