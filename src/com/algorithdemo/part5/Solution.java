package com.algorithdemo.part5;

/**
 * 题目： 判断两个字符串是否为互为旋转词
 * Created by Administrator on 2018/2/12.
 */
public class Solution {

    public boolean isRotation(String a, String b){
        if (a == null | b == null || a.length() != b.length()){
            return false;
        }
        String c = b + b;
        return getIndexOf(c, a) != -1; //KMP算法
    }

}
