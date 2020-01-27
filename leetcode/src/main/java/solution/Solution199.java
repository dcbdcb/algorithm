package solution;

import solution.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution199 {

    public static void main(String[] args) {
        Solution199 s = new Solution199();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.right = e;
        c.right = d;
        System.out.println(s.rightSideView(a));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        List<TreeNode> levelNodes = new LinkedList<TreeNode>();
        levelNodes.add(root);
        while (!levelNodes.isEmpty()) {
            result.add(levelNodes.get(levelNodes.size() - 1).val);
            List<TreeNode> temp = new LinkedList<TreeNode>();
            for (TreeNode node : levelNodes) {
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            levelNodes = temp;
        }
        return result;
    }
}
