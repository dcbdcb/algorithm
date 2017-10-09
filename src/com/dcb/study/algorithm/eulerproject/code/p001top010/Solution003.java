package com.dcb.study.algorithm.eulerproject.code.p001top010;

import com.dcb.study.algorithm.eulerproject.utils.NumUtil;
import java.util.List;


public class Solution003 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static long solution(){
        // 对改数进行分解质因数计算，取最后一位
        List<Long> factors = NumUtil.factorize(600851475143l);
        return factors.get(factors.size() - 1);
    }
}
