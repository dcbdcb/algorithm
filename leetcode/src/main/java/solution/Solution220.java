package solution;

public class Solution220 {

    public static void main(String[] args) {
        Solution220 s = new Solution220();
        System.out.println(s.containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
        System.out.println(s.containsNearbyAlmostDuplicate(new int[]{1,0,1,1}, 1, 2));
        System.out.println(s.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
        System.out.println(s.containsNearbyAlmostDuplicate(new int[]{-1,2147483647}, 1, 2147483647));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        k++;
        if (k > nums.length) {
            k = nums.length;
        }
        // 循环计算nums[0],nums[k]中是否存在满足条件的情况
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (Math.abs((long)nums[i] - (long)nums[j]) <= t) {
                    return true;
                }
            }
        }

        // 从nums[k] 到数组最后，依次计算当前元素与前 k - 1 个元素差的绝对值，满足条件则返回
        for (int i = k; i < nums.length; i++) {
            for (int j = 1; j < k; j++) {
                if (Math.abs((long)nums[i] - (long)nums[i - j]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }
}
