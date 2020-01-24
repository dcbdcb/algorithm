package solution;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution914 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,3,2,1};
        Solution914 s = new Solution914();
        System.out.println(s.hasGroupsSizeX(a));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        if (len == 0 || len == 1) {
            return false;
        } else if (len == 2) {
            return deck[0] == deck[1];
        }
        Arrays.sort(deck);
        Set<Integer> factorSet = new HashSet<Integer>();
        while (len != 1) {
            int factor = getPrimerFactor(len);
            if (factor != 1) {
                factorSet.add(factor);
            }
            len /= factor;
        }

        Iterator<Integer> it = factorSet.iterator();
        System.out.println(JSON.toJSONString(factorSet));
        while (it.hasNext()) {
            int temp = it.next();
            for (int i = 0; i < deck.length; i = i + temp) {
                if (deck[i] != deck[i + temp - 1]) {
                    break;
                }
                if (i + temp == deck.length) {
                    return true;
                }
            }
        }
        return false;
    }

    private int getPrimerFactor(int s) {
        if (s % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(s); i = i + 2) {
            if (s % i == 0) {
                return i;
            }
        }
        return s;
    }

}
