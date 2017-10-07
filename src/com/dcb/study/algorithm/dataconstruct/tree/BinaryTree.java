package com.dcb.study.algorithm.dataconstruct.tree;


public class BinaryTree<T> {

    protected T data;

    public BinaryTree<T> left;
    public BinaryTree<T> right;
    public BinaryTree<T> parent;

    /**
     * 构造方法
     * 创建一棵空的二叉树
     */
    public BinaryTree() {
        data = null;
        left = null;
        right = null;
        parent = null;
    }

    /**
     * 使用指定数据为该树创建根节点
     * 若这棵树为空，抛出异常TreeViolationException
     *
     * @param data
     */
    void makeRoot(T data) {
        if (this.data != null) {
            throw new TreeViolationException();
        }
        this.data = data;
    }


    /**
     * 设置这棵树的当前节点处的数据为指定数据
     *
     * @param data
     */
    void setData(T data) {
        this.data = data;
    }

    /**
     * 获得存储在这棵树当前节点处的数据
     * @return
     */
    T getData() {
        return data;
    }

    /**
     * 返回这棵树的根节点
     * @return
     */
    BinaryTree<T> root() {
        if (this.parent == null) {
            return this;
        }
        BinaryTree<T> nextParent = parent;
        while (nextParent.parent != null) {
            nextParent = nextParent.parent;
        }
        return nextParent;
    }

    /**
     * 将传入的树，设为当前节点的左子树
     * 如果当前节点有左子树，则抛出TreeViolationException
     *
     * @param tree
     */
    void attachLeft(BinaryTree<T> tree) {
        if (left != null)
            throw new TreeViolationException();
        if (tree != null) {
            tree.parent = this;
            this.left = tree;
        }
    }

    /**
     * 将传入的树，设为当前节点的右子树
     * 如果当前节点有右子树，则抛出TreeViolationException
     *
     * @param tree
     */
    void attachRight(BinaryTree<T> tree) {
        if (this.right != null)
            throw new TreeViolationException();
        if (tree != null) {
            this.right = tree;
            tree.parent = this;
        }
    }

    /**
     * 断开当前节点的左子树，
     * 并返回当前节点的左子树
     * 如果当前节点左子树为空则返回null
     *
     * @return
     */
    BinaryTree<T> detachLeft() {
        BinaryTree<T> retLeft = this.left;
        this.left = null;
        return retLeft;
    }

    /**
     * 断开当前节点的右子树，
     * 并返回当前节点的右子树
     * 如果当前节点右子树为空则返回null
     *
     * @return
     */
    BinaryTree<T> detachRight() {
        BinaryTree<T> retRight = this.right;
        this.right = null;
        return retRight;
    }

    /**
     * 如果这棵树是空树，返回true
     * 否则返回false
     *
     * @return
     */
    boolean isEmpty() {
        return data == null;
    }

    /**
     * 清空以当前节点为根的二叉树，并把它从它的双亲节点断开
     */
    void clear() {
        this.parent = null;
        this.right = null;
        this.parent = null;
        this.data = null;
    }

}
