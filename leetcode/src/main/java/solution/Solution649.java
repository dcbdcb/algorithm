package solution;

public class Solution649 {

    public static void main(String[] args) {
        Solution649 s = new Solution649();
        String str = "RD";
        String str1 = "RDDR";
        System.out.println(s.predictPartyVictory(str));
        System.out.println(s.predictPartyVictory(str1));
    }

    public String predictPartyVictory(String senate) {
        char[] chars = senate.toCharArray();
        int i = 0;
        while (deleteNextDiffer(chars, i)) {
            if (i < chars.length - 1) {
                i++;
            } else {
                i = 0;
            }
        }

        if (chars[i] == 'R') {
            return "Radiant";
        }
        return "Dire";
    }

    /**
     * 删除下一个不同阵营的议员
     * @param chars
     * @param current
     * @return
     */
    private boolean deleteNextDiffer(char[] chars, int current) {
        if (chars[current] == '0') {
            return true;
        }
        char c = chars[current];
        for (int i = 0; i < chars.length; i++) {
            int index = (current + i) % chars.length;
            char temp = chars[index];
            if (temp != '0' && temp != c) {
                chars[index] = '0';
                return true;
            }
        }
        return false;
    }



}
