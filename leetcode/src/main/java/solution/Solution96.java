package solution;

public class Solution96 {

    public static void main(String[] args) {
        Solution96 s = new Solution96();
        System.out.println(s.numTrees(4));
    }

    public int numTrees(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            int temp = 0;
            while (temp < i) {
                result[i] += result[i - 1 - temp] * result[temp];
                temp++;
            }
        }
        return result[n];
    }



}
