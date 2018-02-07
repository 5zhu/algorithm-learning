package com.lintcode;

/**
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写
 */
public class Solution55 {

    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.length() < B.length()){
            return false;
        }
        int [] achar = new int[26];
        int [] bchar = new int[26];
        for (int i = 0; i < A.length(); i++) {
            achar[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++) {
            bchar[B.charAt(i) - 'A']++;
        }
        for(int i = 0; i < 26; ++i) {
            if(bchar[i] > achar[i]){
                return false;
            }
        }
        return true;
    }


}
