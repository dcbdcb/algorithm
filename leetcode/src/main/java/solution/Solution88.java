package solution;

public class Solution88 {

    public static void main(String[] args) {
        Solution88 s = new Solution88();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        System.out.println(nums1);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 先将nums1中所有元素向后移动n位
        for (int i = m; i > 0; i--) {
            nums1[n + i - 1] = nums1[i - 1];
        }
        // 依次比较2个列表的首位元素，将较小的值，放入制定位置
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
        // 将nums2中元素拼在最后
        while (j < n) {
            nums1[m + j] = nums2[j];
            j++;
        }
    }




}
