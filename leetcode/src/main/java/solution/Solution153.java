package solution;

public class Solution153 {

    public static void main(String[] args) {
        Solution153 s = new Solution153();
        int[] a = {3,4,5,1,2};
        int[] b = {4,5,6,7,0,1,2};
        int[] c = {1, 2, 3};
        System.out.println(s.findMin(a));
        System.out.println(s.findMin2(a));
        System.out.println(s.findMin(b));
        System.out.println(s.findMin2(b));
        System.out.println(s.findMin2(c));
    }

    public int findMin(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[0];
    }

    public int findMin2(int[] nums) {
        return bSearch(nums, 0, nums.length - 1);
    }

    private int bSearch(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        if (mid == start) {
            return Math.min(nums[start], nums[end]);
        }
        if (nums[mid] > nums[start]) {
            return bSearch(nums, mid, end);
        } else {
            return bSearch(nums, start, mid);
        }
    }

}
