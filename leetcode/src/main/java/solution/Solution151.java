package solution;

public class Solution151 {

    public static void main(String[] args) {
        String a = "the sky is blue";
        String b = "  ";
        Solution151 s = new Solution151();
        System.out.println(s.reverseWords(a));
        System.out.println(s.reverseWords(b));
    }

    public String reverseWords(String s) {
        String result = "";
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            String temp = strArr[strArr.length - 1 - i];
            if ("".equals(temp)) {
                continue;
            }
            result += temp + " ";
        }
        if ("".equals(result)) {
            return "";
        }
        return result.substring(0, result.length() - 1);
    }
}
