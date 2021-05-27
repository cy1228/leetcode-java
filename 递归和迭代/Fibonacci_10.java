package com.leetcode.递归和迭代;

import java.util.ArrayList;

// 剑指 Offer 10- I. 斐波那契数列
// 剑指 Offer 10- II. 青蛙跳台阶问题
public class Fibonacci_10 {
    public static void main(String[] args) {
        System.out.println(fib(45));
    }

    public static int fib(int n) {
        if (n < 2) return n;
        // 动态规划
//        long[] arr = new long[n + 1];
//        arr[0] = 0;
//        arr[1] = 1;
//        for(int i = 2; i <= n; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//            arr[i] %= 1000000007;
//        }
//        return (int)arr[n];

        // 循环取余法
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n - 1; i ++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;

    }
}
