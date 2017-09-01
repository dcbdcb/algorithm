package com.dcb.study.algorithm.leetcode.code;

public class Solution55 {

    public static void main(String[] args) {
        Solution55 s = new Solution55();
        System.out.println(s.canJump(new int[]{2,3,1,1,4}));
    }

    public boolean canJump(int[] nums) {
        int maxDistance = nums[0];
        for (int i = 0; i < maxDistance + 1; i++) {
            int distance = i + nums[i];
            if (distance > maxDistance)
                maxDistance = distance;
            if (maxDistance >= nums.length - 1)
                return true;
        }
        return false;
    }
}
