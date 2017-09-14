package com.dcb.study.algorithm.leetcode.code;


public class Solution141 {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;

        Solution141 s = new Solution141();

        System.out.println(s.hasCycle(n1));
    }

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;
        if (head.next == head) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

}
