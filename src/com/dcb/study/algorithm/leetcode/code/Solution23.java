package com.dcb.study.algorithm.leetcode.code;

import java.util.Arrays;

public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return mergeTwoLists(lists[0], lists[1]);

        int tmp = lists.length / 2;
        ListNode l1 = mergeKLists(Arrays.copyOfRange(lists, 0, tmp));
        ListNode l2 = mergeKLists(Arrays.copyOfRange(lists, tmp, lists.length));
        return mergeTwoLists(l1, l2);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = new ListNode(1);
        ListNode tmp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                tmp = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                tmp = l2;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            tmp.next = l2;
        } else {
            tmp.next = l1;
        }

        return head.next;
    }


}
