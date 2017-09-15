package com.dcb.study.algorithm.leetcode.code;

public class Solution86 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        n1.next = n2;



        Solution86 s = new Solution86();
        s.partition(n1, 0);
    }


    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode smaller = new ListNode(0);
        ListNode bigger = new ListNode(0);
        ListNode s = smaller;
        ListNode b = bigger;
        while (head != null) {
            if (head.val < x) {
                s.next = head;
                head = head.next;
                s = s.next;
                s.next = null;
            } else {
                b.next = head;
                head = head.next;
                b = b.next;
                b.next = null;
            }
        }
        s.next = bigger.next;
        return smaller.next;
    }
}
