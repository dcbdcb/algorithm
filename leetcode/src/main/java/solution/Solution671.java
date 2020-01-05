package solution;

public class Solution671 {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        d.right = e;
        Solution671 s = new Solution671();
        System.out.println(s.findSecondMinimumValue(a));
    }


    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;

        if (root.left == null) {
            return -1;
        }
        int r = root.val;
        int left = root.left.val;
        int right = root.right.val;

        if (left == right) {
            if (left > r) {
                return left;
            } else {
                int tempL = findSecondMinimumValue(root.left);
                int tempR = findSecondMinimumValue(root.right);
                if (tempL == -1) {
                    return tempR;
                }
                if (tempR == -1) {
                    return tempL;
                }
                return Math.min(tempL, tempR);
            }
        } else {
            if (left != r && right != r) {
                return Math.min(left, right);
            }
            if (left == r) {
                int tempL = findSecondMinimumValue(root.left);
                if (tempL != -1 && tempL <= right) {
                    return tempL;
                } else {
                    return right;
                }
            } else if (right == r) {
                int tempR = findSecondMinimumValue(root.right);
                if (tempR != -1 && tempR <= left) {
                    return tempR;
                } else {
                    return left;
                }
            }
        }
        return -1;
    }


}
