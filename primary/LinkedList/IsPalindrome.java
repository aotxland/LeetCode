package LinkedList;

/**
 * @author AoTxLand
 * @date 2020-05-18 10:43
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i < n / 2; i++){
            temp = temp.next;
        }

        ListNode head2 = reverseList(temp);
        for(int i = 0; i < n / 2; i++){
            if(head.val == head2.val){
                head = head.next;
                head2 = head2.next;
            }
            else return false;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = head.next;
        dummy.next.next = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = temp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(0);
        head.next = h1;
        h1.next = h2;
        System.out.println(ip.isPalindrome(head));
    }
}
