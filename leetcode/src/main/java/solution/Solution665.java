package solution;

public class Solution665 {

    public static void main(String[] args) {
        Solution665 s = new Solution665();
        int[] a = {4, 2, 3};
        int[] b = {4, 2, 1};
        System.out.println(s.checkPossibility(a));
        System.out.println(s.checkPossibility(b));
    }

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                index = i;
            }
            if (count > 1) {
                return false;
            }
        }
        if (count == 0) {
            return true;
        }
        if (index == 0 || index == nums.length - 2) {
            return true;
        }
        return (nums[index + 1] >= nums[index - 1])
                || (nums[index] <= nums[index + 2]);
    }
}
