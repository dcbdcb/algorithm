package com.dcb.study.algorithm.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Solution677 {

    public static void main(String[] args) {

        MapSum s = new MapSum();
        s.insert("apple", 3);
        s.sum("ap");
        s.insert("app", 2);
        s.sum("ap");
    }



}

class MapSum {

    private Map<String, Integer> sumMap;
    private Map<String, Integer> map;

    /** Initialize your data structure here. */
    public MapSum() {
        sumMap = new HashMap<String, Integer>();
        map = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        Integer oldVal = map.get(key) == null ? 0 : map.get(key);

        for (int i = 0; i < key.length(); i++) {
            String tmpKey = key.substring(0, i + 1);
            Integer tmpVal = sumMap.get(tmpKey) == null ? 0 : sumMap.get(tmpKey);
            sumMap.put(tmpKey, tmpVal - oldVal + val);
        }
        map.put(key, val);

    }

    public int sum(String prefix) {
        return sumMap.get(prefix) == null ? 0 : sumMap.get(prefix);
    }
}