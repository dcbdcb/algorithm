package solution;

import solution.binarytree.TreeNode;

public class Solution235 {

    public static void main(String[] args) {
        Solution235 s = new Solution235();
        TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        e.right = i;
        System.out.println(s.lowestCommonAncestor(a, b, c));
        System.out.println(s.lowestCommonAncestor(a, b, e));

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if (pVal == rootVal || qVal == rootVal) {
            return root;
        } else if (pVal < rootVal && qVal < rootVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (pVal > rootVal && qVal > rootVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }

    }

}