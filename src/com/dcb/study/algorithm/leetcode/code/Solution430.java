package com.dcb.study.algorithm.leetcode.code;

public class Solution430 {

    public static void main(String[] args) {
        Solution430 s = new Solution430();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        c.child = g;
        g.next = h; h.prev = g;
        h.next = i; i.prev = h;
        i.next = j; j.prev = i;
        h.child = k;
        k.next = l; l.prev = k;
        System.out.println(s.flatten(a));
    }

    /**
     * 扁平化多级双向链表
     *
     * @param head 头结点
     * @return 双向链表
     */
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        // 获取子节点双向链表
        Node childFlattenNode = flatten(head.child);
        // 获取next节点双向链表
        Node nextNode = flatten(head.next);
        head.next = null;
        head.child = null;
        // 子节点双向链表非空，则加在头结点后
        if (childFlattenNode != null) {
            head.next = childFlattenNode;
            childFlattenNode.prev = head;
        }
        // next节点双向链表非空，加在链表末尾
        if (nextNode != null) {
            // 构造临时节点，并移动到链表最后
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nextNode;
            nextNode.prev = temp;
        }
        return head;
    }
}
