package solution;

import com.alibaba.fastjson.JSON;

public class Solution167 {

    public static void main(String[] args) {
        Solution167 s = new Solution167();
        int[] a = {2, 7, 11, 15};

        System.out.println(JSON.toJSONString(s.twoSum(a, 9)));
        System.out.println(JSON.toJSONString(s.twoSum2(a, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int[] result = new int[2];
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                int[] result = new int[2];
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return null;


    }

}
