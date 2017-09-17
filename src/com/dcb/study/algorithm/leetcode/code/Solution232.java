package com.dcb.study.algorithm.leetcode.code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution232 {

    class MyQueue{

        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            inStack = new Stack<Integer>();
            outStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (!outStack.isEmpty()) {
                return outStack.pop();
            } else {

                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
                return outStack.pop();
            }
        }

        /** Get the front element. */
        public int peek() {
            if (!outStack.isEmpty()) {
                return outStack.peek();
            } else {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
                return outStack.peek();
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        System.out.println(q.poll());
        System.out.println(q.poll());

    }


}
