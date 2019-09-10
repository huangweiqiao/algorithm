package com.hwq.algorithm;

/**
 * 递归
 * Created by hwq on 2019/9/9.
 */
public class Recursion {
    public static void main(String[] args) {
         test(10);
    }

    public static void test( int n){
        if(n<=0) return;
            System.out.println("Hello World");
        n--;
        test(n);
    }
}
