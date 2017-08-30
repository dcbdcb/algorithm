package com.dcb.study.algorithm.leetcode.code;

public class Solution27 {

    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.removeElement(new int[]{3,2,2,3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        for (int i = 0; i < result; i++) {
            while(nums[i] == val) {
                int temp = --result;
                if (i == temp)
                    break;
                nums[i] = nums[temp];
            }
        }
        return result;
    }
}
