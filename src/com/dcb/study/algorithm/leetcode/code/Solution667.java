package com.dcb.study.algorithm.leetcode.code;

public class Solution667 {

    public static void main(String[] args) {

        Solution667 s = new Solution667();
        System.out.println(s.constructArray(3, 2));
    }

    public int[] constructArray(int n, int k) {

        int[] result = new int[n];
        result[0] = 1;
        int temp = 1;

        for (int i = 0; i < n - 1; i++) {
            if (k >= 1) {
                result[i + 1] = result[i] + temp * k;
                temp *= -1;
                k--;
            } else {
                result[i + 1] = i + 2;
            }
        }

        return result;
    }


}
