package solution;

import solution.list.ListNode;

public class Solution92 {

    public static void main(String[] args) {
        Solution92 s = new Solution92();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;


        s.reverseBetween(n1, 1,2);
    }


    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null || head.next == null || m == n)
            return head;
        // 增加头节点
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode position = newHead.next;
        ListNode reverseStart = newHead;
        for (int i = 1; i <= n; i++) {
            if (i < m) {
                position = position.next;
                reverseStart = reverseStart.next;
            } else if (i < n){
                ListNode tmp = position.next;
                position.next = position.next.next;
                tmp.next = reverseStart.next.next;
                reverseStart.next = tmp;
            }

        }
        return newHead.next;
    }
}