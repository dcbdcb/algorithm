package solution;

import solution.binarytree.TreeNode;

public class Solution108 {

    public static void main(String[] args) {
        Solution108 s = new Solution108();
        int[] a = {-10,-3,0,5,9};
        System.out.println(s.sortedArrayToBST(a));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int middleIndex = (start + end) / 2;
        TreeNode root = new TreeNode(nums[middleIndex]);
        root.left = sortedArrayToBST(nums, start, middleIndex - 1);
        root.right = sortedArrayToBST(nums, middleIndex + 1, end);
        return root;
    }
}
