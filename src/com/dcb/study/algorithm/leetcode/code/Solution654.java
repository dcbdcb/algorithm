package com.dcb.study.algorithm.leetcode.code;

public class Solution654 {

    public static void main(String[] args) {
        Solution654 s = new Solution654();
        TreeNode t = s.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        System.out.println(t);


    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int[] leftPart = getLeftPart(nums, maxIndex);
        int[] rightPart = getRightPart(nums, maxIndex);

        TreeNode result = new TreeNode(max);
        result.left = constructMaximumBinaryTree(leftPart);
        result.right = constructMaximumBinaryTree(rightPart);
        return result;
    }

    public int[] getLeftPart(int[] nums, int index) {
        if (index == 0) return new int[0];

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    public int[] getRightPart(int[] nums, int index) {
        if (index == nums.length - 1) return new int[0];
        int[] result = new int[nums.length - 1 - index];
        for (int i = index + 1; i < nums.length; i++) {
            result[0] = nums[i];
        }
        return result;

    }
}
