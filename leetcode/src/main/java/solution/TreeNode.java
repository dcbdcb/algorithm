package solution;

public class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }



    TreeNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        return this.val + "," + (left == null ? "" : left.toString()) + (right == null ? "" : right.toString());
    }
}
