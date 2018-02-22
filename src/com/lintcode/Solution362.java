package com.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *  362.滑动窗口的最大值
 *
 *  给出一个可能包含重复的整数数组，和一个大小为 k 的滑动窗口, 从左到右在数组中滑动这个窗口，找到数组中每个窗口内的最大值。
 *
 *  样例
    给出数组 [1,2,7,7,8], 滑动窗口大小为 k = 3. 返回 [7,7,8].

 最开始，窗口的状态如下：

 [|1, 2 ,7| ,7 , 8], 最大值为 7;

 然后窗口向右移动一位：

 [1, |2, 7, 7|, 8], 最大值为 7;

 最后窗口再向右移动一位：

 [1, 2, |7, 7, 8|], 最大值为 8.
 */
public class Solution362 {

    /*
     * @param nums: A list of integers
     * @param k: An integer
     * @return: The maximum number inside the window at each moving
     */
    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // write your code here
        if (nums == null || k < 1 || nums.length < k){
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i ++){
            while (!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst() == i - k){
                qmax.pollFirst();
            }
            if(i >= k - 1){
                res[index++] = nums[qmax.peekFirst()];
            }
        }
        Arrays.stream(res).forEach(n -> result.add(n));
        return result;
    }
}
