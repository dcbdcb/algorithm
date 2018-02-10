package com.dcb.study.algorithm.leetcode.code;

public class Solution88 {

    public static void main(String[] args) {
        Solution88 s = new Solution88();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        System.out.println(nums1);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m; i > 0; i--) {
            nums1[n + i - 1] = nums1[i - 1];
        }
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[n + i] <= nums2[j]) {
                nums1[index] = nums1[n + i];
                i++;
            } else {
                nums1[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (j < n) {
            nums1[m + j] = nums2[j];
            j++;
        }
    }




}
