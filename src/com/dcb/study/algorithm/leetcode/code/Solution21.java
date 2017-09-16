package com.dcb.study.algorithm.leetcode.code;

import java.util.Arrays;

public class Solution21 {

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6,7,8,9,10};

        print(Arrays.copyOfRange(a,0,5));
        print(Arrays.copyOfRange(a,5,10));
    }

    public static void print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
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
