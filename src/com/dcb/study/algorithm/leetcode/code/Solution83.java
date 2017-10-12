package com.dcb.study.algorithm.leetcode.code;

public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        // 定义前节点和后节点
        ListNode aNode = newHead.next;
        ListNode bNode = head.next;
        // 循环判断前后节点是否一致
        while (bNode != null) {
            if (aNode.val == bNode.val) {
                aNode.next = bNode.next;
            } else {
                aNode = aNode.next;
            }
            bNode = bNode.next;
        }
        return newHead.next;

    }
}
