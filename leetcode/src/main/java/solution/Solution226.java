package solution;

import solution.binarytree.TreeNode;

public class Solution226 {

    public static void main(String[] args) {

    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode tempRight = invertTree(root.left);
        TreeNode tempLeft = invertTree(root.right);
        root.right = tempRight;
        root.left = tempLeft;
        return root;
    }

}
