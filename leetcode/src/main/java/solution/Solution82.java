package solution;

public class Solution82 {

    public static void main(String[] args) {
        Solution82 s = new Solution82();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(a);
        System.out.println(s.deleteDuplicates(a));
    }

    /**
     * 删除链表中重复节点
     *
     * @param head 链表头节点
     * @return 删除后的链表
     */
    public ListNode deleteDuplicates(ListNode head) {
        // 非空判断
        if (head == null) {
            return null;
        }

        // 构造临时头结点
        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode temp = preHead;
        // 比较下个节点和下下个节点的值
        while(temp.next != null && temp.next.next != null) {
            int val = temp.next.val;
            // 如果不相等，则将下个节点放入返回链表中
            if (temp.next.val != temp.next.next.val) {
                temp = temp.next;
            // 如果相等
            } else {
                // 找出之后第一个不同的值，将相等的节点全部舍弃
                ListNode diffNode = temp.next;
                while (diffNode != null && diffNode.val == val) {
                    diffNode = diffNode.next;
                }
                temp.next = diffNode;
            }
        }
        return preHead.next;
    }


}
