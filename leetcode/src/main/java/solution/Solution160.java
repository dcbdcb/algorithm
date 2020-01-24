package solution;

import solution.list.ListNode;

public class Solution160 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(10);

        n1.next = n3;n3.next = n5;n5.next = n6;n6.next = n7;n7.next=n8;n8.next=n9;n9.next=n10;
        n2.next = n4;n4.next = n6;

        Solution160 s = new Solution160();
        ListNode result = s.getIntersectionNode(n1, n2);
        System.out.println(result.val);
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

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
