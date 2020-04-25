package solution;

public class Solution4 {

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.findMedianSortedArrays(new int[]{1, 2}, new int[] {3}));
        System.out.println(s.findMedianSortedArrays(new int[]{1, 3}, new int[] {2, 4}));
        System.out.println(s.findKthLargetest(new int[] {1,2,3,5,6,7,8}, new int[]{1,3,5,7, 9}, 0, 6, 0, 4, 9));


    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortNums = sort(nums1, nums2);
        int l = sortNums.length;
        if (l % 2 == 0) {
            return (sortNums[l / 2] + sortNums[l / 2 - 1]) / 2.0;
        } else {
            return sortNums[l / 2] / 1.0;
        }
    }

    public int[] sort(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while ((index1 <= nums1.length - 1) && (index2 <= nums2.length - 1)) {
            if (nums1[index1] < nums2[index2]) {
                result[index] = nums1[index1];
                index1++;
            } else {
                result[index] = nums2[index2];
                index2++;
            }
            index++;
        }
        if (index1 < nums1.length) {
            for (int i = index1; i < nums1.length; i++) {
                result[index] = nums1[index1];
                index++;
                index1++;
            }
        }
        if (index2 < nums2.length) {
            for (int i = index2; i < nums2.length; i++) {
                result[index] = nums2[index2];
                index++;
                index2++;
            }
        }
        return result;
    }

    public int findKthLargetest(int[] nums1, int[] nums2, int s1, int e1, int s2, int e2, int k) {




        return 0;
    }


}
