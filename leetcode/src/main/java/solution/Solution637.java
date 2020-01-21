package solution;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution637 {

    public static void main(String[] args) {
        Solution637 s = new Solution637();
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(JSON.toJSONString(s.averageOfLevels(a)));
    }

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return new ArrayList<Double>();
        }
        List<Double> result = new ArrayList<Double>();

        List<TreeNode> levelNodes = new ArrayList<TreeNode>();
        levelNodes.add(root);
        while (levelNodes.size() > 0) {
            Double sum = 0d;
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            for (TreeNode node : levelNodes) {
                sum += node.val;
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            result.add(sum / levelNodes.size());
            levelNodes.clear();
            levelNodes.addAll(nextLevel);
        }
        return result;
    }
}
