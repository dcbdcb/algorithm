package solution;

import java.util.HashSet;
import java.util.Set;

public class Solution575 {

    public static void main(String[] args) {
        Solution575 s = new Solution575();
        System.out.println(s.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
    }

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(candies.length / 2, set.size());
    }
}
