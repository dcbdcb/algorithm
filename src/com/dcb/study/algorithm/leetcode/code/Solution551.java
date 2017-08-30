package com.dcb.study.algorithm.leetcode.code;

public class Solution551 {


    public static void main(String[] args) {
        Solution551 s = new Solution551();
        System.out.println(s.checkRecord("LLPLLPLPPLLPLPLPPPLPLPLPPPLPPP"));


    }

    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int Lcount = 0;
        int Acount = 0;
        for (char c : chars) {
            if (c == 'L') {
                Lcount++;
                if (Lcount > 2)
                    return false;
            } else {
                Lcount = 0;
            }
            if (c == 'A') {
                Acount++;
                if (Acount > 1)
                    return false;
            }
        }

        return true;
    }
}
