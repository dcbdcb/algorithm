package solution;

import solution.binarytree.TreeNode;

public class Solution654 {

    public static void main(String[] args) {
        int[] a = {3,2,1,6,0,5};
        Solution654 s = new Solution654();
        System.out.println(s.constructMaximumBinaryTree(a));
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0,  nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end){
        if (start > end) {
            return null;
        }

        if (start == end) {
            TreeNode node = new TreeNode(nums[start]);
            return node;
        }

        int maxIndex = start;
        int temp = nums[start];
        for (int i = start; i <= end; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
                maxIndex = i;
            }
        }

        TreeNode result = new TreeNode(temp);
        result.left = constructMaximumBinaryTree(nums, start, maxIndex - 1);
        result.right = constructMaximumBinaryTree(nums, maxIndex + 1, end);
        return result;
    }
}
