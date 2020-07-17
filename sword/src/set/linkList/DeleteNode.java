package set.linkList;

/**
 * @author AoTxLand
 * @date 2020-07-17 21:54
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        if (node.val == val){
            return head.next;
        }
        while (node != null){
            if(node.next != null){
                if(node.next.val == val){
                    node.next = node.next.next;
                    break;
                }
            }
            node = node.next;
        }
        return head;
    }
}
