package solution;

public class Solution121 {

    public static void main(String[] args) {
        Solution121 s = new Solution121();
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(s.maxProfit(a));
        System.out.println(s.maxProfit2(a));
        int[] b = {7, 6, 4, 3, 1};
        System.out.println(s.maxProfit(b));
        System.out.println(s.maxProfit2(b));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        int len = prices.length;
        int[][] maxProfit = new int[len][2];
        maxProfit[0][0] = 0;
        maxProfit[0][1] = - prices[0];
        for (int i = 1; i < len; i++) {
            maxProfit[i][0] = Math.max(maxProfit[i - 1][0], maxProfit[i - 1][1] + prices[i]);
            maxProfit[i][1] = Math.max(maxProfit[i - 1][1], - prices[i]);
         }
        return maxProfit[len - 1][0];
    }



}
