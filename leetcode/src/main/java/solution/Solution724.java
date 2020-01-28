package solution;

public class Solution724 {

    public static void main(String[] args) {
        Solution724 s = new Solution724();
        System.out.println(s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(s.pivotIndex(new int[] {1, 2, 3}));
    }

    public int pivotIndex(int[] nums) {
        // 循环数组求和
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }

        int leftSum = 0;
        // 遍历数组，计算左边和是否等于右边和，如果相同则返回，不同计算下一位
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
