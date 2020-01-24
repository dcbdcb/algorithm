package solution;

import com.alibaba.fastjson.JSON;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution349 {

    public static void main(String[] args) {
        Solution349 s = new Solution349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2};
        System.out.println(JSON.toJSONString(s.intersection(nums1, nums2)));
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l1 == 0 || l2 == 0) {
            return new int[0];
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            result[k] = it.next();
            k++;
        }
        return result;
    }
}
