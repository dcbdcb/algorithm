package solution;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {

    public static void main(String[] args) {
        Solution217 s = new Solution217();
        System.out.println(s.containsDuplicate(new int[] {1,2,3,1}));
        System.out.println(s.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
        System.out.println(s.containsDuplicate(new int[] {1,2,3,4}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer num : nums) {
            set.add(num);
        }
        return nums.length > set.size();
    }
}
