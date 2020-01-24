package solution;

public class Solution746 {

    public static void main(String[] args) {
        Solution746 s = new Solution746();
        System.out.println(s.minCostClimbingStairs(new int[] {10, 15, 20}));
        System.out.println(s.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 100, 1}));
    }


    public int minCostClimbingStairs(int[] cost) {
        return 0;
    }


    private int min(int a, int b) {
        return a > b ? b : a;
    }
}
