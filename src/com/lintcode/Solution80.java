package com.lintcode;

import java.util.Arrays;

/**
 * 给定一个未排序的整数数组，找到其中位数。

 中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。

 样例
 给出数组[4, 5, 1, 2, 3]， 返回 3

 给出数组[7, 9, 4, 5]，返回 5
 */
public class Solution80 {

    /*
     * @param : A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        // write your code here
        Arrays.sort(nums);
        int len = nums.length;
        int i = len % 2 ==0 ? len/2:len/2+1;
        return nums[i-1];
    }

}
