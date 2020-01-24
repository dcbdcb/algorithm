package solution;

import solution.list.ListNode;

public class Solution203 {

    public static void main(String[] args) {
        Solution203 s = new Solution203();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println(s.removeElements(a, 6));
    }

    /**
     * 链表中删除特定元素
     *
     * @param head 链表
     * @param val 指定值
     * @return 删除后的链表
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        // 构造虚拟头节点
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode temp = preHead;
        // 遍历列表，删除和val相等的节点
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return preHead.next;
    }

}
