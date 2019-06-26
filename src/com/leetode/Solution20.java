package com.leetode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character,Character> maps = new HashMap();
        maps.put(')', '(');
        maps.put(']', '[');
        maps.put('}', '{');
        char[] sarr = s.toCharArray();
        for(int i = 0; i < sarr.length; i++){
            if(!maps.containsKey(sarr[i])){
                stack.push(sarr[i]);
            }else if(stack.empty() || maps.get(sarr[i]) != stack.pop()){
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "(){{}}[(]";
        System.out.println(isValid(s1));
    }
}
