package solution;

/**
 * 链表节点类
 */
public class ListNode {

    /**
     * 节点值
     */
    int val;

    /**
     * 下一个节点
     */
    ListNode next;

    /**
     * 构造方法
     * @param x 节点值
     */
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        if (this.next == null) {
            return String.valueOf(this.val);
        }
        System.out.print(this.val + "->");
        return this.next.toString();
    }
}