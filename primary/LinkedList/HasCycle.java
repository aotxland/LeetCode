package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-05-18 11:04
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> map = new HashMap<>();
        while(head != null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,true);
            head = head.next;
        }
        return false;
    }
}
