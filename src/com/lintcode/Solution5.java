package com.lintcode;

import java.util.Arrays;

/**
 * 5. 第k大元素  在数组中找到第k大的元素
 *
 * 样例
 给出数组 [9,3,2,4,8]，第三大的元素是 4

 给出数组 [1,2,3,4,5]，第一大的元素是 5，第二大的元素是 4，第三大的元素是 3，以此类推
 */
public class Solution5 {

    /*
    * @param k : description of k
    * @param nums : array of nums
    * @return: description of return
    */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        // write your code here
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
