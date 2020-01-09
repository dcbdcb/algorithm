package solution;

public class Solution1089 {

    public static void main(String[] args) {
        Solution1089 s = new Solution1089();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        s.duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void duplicateZeros(int[] arr) {
        boolean flag = false;
        int zeroCount = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                flag = true;
            } else {
                if (flag) {
                    zeroCount++;
                }
            }
        }

        flag = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (zeroCount == 0) {
                return;
            }

            if (arr[i] != 0) {
                flag = true;
                if (i >= arr.length - zeroCount) {
                    arr[i] = 0;
                } else {
                    arr[i + zeroCount] = arr[i];
                    arr[i] = 0;
                }
            } else {
                if (flag) {
                    zeroCount--;
                }
            }
        }

    }
}