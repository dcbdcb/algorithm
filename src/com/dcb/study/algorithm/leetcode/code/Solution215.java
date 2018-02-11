package com.dcb.study.algorithm.leetcode.code;

public class Solution215 {


    public static void main(String[] args) {
        Solution215 s = new Solution215();
        int[] nums = new int[] {7,6,5,4,3,2,1};
        System.out.println(s.findKthLargest(nums, 5));
    }

    public int findKthLargest(int[] nums, int k) {
        int to = nums.length - 1;
        return this.findKthLargest(nums, 0, to, k);
    }

    /**
     * 寻找数组中某段的第K大的值
     *
     * @param nums - 数组
     * @param start - 起始为止下标
     * @param end - 结束为止下标
     * @param k - 第k大的值
     * @return
     */
    private int findKthLargest(int[] nums, int start, int end, int k) {


        if (start == end) return nums[start];

        int i = start;
        int j = end;

        // 使用快排的思想，重新排列数组
        while (i < j) {

            if (nums[i] > nums[i + 1]) {
                swapElement(nums, i + 1, j);
                j--;
            } else {
                swapElement(nums, i, i + 1);
                i++;
            }
        }

        // 判断第K大的数在数组中的哪一段，递归调用
        if (i - start == k - 1) {
            return nums[i];
        } else if (i - start > k - 1) {
            return this.findKthLargest(nums, start, i - 1, k);
        } else {
            return this.findKthLargest(nums, i + 1, end, k - (i + 1 - start));
        }

    }

    /**
     * 交换数组中两元素的位置
     *
     * @param nums - 数组
     * @param index1 - 第一个元素下标
     * @param index2 - 第二个元素下标
     */
    private void swapElement(int[] nums, int index1, int index2) {

        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }


}
