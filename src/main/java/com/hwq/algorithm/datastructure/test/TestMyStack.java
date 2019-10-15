package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.MyStack;

/**
 * Created by hwq on 2019/9/1.
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack ms = new MyStack(10);
        ms.push(50);
        ms.push(40);
        ms.push(90);
        ms.push(70);
        ms.push(10);

        System.out.println("ms.isEmpty() = [" + ms.isEmpty() + "]");

        System.out.println("ms.peek() = [" + ms.peek() + "]");

        System.out.println("ms.pop() = [" + ms.pop() + "]");

        System.out.print("[");
        while (!ms.isEmpty()){
            System.out.print( ms.pop()+" ");
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("ms.isEmpty() = [" + ms.isEmpty() + "]");

    }
}
