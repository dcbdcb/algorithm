package solution;

public class Solution1010 {

    public static void main(String[] args) {
        Solution1010 s = new Solution1010();
        int[] a = {60, 60, 60};
        System.out.println(s.numPairsDivisibleBy60(a));
        System.out.println(s.numPairsDivisibleBy602(a));
    }

    public int numPairsDivisibleBy60(int[] time) {
        if (time == null || time.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int numPairsDivisibleBy602(int[] time) {
        if (time == null || time.length == 0) {
            return 0;
        }
        int[] arr = new int[60];
        for (int t : time) {
            int temp = t % 60;
            arr[temp] = arr[temp] + 1;
        }
        int result = 0;
        for (int i = 1; i < 30; i++) {
            result += arr[i] * arr[60 - i];
        }
        result += arr[0] * (arr[0] - 1) / 2;
        result += arr[30] * (arr[30] - 1) / 2;
        return result;
    }

}
