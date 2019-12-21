package com.dcb.study.algorithm.leetcode.code;

public class Solution1290 {

    public static void main(String[] args) {
        Solution1290 s = new Solution1290();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(0);
        a.next = b;
        b.next = c;
        System.out.println(s.getDecimalValue(a));
    }


    public int getDecimalValue(ListNode head) {
        if (head == null) return 0;
        // 计算链表长度
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // 定义返回值
        int result = 0;
        while (head != null) {
            if (head.val != 0) {
                result += (int) Math.pow(2d, len - 1);
            }
            head = head.next;
            len--;
        }
        return result;
    }
}
