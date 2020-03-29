package solution;

import java.util.HashSet;
import java.util.Set;

public class Solution219 {

    public static void main(String[] args) {
        Solution219 s = new Solution219();
        System.out.println(s.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(s.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(s.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        k++;
        if (k > nums.length) {
            k = nums.length;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < k; i++) {
            set.add(nums[i]);
        }
        if (set.size() < k) {
            return true;
        }
        for (int i = 0; i < nums.length - k; i++) {
            set.remove(nums[i]);
            set.add(nums[i + k]);
            if (set.size() < k) {
                return true;
            }
        }
        return false;
    }
}
