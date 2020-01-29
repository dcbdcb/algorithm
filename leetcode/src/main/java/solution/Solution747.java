package solution;

public class Solution747 {

    public static void main(String[] args) {
        Solution747 s = new Solution747();
        System.out.println(s.dominantIndex(new int[] {3, 6, 1, 0}));
        System.out.println(s.dominantIndex(new int[] {1, 2, 3, 4}));
        System.out.println(s.dominantIndex(new int[] {0, 0, 3, 2}));

    }

    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int largest = 0;
        int secLargest = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secLargest = largest;
                largest = nums[i];
                index = i;
            } else {
                if (nums[i] > secLargest) {
                    secLargest = nums[i];
                }
            }
        }
        if (largest >= secLargest * 2) {
            return index;
        }
        return -1;
    }
}
