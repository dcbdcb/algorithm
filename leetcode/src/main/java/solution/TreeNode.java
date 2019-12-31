package solution;

public class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;


    TreeNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        return this.val + "," + (left == null ? "" : left.toString()) + (right == null ? "" : right.toString());
    }
}
