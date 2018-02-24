package com.lintcode;

/**
 * 49. 字符大小写排序
 * 给定一个只包含字母的字符串，按照先小写字母后大写字母的顺序进行排序。
 *
 * 样例
   给出"abAcD"，一个可能的答案为"acbAD"
 */
public class Solution49 {

    /*
    * @param chars: The letter array you should sort by Case
    * @return: nothing
    */
    public void sortLetters(char[] chars) {
        // write your code here
        char temp = ' ';
        int j = chars.length - 1;
        for (int i = 0; i <= j; i++) {
            if(Character.isLowerCase(chars[i])){
                continue;
            }else{
                while(Character.isUpperCase(chars[j])){
                    if(j <= i){
                        break;
                    }
                    j --;
                }
                temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
            }
        }
    }
}
