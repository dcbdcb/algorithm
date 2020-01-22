package solution;

public class Solution172 {

    public static void main(String[] args) {
        Solution172 s = new Solution172();
        System.out.println(s.trailingZeroes(1808548329));
    }

    public int trailingZeroes(int n) {
        int result = 0;
        while (true) {

            if (n / 5 > 0) {
                result += n / 5;
                n = n / 5;
            } else {
                return result;
            }
        }
    }

}
