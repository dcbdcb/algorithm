package com.dcb.study.algorithm.leetcode.code;

public class Solution42 {

    public static void main(String[] args) {
        Solution42 s = new Solution42();
        int[] height = new int[]{};
        System.out.println(s.trap(height));
    }


    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length - 1;

        int result = 0;
        int rightmax = height[right];
        int leftmax = height[left];

        while (right - left > 0) {

            if (height[left] >= height[right]) {
                int temp = right - 1;
                if (height[temp] < rightmax) {
                    result += (rightmax - height[temp]);
                } else {
                    rightmax = height[temp];
                }
                right--;
            } else {
                int temp = left + 1;
                if (height[temp] < leftmax) {
                    result += (leftmax - height[temp]);
                } else {
                    leftmax = height[temp];
                }
                left++;
            }
        }
        return result;
    }


}
