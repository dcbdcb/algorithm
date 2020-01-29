package solution;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution137 {

    public static void main(String[] args) {
        Solution137 s = new Solution137();
        System.out.println(s.singleNumber(new int[] {2,2,3,2}));
        System.out.println(s.singleNumber(new int[] {0,1,0,1,0,1,99}));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> resultSet = new HashSet<Integer>();
        Set<Integer> differNum = new HashSet<Integer>();
        for (Integer num : nums) {
            if (differNum.contains(num)) {
                resultSet.remove(num);
                continue;
            }
            resultSet.add(num);
            differNum.add(num);
        }
        Iterator it = resultSet.iterator();
        return (Integer) it.next();
    }
}
