package solution;

public class Solution724 {

    public static void main(String[] args) {
        Solution724 s = new Solution724();
        System.out.println(s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(s.pivotIndex(new int[] {1, 2, 3}));
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
