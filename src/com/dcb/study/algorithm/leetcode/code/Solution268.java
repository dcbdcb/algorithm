package com.dcb.study.algorithm.leetcode.code;

public class Solution268 {

    public static void main(String[] args) {
        Solution268 s = new Solution268();
        int[] a = {0, 1, 3};
        System.out.println(s.missingNumber(a));
    }

    public int missingNumber(int[] nums) {
        int temp = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return temp - sum;
    }
}
