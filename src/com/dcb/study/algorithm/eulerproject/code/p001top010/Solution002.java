package com.dcb.study.algorithm.eulerproject.code.p001top010;

public class Solution002 {

    public static int solution(){

        // 定义返回结果
        int result = 0;

        // 定义斐波那契数列的项
        int a = 0;
        int b = 1;

        do {
            // 如果满足条件，则相加
            if (b % 2 == 0)
                result += b;

            // 计算下一项
            b = a + b;
            a = b - a;
        } while(b < 4000000);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
