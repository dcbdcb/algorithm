package solution;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {

    public static void main(String[] args) {
        Solution119 s= new Solution119();
        System.out.println(JSON.toJSONString(s.getRow(3)));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }

        if (rowIndex == 1) {
            result.add(1);
            return result;
        }

        List<Integer> l1 = getRow(rowIndex - 1);
        for (int i = 0; i < l1.size() - 1; i++) {
            result.add(l1.get(i) + l1.get(i + 1));
        }
        result.add(1);
        return result;
    }
}
