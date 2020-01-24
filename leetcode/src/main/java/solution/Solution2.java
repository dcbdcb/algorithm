package solution;

import solution.list.ListNode;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        ListNode x = new ListNode(5);
        ListNode y = new ListNode(6);
        ListNode z = new ListNode(4);
        x.next = y;
        y.next = z;
        System.out.println(s.addTwoNumbers(a, x));
    }

    /**
     * 两数求和
     *
     * @param l1 第一个数
     * @param l2 第二个数
     * @return 和
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 如果一个入参为空，则返回另一个结果
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // 计算个位数
        int a = (l1.val + l2.val) % 10;     // 相加结果
        int b = (l1.val + l2.val) / 10;     // 进位
        ListNode l = new ListNode(a);       // 定义返回结果
        ListNode result = l;

        // l1,l2有一个数存在下一位,循环处理
        while (l1.next != null || l2.next != null) {
            // l1下一位为空
            if (l1.next == null) {
                a = (b + l2.next.val) % 10; // 相加结果
                b = (b + l2.next.val) / 10; // 进位
                // 计算当前位的值
                ListNode temp = new ListNode(a);
                // 把当前位加入到返回结果中
                l.next = temp;
                // 下标向后挪一位
                l = l.next;
                // l2下标向后挪以为
                l2 = l2.next;
            } else if (l2.next == null) {
                a = (b + l1.next.val) % 10;
                b = (b + l1.next.val) / 10;
                ListNode temp = new ListNode(a);
                l.next = temp;
                l = l.next;
                l1 = l1.next;
            } else {
                a = (b + l1.next.val + l2.next.val) % 10;
                b = (b + l1.next.val + l2.next.val) / 10;
                ListNode temp = new ListNode(a);
                l.next = temp;
                l = l.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        // 如果l1,l2都没有下一位，则判断进位是否为0
        if (b == 1) {
            ListNode temp = new ListNode(1);
            l.next = temp;
        }
        return result;
    }
}
