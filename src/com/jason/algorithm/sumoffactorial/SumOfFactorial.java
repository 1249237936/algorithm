package com.jason.algorithm.sumoffactorial;

/**
 * 阶乘累加
 */
public class SumOfFactorial {


    public static long f2(int n) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(f2(1));//1! -> 1
        System.out.println(f2(2));//1! + 2! -> 1 + 1 X 2
        System.out.println(f2(3));//1! + 2! + 3! -> 1 + 1 X 2 + 1 X 2 X 3
        System.out.println(f2(4));//
    }
}
