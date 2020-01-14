package solution;

public class Solution26 {


    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(s.removeDuplicates(new int[]{1, 1, 2}));

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                continue;
            } else {
                result++;
                temp = nums[i];
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }
}
