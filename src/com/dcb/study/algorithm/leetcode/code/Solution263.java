package com.dcb.study.algorithm.leetcode.code;

public class Solution263 {

    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(6));
        System.out.println(s.isUgly(8));
        System.out.println(s.isUgly(14));

    }

    public boolean isUgly(int num) {
        if (num == 1) return true;
        if (num == 0) return false;
        if (num % 2 == 0) return isUgly(num / 2);
        if (num % 3 == 0) return isUgly(num / 3);
        if (num % 5 == 0) return isUgly(num / 5);
        return false;
    }


}
