package solution;

import solution.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {

    public static void main(String[] args) {
        Solution257 s = new Solution257();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.right = d;
        System.out.println(s.binaryTreePaths(a));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null) {
            String temp = String.valueOf(root.val);
            result.add(temp);
            return result;
        }
        List<String> temp = new ArrayList<String>();
        temp.addAll(binaryTreePaths(root.left));
        temp.addAll(binaryTreePaths(root.right));
        for (String s : temp) {
            s = root.val + "->" + s;
            result.add(s);
        }
        return result;
    }
}
