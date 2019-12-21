package com.dcb.study.algorithm.leetcode.code;

public class Solution61 {

    public static void main(String[] args) {
        Solution61 s = new Solution61();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(s.rotateRight(a, 2));
    }

    /**
     * 旋转链表
     *
     * @param head 链表
     * @param k 移动
     * @return 旋转后的位置
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        // 计算长度
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // 计算要移动几位
        k = k % len;
        ListNode l = head;
        ListNode r = head;
        for (int i = 0; i < k; i++) {
            r = r.next;
        }

        while (r.next != null) {
            l = l.next;
            r = r.next;
        }
        r.next = head;
        ListNode result = l.next;
        l.next = null;
        return result;
    }
}
