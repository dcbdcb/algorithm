package com.dcb.study.algorithm.leetcode.code;

public class Solution19 {

    public static void main(String[] args) {
        Solution19 s = new Solution19();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(s.removeNthFromEnd(a, 2));
        System.out.println(s.removeNthFromEnd2(a, 2));


    }

    /**
     * 删除链表倒数第n个节点
     *
     * @param head 链表头节点
     * @param n n
     * @return 删除后的链表
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        // 获取链表长度
        int len = 1;
        ListNode ln = head;
        while (ln.next != null) {
            len++;
            ln = ln.next;
        }
        // 构造虚拟头节点，规避删除头节点的情况
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        // 删除节点的下标
        int index = len - n;
        ln = preHead;
        for (int i = 0; i < index; i++) {
            ln = ln.next;
        }
        ln.next = ln.next.next;
        return preHead.next;
    }

    /**
     * 删除链表倒数第n个节点
     *
     * @param head 链表头节点
     * @param n n
     * @return 删除后的链表
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) return head;

        // 构造虚拟头节点，规避删除头节点的情况
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        // 构造左右节点，将右节点向后移动n位
        ListNode lNode = prehead;
        ListNode rNode = prehead;
        for (int i = 0; i < n; i++) {
            rNode = rNode.next;
        }

        // 左后节点依次向后移动，当右节点移动到链表末尾，
        // 则左节点的下一节点为需要删除节点
        while (rNode.next != null) {
            rNode = rNode.next;
            lNode = lNode.next;
        }

        lNode.next = lNode.next.next;
        return prehead.next;
    }
}
