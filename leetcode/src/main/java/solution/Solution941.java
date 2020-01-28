package solution;

public class Solution941 {

    public static void main(String[] args) {
        Solution941 s = new Solution941();
        System.out.println(s.validMountainArray(new int[]{2, 1}));
        System.out.println(s.validMountainArray(new int[]{3, 5, 5}));
        System.out.println(s.validMountainArray(new int[]{0, 3, 2, 1}));
    }

    public boolean validMountainArray(int[] a) {
        int len = a.length;
        if (len < 3) {
            return false;
        }

        int maxNum = a[0];
        int maxIndex = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] > maxNum) {
                maxIndex = i;
                maxNum = a[i];
            }
        }
        if (maxIndex == 0 || maxIndex == len - 1) {
            return false;
        }

        for (int i = 0; i < maxIndex; i++) {
            if (a[i] >= a[i + 1]) {
                return false;
            }
        }
        for (int j = len - 1; j > maxIndex; j--) {
            if (a[j] >= a[j - 1]) {
                return false;
            }
        }
        return true;
    }
}
