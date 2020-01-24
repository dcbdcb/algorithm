package solution;

import solution.binarytree.TreeNode;

public class Solution100 {

    public static void main(String[] args) {
        Solution100 s = new Solution100();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;

        TreeNode x = new TreeNode(1);
        TreeNode y = new TreeNode(2);
        TreeNode z = new TreeNode(3);
        x.left = y;
        x.right = z;
        System.out.println(s.isSameTree(a, x ));
    }


    /**
     * 判断2棵二叉树是否相同（结构和值都相等）
     * @param p 第一棵树头节点
     * @param q 第二棵树头节点
     * @return 是否相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (q.val != p.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
