package solution;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Solution187 {

    public static void main(String[] args) {
        Solution187 s = new Solution187();
        System.out.println(JSON.toJSONString(s.findRepeatedDnaSequences("AAAAAAAAAAAA")));
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<String>();
        Set<String> resultSet = new HashSet<String>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String temp = s.substring(i, i + 10);
            if (set.contains(temp)) {
                resultSet.add(temp);
            }
            set.add(temp);
        }
        return new ArrayList<String>(resultSet);
    }
}
