package com.dcb.study.algorithm.leetcode.code;

import java.util.List;

public class Solution876 {

    public static void main(String[] args) {
        Solution876 s = new Solution876();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(s.middleNode(a));
    }

    /**
     * 返回链表中间节点
     *
     * @param head 链表
     * @return 链表中间节点
     */
    public ListNode middleNode(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
