package com.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 9. Fizz Buzz 问题
 *
 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：

 如果这个数被3整除，打印fizz.
 如果这个数被5整除，打印buzz.
 如果这个数能同时被3和5整除，打印fizz buzz
 */
public class Solution9 {

    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i ++){

            if(i % 3 == 0 && i % 5 != 0){
                list.add("fizz");
            }else if(i % 3 != 0 && i % 5 == 0){
                list.add("buzz");
            }else if(i % 3 == 0 && i % 5 == 0){
                list.add("fizz buzz");
            }else {
                list.add(i + "");
            }
        }
        return list;
    }
}
