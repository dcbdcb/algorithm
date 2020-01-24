package solution;

import com.alibaba.fastjson.JSON;
import solution.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {

    public static void main(String[] args) {
        System.out.println(1*2*3*4* 5*6*7*8*9*10);
        System.out.println(7 / Math.pow(5, 1));
        Solution94 s = new Solution94();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        System.out.println(JSON.toJSONString(s.inorderTraversal(a)));
        System.out.println(JSON.toJSONString(s.inorderTraversal2(a)));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }

        if (root.left != null) {
            result.addAll(inorderTraversal(root.left));
        }
        result.add(root.val);

        if (root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;

    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            if (root == null) {
                TreeNode node = stack.pop();
                result.add(node.val);
                root = node.right;
                continue;
            }

            stack.push(root);
            if (root.left != null) {
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);
                root = node.right;

            }
        }
        return result;
    }



}
