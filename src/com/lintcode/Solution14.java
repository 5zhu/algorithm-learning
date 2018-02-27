package com.lintcode;

/**
 * 14. 二分查找
 *
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 */
public class Solution14 {

    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int length=nums.length;
        int pos=length/2;

        //目标值比最小值还要小或者比最大值还要大，则肯定不在数组中
        if(nums[0]>target||nums[length-1]<target){
            return -1;
        }

        //如果pos处的值比目标值还要大，那么目标值只可能出现在pos的左边
        while(nums[pos]>target){
            pos=pos/2;
        }

        //pos处的值小于或者等于目标值，那么目标值可能的范围就是[pos，pos*2]；
        for(int j=pos;j<=pos*2;j++){
            if(nums[j]==target){
                pos=j;
                break;
            }
            //遍历到pos*2位置了，还没找到目标值，那么目标值肯定不在数组中
            if((j==pos*2)&&(nums[j]!=target)){
                return -1;
            }
        }

        //这样只是保证pos处的值是目标值，但不一定是第一次出现的
        //因此，比较pos前面一个元素的值与pos处的值是否相等，若相等，则pos往前挪一个
        while((pos>=1)&&(nums[pos]==nums[pos-1])){
            pos--;
        }

        return pos;
    }
}
