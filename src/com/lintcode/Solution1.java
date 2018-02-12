package com.lintcode;

/**
 * 1. A + B 问题
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 *
 * 挑战：显然你可以直接 return a + b，但是你是否可以挑战一下不这样做？
 */

public class Solution1 {

    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        if (a == 0) {
            return b;
        }
        if (b == 0){
            return a;
        }
        int c = a ^ b;
        int d = (a & b)<<1;
        return aplusb(c, d);
    }
}
