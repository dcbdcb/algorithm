package solution;

public class Solution62 {

    public static void main(String[] args) {
        Solution62 s = new Solution62();
        System.out.println(s.uniquePaths(3, 2));
        System.out.println(s.uniquePaths(7, 2));
    }

    public int uniquePaths(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j] + a[i][j - 1];
                }
            }
        }
        return a[m - 1][n - 1];
    }
}
