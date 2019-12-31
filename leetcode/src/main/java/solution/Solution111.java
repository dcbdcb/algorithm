package solution;

import sun.reflect.generics.tree.Tree;

public class Solution111 {

    public static void main(String[] args) {
        Solution111 s = new Solution111();

        TreeNode a1 = new TreeNode(0);
        System.out.println(s.minDepth(a1));

        TreeNode a2 = new TreeNode(0);
        TreeNode b2 = new TreeNode(1);
        a2.left = b2;
        System.out.println(s.minDepth(a2));

        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(s.minDepth(a));


    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null && root.left != null) {
            return minDepth(root.left) + 1;
        } else if (root.left == null && root.right == null){
            return 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
