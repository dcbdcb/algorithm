package solution;

import solution.list.ListNode;

public class Solution725 {

    public static void main(String[] args) {

    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        if (root != null) {
            // 算出链表长度
            int len = 1;
            ListNode temp = root;
            while(temp.next != null) {
                temp = temp.next;
                len++;
            }

            // 计算每段链表的长度
            int a = len / k;
            int b = len % k;
            int count = 0;
            for (int i = 0; i < k; i++) {
                // 这段链表长度位a + 1
                if (count < b) {

                }



            }









        }

        return result;
    }
}
