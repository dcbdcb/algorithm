package com.dcb.study.algorithm.leetcode.code;

public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
