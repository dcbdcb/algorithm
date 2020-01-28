package solution;

public class Solution476 {

    public static void main(String[] args) {
        Solution476 s = new Solution476();
        System.out.println(s.findComplement(1));
        System.out.println(s.findComplement(5));
    }

    public int findComplement(int num) {
        int n = 1;
        while (true) {
            if (n - 1 >= num) {
                return n - 1 - num;
            }
            n *= 2;
        }
    }

}
