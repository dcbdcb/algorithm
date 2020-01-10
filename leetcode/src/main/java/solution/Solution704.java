package solution;

public class Solution704 {

    public static void main(String[] args) {
        Solution704 s = new Solution704();
        System.out.println(s.search(new int[] {-1,0,3,5,9,12}, 9));
        System.out.println(s.search1(new int[] {5}, 9));
    }

    /**
     * 遍历数组，找到指定的目标数字
     * @param nums 数组
     * @param target 目标数字
     * @return 目标数字下标，不存在返回-1
     */
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    /**
     * 用二分查找法，从数组中查询目标数字，返回下标
     *
     * @param nums 数组
     * @param l 起始下标
     * @param r 结束下标
     * @param target 目标数字
     * @return 目标数字下标
     */
    public int binarySearch(int[] nums, int l, int r, int target) {
        if (nums[l] == target)  return l;
        if (nums[r] == target)  return r;
        if (l + 1 == r || l == r) {
            return -1;
        }

        int middle = (l + r) / 2;
        if (nums[middle] == target) return middle;
        if (nums[middle] > target) return binarySearch(nums, l, middle, target);
        if (nums[middle] < target) return binarySearch(nums, middle, r, target);
        return -1;
    }


}
