package solution;

public class Solution101 {

    public static void main(String[] args) {
        Solution101 s = new Solution101();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(3);
        TreeNode g = new TreeNode(4);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.println(s.isSymmetric(a));

    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }


    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null)
            return true;
        if (l == null || r == null)
            return false;
        if (l.val != r.val)
            return false;

        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
}
