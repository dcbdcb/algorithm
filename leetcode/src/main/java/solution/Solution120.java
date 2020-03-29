package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120 {

    public static void main(String[] args) {
        Solution120 s = new Solution120();
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Integer[] a1 = {2};
        List<Integer> l1 = Arrays.asList(a1);
        l.add(l1);
        Integer[] a2 = {3, 4};
        List<Integer> l2 = Arrays.asList(a2);
        l.add(l2);
        Integer[] a3 = {6, 5, 7};
        List<Integer> l3 = Arrays.asList(a3);
        l.add(l3);
        Integer[] a4 = {4, 1, 8, 3};
        List<Integer> l4 = Arrays.asList(a4);
        l.add(l4);
        System.out.println(s.minimumTotal(l));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        List<Integer> minList = new ArrayList<Integer>();
        for (int i = 0; i < l; i++) {
            List<Integer> list = triangle.get(i);
            if (i == 0) {
                minList.add(list.get(0));
                continue;
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                for (int j = 0; j < list.size(); j++) {
                    if (j == 0) {
                        temp.add(minList.get(j) + list.get(j));
                    } else if (j == list.size() - 1) {
                        temp.add(minList.get(j - 1) + list.get(j));
                    } else {
                        temp.add(Math.min(minList.get(j - 1), minList.get(j)) + list.get(j));
                    }
                }
                minList.clear();
                minList = temp;
            }
        }

        int result = minList.get(0);
        for (Integer num : minList) {
            if (num < result) {
                result = num;
            }
        }
        return result;
    }
}
