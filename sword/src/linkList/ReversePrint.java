package linkList;

import java.util.Stack;

/**
 * @author AoTxLand
 * @date 2020-07-10 16:38
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        while (head != null){
            stack.push(head.val);
            head = head.next;
            num++;
        }
        int[] out = new int[num];
        int i = 0;
        while (!stack.isEmpty()){
            out[i] = stack.pop();
            i++;
        }
        return out;
    }
}
