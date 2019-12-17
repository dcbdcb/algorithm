package com.dcb.study.algorithm.leetcode.code;

public class Solution922 {

    public static void main(String[] args) {
        Solution922 s = new Solution922();
        System.out.println(s.sortArrayByParityII(new int[] {4, 1, 1, 0, 1, 0}));

    }


    public int[] sortArrayByParityII(int[] A) {
        if (A.length == 0) {
            return A;
        }

        int i = 0;
        int j = 1;
        while (i < A.length) {
            if (A[i] % 2 != 0) {
                while (j < A.length) {
                    if (A[j] % 2 == 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    }
                    j = j + 2;
                }
            }
            i = i + 2;

        }
        return A;
    }


}
