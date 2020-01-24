package solution;

import solution.list.ListNode;

public class Solution328 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        Solution328 s = new Solution328();
        head = s.oddEvenList(head);

        System.out.println(head);
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);

        oddHead.next = head;
        evenHead.next = head.next;
        ListNode tmpOdd = oddHead;
        ListNode tmpEven = evenHead;
        int index = 1;
        while (head != null) {
            if (index % 2 == 1) {
                tmpOdd.next = head;
                tmpOdd = tmpOdd.next;
            } else {
                tmpEven.next = head;
                tmpEven = tmpEven.next;
            }
            head = head.next;
            index++;
        }
        // 释放偶数列最后一位，避免死循环
        tmpEven.next = null;
        tmpOdd.next = evenHead.next;
        return oddHead.next;

    }
}
