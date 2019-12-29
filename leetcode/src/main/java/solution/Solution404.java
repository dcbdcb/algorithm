package solution;

public class Solution404 {

    public static void main(String[] args) {
        Solution404 s = new Solution404();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.right = b;
        b.right = c;
        c.left = d;
        c.right = e;
        System.out.println(s.sumOfLeftLeaves(a));
    }

    /**
     * 计算树的左叶子之和
     *
     * @param root 二叉树跟节点
     * @return 二叉树左叶子之和
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 当左叶子节点没有叶子节点时，返回有节点的左叶子之和+左节点的val只
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        // 计算左叶子节点的左叶子之和 + 右叶子节点的左叶子之和
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}

