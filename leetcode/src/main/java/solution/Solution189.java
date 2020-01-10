package solution;

import solution.utils.Utils;

public class Solution189 {

    public static void main(String[] args) {
        System.out.println(100 % 11);
        Solution189 s = new Solution189();
        int[] a = {1,2,3,4,5,6,7};
        s.rotate3(a, 2);
       // s.reverse(a, 0, 2);
        Utils.printArray(a);

    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        for (int j = 0; j < k; j++) {
            int temp = nums[len - 1];
            for (int i = len - 1; i >= 0; i--) {
                if (i == 0) {
                    nums[i] = temp;
                    break;
                }
                nums[i] = nums[i - 1];
            }
        }
    }

    public void rotate2(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[k - 1 - i] = nums[len - 1 - i];
        }

        for (int i = len - 1; i >= 0; i--) {
            if (len - 1 - k < i) {
                continue;
            } else {
                nums[i + k] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate3(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - k - 1);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
