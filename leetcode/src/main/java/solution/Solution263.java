package solution;

public class Solution263 {

    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(6));
        System.out.println(s.isUgly2(6));
        System.out.println(s.isUgly(8));
        System.out.println(s.isUgly2(8));
        System.out.println(s.isUgly(14));
        System.out.println(s.isUgly2(14));

    }

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int temp = num;
        while (temp % 5 == 0) {
            temp /= 5;
        }
        while (temp % 3 == 0) {
            temp /= 3;
        }
        while (temp % 2 == 0) {
            temp /= 2;
        }
        return 1 == temp;
    }

    public boolean isUgly2(int num) {
        if (num == 1) return true;
        if (num == 0) return false;
        if (num % 2 == 0) return isUgly2(num / 2);
        if (num % 3 == 0) return isUgly2(num / 3);
        if (num % 5 == 0) return isUgly2(num / 5);
        return false;
    }
}
