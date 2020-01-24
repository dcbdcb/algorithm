package solution;

import solution.list.ListNode;

public class Solution25 {


    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        Solution25 s = new Solution25();
        s.reverseKGroup(n, 1);
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return head;

        // 创建虚拟头节点
        ListNode headNew = new ListNode(0);
        headNew.next = head;

        // 判断链表长度是否大于k
        for (int i = 0; i < k - 1; i++,head = head.next) {
            if (head.next == null) {
                return headNew.next;
            }
        }
        head = headNew.next;

        // 转置前k位
        for (int i = 0; i < k - 1; i++) {
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = headNew.next;
            headNew.next = tmp;
        }
        head.next = reverseKGroup(head.next, k);
        return headNew.next;
    }


}
