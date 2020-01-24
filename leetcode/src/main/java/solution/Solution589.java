package solution;

import solution.ntree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution589 {

    public static void main(String[] args) {
        Solution589 s = new Solution589();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        List<Node> list = new ArrayList<Node>();
        list.add(c);
        list.add(b);
        list.add(d);
        a.children = list;

        list = new ArrayList<Node>();
        list.add(e);
        list.add(f);
        c.children = list;
        System.out.println(s.preorder(a));
        System.out.println(s.preorder2(a));
    }

    /**
     * 递归实现N叉树前序遍历
     *
     * @param root 根节点
     * @return 遍历数组
     */
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(root.val);
        List<Node> list = root.children;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                result.addAll(preorder(list.get(i)));
            }
        }
        return result;
    }

    /**
     * 迭代实现N叉树前序遍历
     *
     * @param root 根节点
     * @return 前序遍历数组
     */
    public List<Integer> preorder2(Node root) {
        if (root == null)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node topNode = stack.pop();
            result.add(topNode.val);
            List<Node> children = topNode.children;
            if (children != null && children.size() > 0) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
        }
        return result;
    }



}
