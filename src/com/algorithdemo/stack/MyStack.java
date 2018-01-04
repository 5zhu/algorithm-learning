package com.algorithdemo.stack;

import java.util.Stack;
/**
 * һ����getMin���ܵ�ջ
 * ��Ŀ������ʵ��һ�������ջ����ջ�Ļ��������ϣ���ʵ�ַ���ջ����СԪ�صĲ���
 */
public class MyStack {
    
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    
    public MyStack(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    /**
     * ��ջ
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
     * ��ջ
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
     * ����ջ����СԪ��
     * @return
     */
    public int getMin(){
    	if(this.stackMin.isEmpty()){
    		throw new RuntimeException("Your stack is empty.");
    	}
        return this.stackMin.peek();
    }
}
