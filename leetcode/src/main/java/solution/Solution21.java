package solution;

public class Solution21 {

    public static void main(String[] args) {
        Solution21 s = new Solution21();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        a.next = b;
        b.next = c;

        ListNode x = new ListNode(1);
        ListNode y = new ListNode(3);
        ListNode z = new ListNode(4);
        x.next = y;
        y.next = z;
        System.out.println(s.mergeTwoLists(a, x));

    }

    /**
     * 合并两个有序链表
     *
     * @param l1 链表1头节点
     * @param l2 链表2头节点
     * @return 合并后的链表头节点
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(1);
        ListNode tmp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                tmp = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                tmp = l2;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            tmp.next = l2;
        } else {
            tmp.next = l1;
        }

        return head.next;
    }
}
