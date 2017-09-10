package com.dcb.study.algorithm.leetcode.code;

public class Solution206 {


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        ListNode a7 = new ListNode(7);
        a.next = a2;a2.next=a3;a3.next=a4;a4.next=a5;a5.next = a6;a6.next=a7;


        Solution206 s = new Solution206();
        ListNode a8 = s.reverseList(a);

    }


    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode newHead = new ListNode(0);

        while(head != null) {
            ListNode temp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = temp;

        }
        return newHead.next;
    }



}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}