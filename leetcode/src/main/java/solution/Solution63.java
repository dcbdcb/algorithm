package solution;

public class Solution63 {

    public static void main(String[] args) {
        int[][] a = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Solution63 s = new Solution63();
        System.out.println(s.uniquePathsWithObstacles(a));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int l1 = obstacleGrid.length;
        int l2 = obstacleGrid[0].length;
        int[][] a = new int[l1][l2];
        a[0][0] = 1;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (obstacleGrid[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    if (j == 0 && i == 0) {
                        continue;
                    } else if (j == 0) {
                        a[i][j] = a[i - 1][j];
                    } else if (i == 0) {
                        a[i][j] = a[i][j - 1];
                    } else {
                        a[i][j] = a[i][j - 1] + a[i - 1][j];
                    }
                }
            }
        }
        return a[l1 - 1][l2 - 1];
    }


}
