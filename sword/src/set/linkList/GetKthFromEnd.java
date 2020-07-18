package set.linkList;

/**
 * @author AoTxLand
 * @date 2020-07-18 10:06
 */
public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode kNode = head;
        for (int i = 1; i < k; i++){
            if (kNode != null){
                kNode = kNode.next;
            }
            else {
                return null;
            }
        }
        while (kNode.next != null) {
            head = head.next;
            kNode = kNode.next;
        }
        return head;
    }
}
