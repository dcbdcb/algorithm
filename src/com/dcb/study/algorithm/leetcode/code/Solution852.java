package com.dcb.study.algorithm.leetcode.code;

public class Solution852 {

    public static void main(String[] args) {
        Solution852 s = new Solution852();
        System.out.println(s.peakIndexInMountainArray(new int[] {3, 4, 5, 1}));
    }

    /**
     * 查询山脉数组中最大数字的下标
     * @param A 数组
     * @return 最大数字下标
     */
    public int peakIndexInMountainArray(int[] A) {
        return peakIndexInMountainArray(A, 0, A.length - 1);
    }

    /**
     * 查询山顶下标
     *
     * @param A 数组
     * @param l 起始下标
     * @param r 结束下标
     * @return 山顶下标
     */
    private int peakIndexInMountainArray(int[] A, int l, int r) {
        // 如果结束下标和起始下标差1，则反馈更大的那个值
        if (l + 1 == r) {
            return A[l] > A[r] ? l : r;
        }

        // 获取中间位的脚本
        int middle = (l + r) / 2;
        if (A[middle] > A[middle + 1]) {
            return peakIndexInMountainArray(A, l, middle);
        } else {
            return peakIndexInMountainArray(A, middle, r);
        }
    }


}
