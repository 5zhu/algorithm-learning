package com.lintcode;

import java.util.Stack;

/**
 * lintCode 44 用栈实现队列
 *
 * Created by gegf on 2018/2/11.
 */
public class MyQueue {

    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public MyQueue() {
        // do intialization if necessary
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        stackPush.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("QUEUE IS EMPTY");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("QUEUE IS EMPTY");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
