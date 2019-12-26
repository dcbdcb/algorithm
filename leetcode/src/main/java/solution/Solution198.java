package solution;

public class Solution198 {

    public static void main(String[] args) {
        Solution198 s = new Solution198();
        System.out.println(s.rob(new int[]{1, 2, 3, 1}));
        System.out.println(s.rob(new int[]{2, 7, 9, 3, 1}));
    }


    public int rob(int[] nums) {
        int len = nums.length;
        switch (len) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            case 2:
                return max(nums[0], nums[1]);
            default:
                int[] temp = new int[nums.length];
                temp[0] = nums[0];
                temp[1] = max(nums[0], nums[1]);
                for (int i = 2; i < nums.length; i++) {
                    temp[i] = max(temp[i - 2] + nums[i], temp[i - 1]);
                }
                return temp[len - 1];
        }
    }

    /**
     * 获取2个数中较大的数
     * @param a 第一个数
     * @param b 第二个数
     * @return 较大的数
     */
    private int max(int a, int b) {
        return a > b ? a : b;
    }

}
