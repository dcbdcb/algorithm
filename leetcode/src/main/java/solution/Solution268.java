package solution;

public class Solution268 {

    public static void main(String[] args) {
        Solution268 s = new Solution268();
        int[] a = {0, 1, 3};
        System.out.println(s.missingNumber(a));
        int[] b = {9,6,4,2,3,5,7,0,1};
        System.out.println(s.missingNumber(b));
    }

    public int missingNumber(int[] nums) {
        int temp = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return temp - sum;
    }
}
