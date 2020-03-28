package solution;

public class Solution70 {

    public static void main(String[] args) {
        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(2));
        System.out.println(s.climbStairs(3));
        System.out.println(s.climbStairs(4));
    }

    public int climbStairs(int n) {
        int one = 1;
        int two = 2;
        int temp = 0;
        if (n == 1) {
            return one;
        } else if (n == 2) {
            return two;
        }

        for (int i = 0; i < n - 2; i++) {
            temp = one + two;
            one = two;
            two = temp;
        }
        return temp;
    }


}
