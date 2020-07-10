package linkedList;

/**
 * @author AoTxLand
 * @date 2020-05-17 17:00
 */

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.next = node.next.next;
    }
}
