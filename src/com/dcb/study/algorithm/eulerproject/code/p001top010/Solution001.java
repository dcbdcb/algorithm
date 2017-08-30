package com.dcb.study.algorithm.eulerproject.code.p001top010;

public class Solution001 {

    private static int solution(){
        int sum = 0;
        // 循环每一项，判断满足条件后相加
        for (int i = 0; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    private static int solution2(){
        // 计算项数
        int count3 = (1000 -1 ) / 3;
        int count5 = (1000 - 1) / 5;
        int count15 = (1000 - 1) / 15;

        // 计算末项
        int end3 = 3 * count3;
        int end5 = 5 * count5;
        int end15 = 15 * count15;

        // 等差数列求和
        int sum3 = (3 + end3) * count3 / 2;
        int sum5 = (5 + end5) * count5 / 2;
        int sum15 = (15 + end15) * count15 / 2;

        return sum3 + sum5 - sum15;
    }

    public static void main(String[] args) {
        System.out.println(solution());
        System.out.println(solution2());
    }
}
