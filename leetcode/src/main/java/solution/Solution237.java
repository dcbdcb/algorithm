package solution;

public class Solution237 {

    public static void main(String[] args) {
        Solution237 s = new Solution237();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a);
        s.deleteNode(c);
        System.out.println(a);
    }

    /**
     * 删除节点
     *
     * @param node 需要删除的节点
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
