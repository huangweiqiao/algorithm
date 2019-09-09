package com.hwq.algorithm.datastructure;

/**
 * 栈
 * Created by hwq on 2019/9/1.
 */
public class MyStack {
    private long [] arr;
    private int top; //表示栈顶

    public MyStack(){
        arr = new long[10];
        top = -1;
    }

    public MyStack(int maxsize){
        arr = new long[maxsize];
        top = -1;
    }

    /**
     * 添加数据
     * @param value
     */
    public void push(int value){
        arr[++top] = value;
    }

    /**
     * 移除栈顶数据
     * @return
     */
    public long pop(){
        return arr[top--];
    }

    /**
     * 查看栈顶数据
     */
    public long peek(){
        return arr[top];
    }

    /**
     * 是否是空
     * @return
     */
    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * 是否已满
     * @return
     */
    public boolean isFull(){
        return top==arr.length-1;
    }

}
