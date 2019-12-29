package solution;

import java.util.*;

public class Solution107 {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;

        Solution107 s = new Solution107();
        System.out.println(s.levelOrderBottom(a));

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 构造返回结果
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // 如果根节点为空，则直接返回空列表
        if (root == null) {
            return result;
        }

        // 每层树节点队列
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // 每层节点值数组，自上而下压栈
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        queue.add(root);
        // 队列中存在树的节点
        while (!queue.isEmpty()) {
            int nodeCount = queue.size();
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            List<Integer> list = new ArrayList();

            // 循环将该层节点依次取出，如果不为空，
            // 则将该节点的子节点放入咧那个是队列中
            // 将该节点的val值，放入这层数据列表中
            for (int i = 0; i < nodeCount; i++) {
                TreeNode tn = queue.poll();
                if (tn != null) {
                    list.add(tn.val);
                    next.add(tn.left);
                    next.add(tn.right);
                }
            }
            // 将数据列表压栈
            if (list.size() > 0) {
                stack.push(list);
            }
            // 将下一层树节点放入队列尾
            queue.addAll(next);
        }

        // 将数据栈中元素依次弹出，放入返回结果中
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
