package solution;

public class Solution287 {

    public static void main(String[] args) {
        Solution287 s = new Solution287();
        int[] a = {1,3,4,2,2};
        int[] b = {3,1,3,4,2};
        System.out.println(s.findDuplicate(a));
        System.out.println(s.findDuplicate(b));
    }

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public int findDuplicate2(int[] nums) {

        return 0;
    }
}
