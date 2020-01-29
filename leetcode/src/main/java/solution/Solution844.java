package solution;

import java.util.Stack;

public class Solution844 {

    public static void main(String[] args) {
        Solution844 s = new Solution844();
        System.out.println(s.backspaceCompare("ab#c", "ad#c"));
        System.out.println(s.backspaceCompare("ab##", "c#d#"));
        System.out.println(s.backspaceCompare("a##c", "#a#c"));
        System.out.println(s.backspaceCompare("a#c",  "b"));
    }

    public boolean backspaceCompare(String S, String T) {
        return backspaceString(S).equals(backspaceString(T));
    }

    private String backspaceString(String str) {
        String result = "";
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : chars) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        for (Character c : stack) {
            result += c;
        }
        return result;
    }
}
