package com.dcb.study.algorithm.leetcode.code;


import java.util.ArrayList;
import java.util.List;

public class Solution17 {


    public static void main(String[] args) {
        Solution17 s = new Solution17();
        List<String> list = s.letterCombinations("22134");

        System.out.println(list);
    }

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) return new ArrayList();
        String firstDigit = digits.substring(0, 1);
        String remains = digits.substring(1);
        List<String> result = new ArrayList<>();
        List<String> tmpList = letterCombinations(remains);
        List<String> letters = getLetters(firstDigit);
        if (tmpList.isEmpty()) return letters;
        if (letters.isEmpty()) return tmpList;
        for (String str : tmpList) {
            for (String letter : letters) {
                result.add(letter + str);
            }
        }
        return result;
    }

    private List<String> getLetters(String s) {
        int digit = Integer.valueOf(s);
        List<String> result = new ArrayList<String>();
        switch (digit) {
            case 2:
                result.add("a");
                result.add("b");
                result.add("c");
                return result;
            case 3:
                result.add("d");
                result.add("e");
                result.add("f");
                return result;
            case 4:
                result.add("g");
                result.add("h");
                result.add("i");
                return result;
            case 5:
                result.add("j");
                result.add("k");
                result.add("l");
                return result;
            case 6:
                result.add("m");
                result.add("n");
                result.add("o");
                return result;
            case 7:
                result.add("p");
                result.add("q");
                result.add("r");
                result.add("s");
                return result;
            case 8:
                result.add("t");
                result.add("u");
                result.add("v");
                return result;
            case 9:
                result.add("w");
                result.add("x");
                result.add("y");
                result.add("z");
                return result;
            default:
                return new ArrayList<String>();
        }


    }
}
