package solution;

public class Solution64 {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Solution64 s = new Solution64();
        System.out.println(s.minPathSum(a));
    }

    public int minPathSum(int[][] grid) {
        int l1 = grid.length;
        int l2 = grid[0].length;
        int[][] a = new int[l1][l2];
        a[0][0] = grid[0][0];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    a[i][j] = a[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    a[i][j] = a[i - 1][j] + grid[i][j];
                } else {
                    a[i][j] = Math.min(a[i][j - 1], a[i - 1][j]) + grid[i][j];
                }
            }
        }
        return a[l1 - 1][l2 - 1];
    }
}
