package com.dcb.study.algorithm.leetcode.code;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.twoSum(new int[] { 2, 7, 11, 15}, 9));
    }

    /**
     * 依次遍历数组中的元素，判断剩余元素是否存在满足条件的值，找到则返回
     *
     * @param nums 数组
     * @param target 2个元素的和
     * @return 2个元素的下标
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
