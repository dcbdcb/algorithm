package solution;

public class Solution303 {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }

}


class NumArray {

    private int[] array;
    private int[] sumArray;

    public NumArray(int[] nums) {
        this.array = nums;
        int l = nums.length;
        this.sumArray = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sumArray[j];
        } else {
            return sumArray[j] - sumArray[i - 1];
        }
    }
}