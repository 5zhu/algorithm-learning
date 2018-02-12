package com.lintcode;

/**
 * 2. 尾部的零
 * 设计一个算法，计算出n阶乘中尾部零的个数
 *
 * 样例
 11! = 39916800，因此应该返回 2
 *
 * O(logN)的时间复杂度
 */

public class Solution2 {

    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count = 0;
        while (n > 0){
            count += n / 5;
            n /= 5;
        }
        return count;
   }
}
