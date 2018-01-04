package com.algorithdemo.stack;

import java.util.Stack;
/**
 * 一个有getMin功能的栈
 * 题目描述：实现一个特殊的栈，在栈的基本功能上，再实现返回栈中最小元素的操作
 */
public class MyStack {
    
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    
    public MyStack(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    /**
     * 入栈
     * @param num
     */
    public void push(int num) {
        if(stackMin.isEmpty()){
        	this.stackData.push(num);
        }else if(num <= this.getMin()){
        	this.stackMin.push(num);
        }
        this.stackData.push(num);
    }
    
    /**
     * 出栈
     * @return
     */
    public int pop(){
        if(this.stackData.isEmpty()){
        	throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value==this.getMin()){
        	this.stackMin.pop();
        }
        return value;
    }
    
    /**
     * 返回栈的最小元素
     * @return
     */
    public int getMin(){
    	if(this.stackMin.isEmpty()){
    		throw new RuntimeException("Your stack is empty.");
    	}
        return this.stackMin.peek();
    }
}
