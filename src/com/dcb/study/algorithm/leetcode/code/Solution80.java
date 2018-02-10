package com.dcb.study.algorithm.leetcode.code;

public class Solution80 {


    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1 };
        Solution80 s = new Solution80();

        System.out.println(s.removeDuplicates(nums));


    }



    public int removeDuplicates(int[] nums) {
        if (nums == null) return -1;
        if (nums.length <= 2) return nums.length;

        int result = 1;
        boolean canRepeat = true;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp || canRepeat) {

                result++;
                if (nums[i] == tmp) {
                    canRepeat = false;
                } else {
                    canRepeat = true;
                }

                nums[result - 1] = nums[i];
                tmp = nums[i];


            } else {
                continue;
            }

        }
        return result;
    }
}
