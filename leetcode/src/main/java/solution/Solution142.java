package solution;

import solution.list.ListNode;

public class Solution142 {

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next = n;

        Solution142 s = new Solution142();
        s.detectCycle(n);
    }

    public ListNode detectCycle(ListNode head) {
        if (head != null && head.next == head) return head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode tmp = slow.next;
                slow.next = null;
                ListNode result = getIntersectionNode(tmp, head);
                slow.next = tmp;
                return result;
            }

        }

        return null;


    }

    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = length(headA);
        int lenB = length(headB);

        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == headB)
            return headA;
        return null;
    }

    private int length(ListNode head) {
        if (head == null)
            return 0;
        return 1 + length(head.next);
    }



}
