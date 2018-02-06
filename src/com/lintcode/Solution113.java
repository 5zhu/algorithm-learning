package com.lintcode;
/**
 * lintCode 题目113：最长单词
 *
 * 描述：给一个词典，找出其中所有最长的单词
 *
 * 样例 {"dog","google","facebook","internationalization","blabla"}
 *
 * 返回 ["internationalization"]
 *
 * 挑战：遍历两次的办法很容易想到，如果只遍历一次你有没有什么好办法？
 */

import java.util.List;
import java.util.Stack;

/**
 * Created by gegf on 2018/2/6.
 */
public class Solution113 {

    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        if(dictionary==null || dictionary.length==0){
            return null;
        }
        Stack<String> maxLenStack = new Stack<String>();
        maxLenStack.push(dictionary[0]);
        int maxLength = dictionary[0].length();
        for (int i = 1; i < dictionary.length; i++) {
            if(dictionary[i].length() > maxLength){
                maxLength = dictionary[i].length();
                maxLenStack.clear();
                maxLenStack.push(dictionary[i]);
            }else if(dictionary[i].length() == maxLength){
                maxLenStack.push(dictionary[i]);
            }else{
                continue;
            }
        }

        return maxLenStack;
    }
}
