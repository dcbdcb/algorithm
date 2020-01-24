package solution.list;

/**
 * 链表节点类
 */
public class ListNode {

    /**
     * 节点值
     */
    public int val;

    /**
     * 下一个节点
     */
    public ListNode next;

    /**
     * 构造方法
     * @param x 节点值
     */
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        if (this.next == null) {
            return String.valueOf(this.val);
        }
        System.out.print(this.val + "->");
        return this.next.toString();
    }
}