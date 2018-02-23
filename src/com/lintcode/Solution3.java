package com.lintcode;

/**
 * 3. 统计数字
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 *
 * 样例
 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
 *
 */

public class Solution3 {

    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        if(n == 0 && k == 0)
            return 1; // 特殊情况
        int temp = n, cnt = 0, pow = 1;//pow代表当前位的后面低位是多少，1为个位，10为十位，100位千位
        while(temp != 0) {
            int digit = temp % 10; // 根据当前位置数和k的大小关系，可以算出当前位置出现过k的次数
            if(digit < k)
                cnt += (temp / 10) * pow;
            else if(digit == k)
                cnt += (temp / 10) * pow + (n - temp * pow + 1);
            else {
                if(!(k == 0 && temp / 10 == 0)) // 排除没有更高位时，寻找的数为0的情况
                    cnt += (temp / 10 + 1) * pow;
            }
            temp /= 10;
            pow *= 10;
        }
        return cnt;
    }
}
