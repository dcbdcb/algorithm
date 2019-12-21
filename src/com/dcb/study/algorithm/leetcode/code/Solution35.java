package com.dcb.study.algorithm.leetcode.code;

public class Solution35 {

    public static void main(String[] args) {
        Solution35 s = new Solution35();
        int[] nums = {1, 3, 5, 6};
        System.out.println(s.searchInsert(nums, 5));
        System.out.println(s.searchInsert2(nums, 2));
        System.out.println(s.searchInsert(nums, 7));
        System.out.println(s.searchInsert2(nums, 0));
    }


    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                result++;
            }
        }
        return result;
    }

    public int searchInsert2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
