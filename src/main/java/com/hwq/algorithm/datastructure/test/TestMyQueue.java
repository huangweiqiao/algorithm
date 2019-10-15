package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.MyQueue;

/**
 * Created by hwq on 2019/9/1.
 */
public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
        mq.insert(20);
        mq.insert(30);
        mq.insert(40);
        mq.insert(50);
        mq.insert(60);
        mq.insert(70);
        mq.insert(80);
        System.out.println("mq.isFull()"+mq.isFull());
        System.out.println("mq.remove()"+mq.remove());
        System.out.println("mq.remove()"+mq.remove());
    }

}
