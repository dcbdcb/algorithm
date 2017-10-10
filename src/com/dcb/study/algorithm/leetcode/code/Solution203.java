package com.dcb.study.algorithm.leetcode.code;

class Solution203 {



    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head = newHead;
        while (head != null) {
            ListNode tmpNode = head.next;
            if (tmpNode != null && tmpNode.val == val) {
                head.next = tmpNode.next;
            } else {
                head = head.next;
            }
        }
        return newHead.next;
    }
}
