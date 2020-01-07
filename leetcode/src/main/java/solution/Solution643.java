package solution;

public class Solution643 {

    public static void main(String[] args) {
        Solution643 s = new Solution643();
        int[] a = {0, 1, 1, 3, 3};
        System.out.println(s.findMaxAverage(a, 4));
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int resultSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        resultSum = sum;

        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum > resultSum) {
                resultSum = sum;
            }
        }
        return (double) resultSum / k;
    }
}
