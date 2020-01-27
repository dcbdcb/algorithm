package solution;

import solution.ntree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution429 {

    public static void main(String[] args) {
        Solution429 s = new Solution429();
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
        List<Node> l2 = new ArrayList<Node>();
        l2.add(e);
        l2.add(f);
        c.children = l2;
        System.out.println(s.levelOrder(a));
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }

        List<Node> levelNodes = new ArrayList<Node>();
        levelNodes.add(root);
        while(!levelNodes.isEmpty()) {
            List<Integer> levelVals = new ArrayList<Integer>();
            List<Node> temp = new ArrayList<Node>();
            for (Node node : levelNodes) {
                levelVals.add(node.val);
                if (node.children != null) {
                    temp.addAll(node.children);
                }
            }
            result.add(levelVals);
            levelNodes.clear();
            levelNodes = temp;
        }
        return result;
    }
}
