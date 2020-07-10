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
        if (k==1||head==null)
            return head;
        return iterateHelper(head,k-1);
    }

    public ListNode iterateHelper(ListNode head,int k){
        ListNode start=head,res=null;
        ListNode pre=null;
        while (true){
            int index;
            ListNode end=start;
            for (index=0;index<k;++index){
                if (end==null)
                    break;
                end=end.next;
            }
            if (index!=k||end==null)
                break;
            ListNode node=end==null?null:end.next;
            end.next=null;
            reverse(start);
            if (pre!=null){
                pre.next=end;
            }else {
                res=end;
            }
            pre=start;
            start=node;
        }
        if (pre!=null)
            pre.next=start;
        return res;
    }

    /**
     * 翻转链表
     * @param head
     */
    public ListNode reverse(ListNode head){
        ListNode pre=head,next=pre.next;
        while (next!=null){
            ListNode tmp=next.next;
            next.next=pre;
            pre=next;
            next=tmp;
        }
        return head;
    }
}
