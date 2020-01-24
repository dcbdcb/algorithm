package solution;

import solution.list.ListNode;

public class Solution83 {

    public static void main(String[] args) {
        Solution83 s = new Solution83();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(s.deleteDuplicates(a));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return preHead.next;
    }
}
