package solution;

public class Solution206 {

    public static void main(String[] args) {
        Solution206 s = new Solution206();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(s.reverseList(s.reverseList2(s.reverseList3(a))));

    }

    /**
     * 反转链表
     *
     * @param head 链表头节点
     * @return 反转后的链表头节点
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 构造虚拟头节点
        ListNode preHead = new ListNode(0);

        ListNode tempHead = head;
        while(tempHead != null) {
            ListNode temp = tempHead;
            tempHead = temp.next;
            temp.next = preHead.next;
            preHead.next = temp;
        }
        return preHead.next;
    }

    /**
     * 反转链表
     * @param head 链表头节点
     * @return 反转后的链表
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversNode = reverseList2(head.next);
        head.next = null;
        ListNode temp = reversNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return reversNode;
    }

    /**
     * 反转链表
     * @param head 链表头节点
     * @return 反转后的链表
     */
    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseNode;
    }
}
