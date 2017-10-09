package com.dcb.study.algorithm.eulerproject.utils;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumUtil {

    /**
     * 判断一个数是否是奇数
     *
     * @param num
     * @return
     */
    public static boolean isOdd(long num){
        if (num == 0){
            return false;
        }
        if (num % 2 == 0){
            return false;
        }
        return true;
    }

    /**
     * 分解质因数，将因子从小到大排列
     *
     * @param l
     * @return
     */
    public static List<Long> factorize(long l){
        // 定义返回结果
        List<Long> result = new ArrayList<Long>();

        // 如果为2
        if (l == 2){
            result.add(2l);
            return result;
        }


        // 如果是偶数，不停除以2，直到奇数为止，将2加入返回结果中
        while (!isOdd(l)){
            result.add(2l);
            l = l / 2;
        }

        if (l == 1){
            return result;
        }
        // 如果是合数，则除以最小的质因子，循环判断
        while (!isPrime(l)){
            for (long i = 3; i < l; i += 2){
                if (l % i == 0){
                    l = l / i;
                    result.add(i);
                    break;
                }
            }
        }

        // 将剩下质数加入返回结果中去
        result.add(l);
        return result;
    }

    /**
     * 求出一个整数的所有因子
     * 按从小到大顺序返回返回
     *
     * @param num
     * @return
     */
    public static List<Integer> getFactors(int num){
        // 定义返回结果
        List<Integer> result = new ArrayList<Integer>();
        int temp = num;

        // 循环除以每个正整数，如果能除尽，修改循环次数
        for (int i = 1; i < temp; i++){

            if (num % i == 0){
                result.add(i);
                // 平方根特殊处理
                if (i != num / i)
                    result.add(num / i);
                temp = num / i;
            }
        }
        Collections.sort(result);
        return result;
    }

    /**
     * 判断一个数是不是质数
     *
     * @param num
     * @return
     */
    public static boolean isPrime(long num){
        // 判断是否等于2，如果是返回真
        if (num == 2) return true;

        // 判断是否是偶数，如果是，返回假
        if (!isOdd(num)) return false;

        // 循环除以小于该数平方根对奇数，若存在余数为0的情况，则返回假，不存在，返回真
        long temp = (long) Math.floor(Math.sqrt(num));
        if (temp * temp == num) return false;
        for (int i = 3; i <= temp; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    /**
     * 计算两个数的最小公倍数
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int calculateSmallestMutiple(int num1, int num2){
        // 将两数相乘后除以最大公约数
        int divisor = calculateGreatestDivisor(num1, num2);
        return num1 / divisor * num2;
    }

    /**
     * 计算两个数的最大公约数
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int calculateGreatestDivisor(int num1, int num2){
        // 使用辗转相除法，求最大公约数
        while (num1 > num2 ? num1 % num2 != 0 : num2 % num1 != 0){
            if (num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        return num1 > num2 ? num2 : num1;
    }

    /**
     * 判断两个数是否互质
     *
     * @param num1
     * @param num2
     * @return
     */
    public static boolean isrRelativelyPrime(int num1, int num2) {
        return 1 == calculateGreatestDivisor(num1, num2);
    }
}

