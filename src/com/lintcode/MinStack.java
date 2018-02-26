package com.lintcode;

import java.util.Stack;

/**
 *12. 带最小值操作的栈.
 *
 * 实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。

 你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。
 */
public class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack(){
        // do intialization if necessary
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        if(stackMin.isEmpty()){
            this.stackMin.push(number);
        }else if(number <= this.min()){
            this.stackMin.push(number);
        }
        this.stackData.push(number);
    }

    /*
    * @return: An integer
    */
    public int pop(){
        // write your code here
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value == this.min()){
            this.stackMin.pop();
        }
        return value;
    }

    /*
     * @return: An integer
     */
    public int min(){
        // write your code here
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(1);
        s.pop();
        s.push(2);
        s.push(3);
        int i = s.min();
        System.out.println(i);
    }
}
