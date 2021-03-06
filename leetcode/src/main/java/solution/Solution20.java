package solution;

import java.util.Stack;

public class Solution20 {

    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.isValid("()"));

    }

    public boolean isValid(String s) {
        try {
            Stack<Character> stack = new Stack<Character>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                switch (c) {
                    case '{':
                        stack.push(c);
                        break;
                    case '}':
                        if (stack.pop() != '{')
                            return false;
                        break;
                    case '[':
                        stack.push(c);
                        break;
                    case ']':
                        if (stack.pop() != '[')
                            return false;
                        break;
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.pop() != '(')
                            return false;
                        break;
                }
            }
            return stack.isEmpty();
        } catch (Exception e) {
            return false;
        }


    }
}
