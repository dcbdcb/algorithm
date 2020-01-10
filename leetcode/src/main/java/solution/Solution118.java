package solution;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {

    public static void main(String[] args) {
        Solution118 s = new Solution118();
        System.out.println(JSON.toJSONString(s.generate(5)));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> first = new ArrayList<Integer>(1);
        first.add(1);
        result.add(first);
        if (numRows == 1) {
            return result;
        }
        int line = 2;
        List<Integer> temp = first;
        while (line <= numRows) {
            List<Integer> list = new ArrayList<Integer>(line);
            for (int i = 0; i < line; i++) {
                if (i == 0 || i == line - 1) {
                    list.add(1);
                } else {
                    list.add(0);
                }
            }

            if (temp.size() >= 2) {
                for (int j = 0; j < temp.size() - 1; j++) {
                    list.set(j + 1, temp.get(j) + temp.get(j + 1));
                }
            }
            temp = list;
            result.add(list);
            line++;
        }
        return result;
    }

}
