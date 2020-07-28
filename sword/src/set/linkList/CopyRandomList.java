package set.linkList;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author AoTxLand
 * @date 2020-07-28 10:45
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        if (head == null) return null;
        Node newHead = new Node(head.val);
        Node per = newHead;
        Node old = head;
        map.put(head,newHead);
        while (old.next != null){
            old = old.next;
            per.next = new Node(old.val);
            map.put(old,per.next);
            per = per.next;
        }
        per = newHead;
        old = head;
        while (old != null){
            if (old.random != null){
                per.random = map.get(old.random);
            }
            per = per.next;
            old = old.next;
        }
        return newHead;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
