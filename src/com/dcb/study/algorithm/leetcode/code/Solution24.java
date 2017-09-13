package com.dcb.study.algorithm.leetcode.code;

public class Solution24 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        Solution24 s = new Solution24();
        s.swapPairs(n1);
    }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode headNew = new ListNode(0);
        headNew.next = head;
        ListNode before = headNew;

        while (head != null && head.next != null) {
            ListNode tmp = head.next;
            head.next = head.next.next;
            tmp.next = head;
            before.next = tmp;
            before = head;
            head = head.next;

        }

        return headNew.next;
    }

}
