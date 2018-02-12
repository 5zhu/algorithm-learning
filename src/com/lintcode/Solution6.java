package com.lintcode;

import java.util.Arrays;

/**
 6. 合并排序数组 II
 * 样例
 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 */
public class Solution6 {

    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int [] res = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            res[A.length+i] = B[i];
        }
        Arrays.sort(res);
        return res;
    }
}
