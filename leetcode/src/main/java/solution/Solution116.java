package solution;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution116 {

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        Solution116 s = new Solution116();
        System.out.println(JSON.toJSONString(s.connect(a)));
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        List<Node> list = new ArrayList<Node>();
        list.add(root);
        while (!list.isEmpty()) {
            List<Node> temp = new ArrayList<Node>();
            for (int i = 0; i < list.size(); i++) {
                Node node = list.get(i);
                if (i < list.size() - 1) {
                    node.next = list.get(i + 1);
                }
                if (node.left != null) {
                    temp.add(node.left);
                    temp.add(node.right);
                }
            }
            list.clear();
            list.addAll(temp);
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}