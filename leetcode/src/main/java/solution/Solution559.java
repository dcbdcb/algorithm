package solution;

import solution.ntree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution559 {

    public static void main(String[] args) {
        Solution559 s = new Solution559();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        List<Node> l1 = new ArrayList<Node>();
        l1.add(c);
        l1.add(b);
        l1.add(d);
        a.children = l1;

        List<Node> l2 = new ArrayList<Node>();
        l2.add(e);
        l2.add(f);
        c.children = l2;
        System.out.println(s.maxDepth(a));
    }

    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }

        List<Node> list = new ArrayList();
        list.add(root);
        while(!list.isEmpty()) {
            depth++;
            List<Node> temp = new ArrayList<Node>();
            for (Node node : list) {
                if (node.children != null) {
                    temp.addAll(node.children);
                }
            }
            list.clear();
            list.addAll(temp);
        }
        return depth;
    }
}
