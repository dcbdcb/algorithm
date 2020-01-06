package solution;

public class Solution283 {

    public static void main(String[] args) {
        int[] a = new int[]{0,0, 1};
        Solution283 s = new Solution283();
        s.moveZeroes(a);
        s.moveZeroes2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

    public void moveZeroes(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int count = 0; // 记录非0的数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i == count) {
                    count++;
                    continue;
                } else {
                    nums[count] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}
