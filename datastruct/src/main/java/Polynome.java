import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polynome {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] strArr1 = a.split("\\s+");
        int l1 = Integer.parseInt(strArr1[0]) * 2;
        int[] arr1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            int tempIndex = i;
            arr1[i] = Integer.parseInt(strArr1[i + 1]);
        }
        String b = in.nextLine();
        String[] strArr2 = b.split("\\s+");
        int l2 = Integer.parseInt(strArr2[0]) * 2;
        int[] arr2 = new int[l2];
        for (int i = 0; i < l2; i++) {
            int tempIndex = i;
            arr2[i] = Integer.parseInt(strArr2[i + 1]);
        }

        int[] multiResult = multiple(arr1, arr2);
        if (multiResult.length == 0) {
            multiResult = new int[]{0, 0};
        }
        int[] addResult = add(arr1, arr2);
        if (addResult.length == 0) {
            addResult = new int[]{0, 0};
        }
        for (int i = 0; i < multiResult.length; i++) {
            if (i < multiResult.length - 1) {
                System.out.print(multiResult[i] + " ");
            } else {
                System.out.println(multiResult[i]);
            }
        }
        for (int i = 0; i < addResult.length; i++) {
            if (i < addResult.length - 1) {
                System.out.print(addResult[i] + " ");
            } else {
                System.out.println(addResult[i]);
            }
        }
    }

    static int[] add(int[] a, int[] b) {
        if (a.length == 0)
            return b;
        if (b.length == 0)
            return a;
        int l1 = 1;
        int l2 = 1;
        List<Integer> addResult = new ArrayList<Integer>();
        // 当2个下标没有移动到数组末尾时，循环比较
        while (l1 <= a.length - 1 && l2 <= b.length - 1) {
            if (a[l1] > b[l2]) {
                addResult.add(a[l1 - 1]);
                addResult.add(a[l1]);
                l1 = l1 + 2;
            } else if (a[l1] < b[l2]) {
                addResult.add(b[l2 - 1]);
                addResult.add(b[l2]);
                l2 = l2 + 2;
            } else {
                if (a[l1 - 1] + b[l2 - 1] != 0) {
                    addResult.add(a[l1 - 1] + b[l2 - 1]);
                    addResult.add(a[l1]);
                }
                l1 = l1 + 2;
                l2 = l2 + 2;
            }
        }
        if (l1 < a.length) {
            for (int i = l1 - 1; i < a.length; i++) {
                addResult.add(a[i]);
            }
        }
        if (l2 < b.length) {
            for (int i = l2 - 1; i < b.length; i++) {
                addResult.add(b[i]);
            }
        }
        int[] result = new int[addResult.size()];
        for (int i = 0; i < addResult.size(); i++) {
            result[i] = addResult.get(i);
        }
        return result;
    }

    static int[] multiple(int[] a, int[] b) {
        int[] result = {};
        for (int i = 0; i < a.length; i = i + 2) {
            int[] temp = new int[b.length];
            for (int j = 0; j < b.length; j++) {
                if (j % 2 == 0) {
                    temp[j] = a[i] * b[j];
                } else {
                    temp[j] = a[i + 1] + b[j];
                }
            };
            result = add(result, temp);
        }
        return result;
    }


//15 24 -25 22 30 21 -10 20 -21 8 35 6 -33 5 14 4 -15 3 18 2 -6 1


}

