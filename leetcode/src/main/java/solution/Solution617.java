package solution;

import sun.reflect.generics.tree.Tree;

public class Solution617 {

    public static void main(String[] args) {
        Solution617 s = new Solution617();
        TreeNode t1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        t1.left = n1;
        t1.right = n2;
        n1.left = n3;


        TreeNode t2 = new TreeNode(2);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(4);
        TreeNode a4 = new TreeNode(7);
        t2.left = a1;
        t2.right = a2;
        a1.right = a3;
        a2.right = a4;
        System.out.println(s.mergeTrees(t1, t2));
    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            TreeNode result = new TreeNode(t1.val + t2.val);
            result.left = mergeTrees(t1.left, t2.left);
            result.right = mergeTrees(t1.right, t2.right);
            return result;
        }
    }
}
