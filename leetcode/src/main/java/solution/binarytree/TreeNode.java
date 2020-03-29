package solution.binarytree;

public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        return this.val + "," + (left == null ? "" : left.toString()) + (right == null ? "" : right.toString());
    }
}
