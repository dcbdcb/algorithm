package com.dcb.study.algorithm.leetcode.code;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution224 {

    public static void main(String[] args) {
        Solution224 s = new Solution224();
        System.out.println(s.calculate("1 + 1"));
        System.out.println(s.calculate(" 22-1 + 2 "));
        System.out.println(s.calculate("(1+(4+5+2)-3)+(6+8)"));

        System.out.println(s.calculate("2147483647"));
    }


    public int calculate(String s) {
        // 解析string 取出其中的数字和运算符
        List<Object> elements = new ArrayList<Object>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            String tmp = "";
            while (Character.isDigit(chars[i])) {
                tmp = tmp + chars[i];
                ++i;
                if (i == chars.length)
                    break;
            }
            if (!"".equals(tmp))
                elements.add(Integer.valueOf(tmp));

            if (i == chars.length) break;
            char c = chars[i];
            if (c == '+' || c == '-' || c == '(' || c == ')') {
                elements.add(String.valueOf(c));
            }
        }

        Stack<Integer> numStack = new Stack<Integer>();
        Stack<String> opStack = new Stack<String>();


        for (Object element : elements) {
            if (element instanceof Integer) {
                numStack.push((int) element);
            } else {
                if ("(".equals(element)) {
                    opStack.push((String) element);
                } else if ("+".equals(element) || "-".equals(element)) {
                    if (opStack.empty() || "(".equals(opStack.peek())) {
                        opStack.push((String) element);
                    } else {
                        int b = numStack.pop();
                        int a = numStack.pop();
                        String op = opStack.pop();
                        numStack.push(calculate(a, b, op));
                        opStack.push((String) element);
                    }
                } else if (")".equals(element)) {
                    if ("(".equals(opStack.peek())) {
                        opStack.pop();
                    } else {
                        int b = numStack.pop();
                        int a = numStack.pop();
                        String op = opStack.pop();
                        numStack.push(calculate(a, b, op));
                        opStack.pop();
                    }
                }
            }
        }

        if (!opStack.empty()) {

            int b = numStack.pop();
            int a = numStack.pop();
            String op = opStack.pop();
            return calculate(a, b, op);
        }
        return numStack.pop();
    }

    // 计算
    private int calculate(int a, int b, String op) {
        if ("+".equals(op)) {
            return a + b;
        } else if ("-".equals(op)) {
            return a - b;
        }
        return 0;
    }
}
