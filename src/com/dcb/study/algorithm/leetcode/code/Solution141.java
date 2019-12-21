package com.dcb.study.algorithm.leetcode.code;


public class Solution141 {


    public static void main(String[] args) {
        Solution141 s = new Solution141();
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        System.out.println(s.hasCycle(a));
    }

    /**
     * 判断链表是否有环
     *
     * @param head 链表头节点
     * @return true 有环 false 无环
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        // 添加虚拟头节点
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        // 构造快慢节点
        ListNode fastNode = preHead;
        ListNode slowNode = preHead;
        // 快节点后续节点不为空，慢节点向后移动一个位置，快节点向后移动2个位置
        while(fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            // 如果快慢节点相同，说明有环
            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }

}
