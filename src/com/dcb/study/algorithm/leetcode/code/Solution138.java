package com.dcb.study.algorithm.leetcode.code;

public class Solution138 {

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) return null;
        RandomListNode headNew = new RandomListNode(0);
        headNew.next = head;
        while(head != null) {
            RandomListNode node = new RandomListNode(head.label);
            node.random = head.random;
            node.next = head.next;
            head.next = node;
            head = node.next;
        }

        head = headNew.next.next;
        while(head != null) {
            if (head.random != null)
                head.random = head.random.next;
            if (head.next == null)
                break;
            else
                head = head.next.next;
        }

        head = headNew;
        RandomListNode originalTmp = headNew.next;

        while(head.next != null) {
            head.next = head.next.next;
            originalTmp.next = originalTmp.next.next;
            head = head.next;
            originalTmp = originalTmp.next;
        }
        return headNew.next;
    }
}
