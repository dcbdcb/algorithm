package solution;

public class Solution414 {

    public static void main(String[] args) {
        Solution414 s = new Solution414();
        System.out.println(s.thirdMax(new int[] {3, 2, 1}));
        System.out.println(s.thirdMax(new int[] {1, 2}));
        System.out.println(s.thirdMax(new int[] {2, 2, 3, 1}));
        System.out.println(s.thirdMax(new int[] {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1}));

        Integer a = -2147483648;
        Integer b = -2147483648;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer num : nums) {
            if (first == null || num.equals(first)) {
                first = num;
                continue;
            } else {
                if (num > first) {
                    third = second;
                    second = first;
                    first = num;
                    continue;
                }
            }

            if (second == null || num.equals(second)) {
                second = num;
                continue;
            } else {
                if (num > second) {
                    third = second;
                    second = num;
                    continue;
                }
            }

            if (third == null || num.equals(third)) {
                third = num;
                continue;
            } else {
                if (num > third) {
                    third = num;
                }
            }
        }
        return third == null ? first : third;
    }
}
