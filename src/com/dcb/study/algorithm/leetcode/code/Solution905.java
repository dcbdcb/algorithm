package com.dcb.study.algorithm.leetcode.code;

public class Solution905 {

    public static void main(String[] args) {
        Solution905 s = new Solution905();
        System.out.println(s.sortArrayByParity(new int[] {1,2,3,4}));
    }

    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;

        while (l < r) {
            //
            if (A[l] % 2 != 0) {
                while (r > l) {
                    if (A[r] % 2 == 0) {
                        int temp = A[l];
                        A[l] = A[r];
                        A[r] = temp;
                        break;
                    }
                    r--;
                }
            }
            l++;
        }
        return A;
    }






}
