package com.dcb.study.algorithm.leetcode.code;

public class Solution278 {

    public static void main(String[] args) {
        Solution278 s = new Solution278();
        System.out.println(s.firstBadVersion(1690815734));
    }


    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    public int binarySearch(int a, int b) {
        if (a == b) return a;
        if (b - a == 1) {
            return isBadVersion(a) ? a : b;
        }
        int tmp = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            tmp = a / 2 + b / 2 + 1;
        } else {
            tmp = a / 2 + b / 2;
        }
        return isBadVersion(tmp) ? binarySearch(a, tmp) : binarySearch(tmp, b);

    }

    public boolean isBadVersion(int n) {
        return n >= 1049889538;
    }

}
