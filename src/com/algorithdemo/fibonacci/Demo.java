package com.algorithdemo.fibonacci;

/**
 * 题目：有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。要求用程序来求出一共有多少种走法。
 *
 * （原理：费氏数列）
 *
 * Created by Administrator on 2018/1/6.
 */
public class Demo {

    /**
     * 递归方法实现 (时间复杂度O(2^n))
     * @param n 台阶数
     * @return
     */
    public static int getClimbingWays(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return getClimbingWays(n-1) + getClimbingWays(n-2);

    }

    /***
     * 动态规划算法实现 时间复杂度（O(n)）
     * @param n
     * @return
     */
    public static int getClimbingWays2(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int a = 1;
        int b = 2;
        int temp = 0;

        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

}
