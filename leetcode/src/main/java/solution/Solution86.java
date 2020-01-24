package solution;

import solution.list.ListNode;

public class Solution86 {

    public static void main(String[] args) {
        Solution86 s = new Solution86();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(s.partition(a, 3));
    }

    /**
     * 分隔链表
     *
     * @param head 链表头节点
     * @param x 分隔值
     * @return 头节点
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode littleNode = new ListNode(0);
        ListNode largeNode = new ListNode(0);
        ListNode preHead = littleNode;
        ListNode lnode = largeNode;
        while (head != null) {
            if (head.val < x) {
                littleNode.next = head;
                littleNode = littleNode.next;
                head = head.next;
            } else {
                largeNode.next = head;
                largeNode = largeNode.next;
                head = head.next;
                largeNode.next = null;
            }
        }
        littleNode.next = lnode.next;
        return preHead.next;
    }
}
