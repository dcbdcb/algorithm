package solution;

public class Solution896 {

    public static void main(String[] args) {
        Solution896 s = new Solution896();
        int[] a = {1, 2, 2, 3};
        int[] b = {6, 5, 4, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2, 2, 3};
        int[] e = {1, 1, 1};
        System.out.println(s.isMonotonic(a));
        System.out.println(s.isMonotonic(b));
        System.out.println(s.isMonotonic(c));
        System.out.println(s.isMonotonic(d));
        System.out.println(s.isMonotonic(e));

    }

    public boolean isMonotonic(int[] nums) {
        boolean isIncrease = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncrease = false;
                break;
            }
        }
        if (isIncrease) {
            return true;
        }

        boolean isDecrease = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isDecrease = false;
            }
        }
        return isDecrease;

    }
}
