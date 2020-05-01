package solution;

import solution.binarytree.TreeNode;

public class Solution104 {

    public static void main(String[] args) {
        Solution104 s = new Solution104();
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(s.maxDepth(a));
    }

    /**
     * 求二叉树的深度
     *
     * @param root 根节点
     * @return 二叉树深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


}
