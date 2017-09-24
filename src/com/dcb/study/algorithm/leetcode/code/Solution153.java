package com.dcb.study.algorithm.leetcode.code;

public class Solution153 {

    public static void main(String[] args) {
        int[] nums = new int[] {3, 5, 6, 7, 1, 2};
        Solution153 s = new Solution153();
        System.out.println(s.findMin(nums));
        System.out.println(s.findMin2(nums));

    }



    /**
     * 循环整个数列
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i])
                return nums[i + 1];
        }
        return nums[0];
    }

    /**
     * 二分法查找
     *
     * @param nums
     * @return
     */
    public int findMin2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int start = 0;
        int end = nums.length - 1;
        if (nums[start] < nums[end]) return nums[start];
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[start] > nums[mid])
                end = mid;
            else if (nums[start] < nums[mid])
                start = mid;
            else
                return nums[end];
        }
        return nums[start];
    }
}
