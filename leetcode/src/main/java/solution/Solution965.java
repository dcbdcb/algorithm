package solution;

import solution.binarytree.TreeNode;

public class Solution965 {

    public static void main(String[] args) {
        Solution965 s = new Solution965();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.println(s.isUnivalTree(a));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null) {
            if (root.val != left.val) {
                return false;
            }
            if (!isUnivalTree(left)) {
                return false;
            }
        }
        if (right != null) {
            if (root.val != right.val) {
                return false;
            }
            if (!isUnivalTree(right)) {
                return false;
            }
        }
        return true;

    }
}
