package solution;

import java.util.Stack;

public class Solution58 {

    public static void main(String[] args) {
        Solution58 s = new Solution58();
        System.out.println(s.lengthOfLastWord("hello world "));
    }

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : chars) {
            if (c == ' ') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && stack.peek() == ' ') {
                    stack.clear();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty() && stack.peek() == ' ') {
            stack.pop();
        }
        return stack.size();
    }
}
