package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

    public static void main(String[] args) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(null);
        System.out.println(queue.isEmpty());
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        queue.add(root);

        while(!queue.isEmpty()) {
            List<TreeNode> tempList = new ArrayList<TreeNode>();
            List<Integer> intList = new ArrayList<Integer>();
            for (TreeNode node : queue) {
                intList.add(node.val);
                if (node.left != null) {
                    tempList.add(node.left);
                }
                if (node.right != null) {
                    tempList.add(node.right);
                }
            }
            result.add(intList);
            queue.clear();
            queue.addAll(tempList);
        }
        return result;
    }

}
