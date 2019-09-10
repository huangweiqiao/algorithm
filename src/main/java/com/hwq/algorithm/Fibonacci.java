package com.hwq.algorithm;

/**
 * 斐波拉数
 * 第一项0、第二项1，第n项 = 第n-1项 + 第n-2项
 * Created by hwq on 2019/9/9.
 */
public class Fibonacci {

    public static void main(String[] args) {
        testGetNumber();
    }

    public static void testGetNumber(){
        System.out.print(getNumber(0)+" ");
        System.out.print(getNumber(1)+" ");
        System.out.print(getNumber(2)+" ");
        System.out.print(getNumber(3)+" ");
        System.out.print(getNumber(4)+" ");
        System.out.print(getNumber(5)+" ");
        System.out.print(getNumber(6)+" ");
        System.out.print(getNumber(7)+" ");
        System.out.print(getNumber(8)+" ");
        System.out.print(getNumber(9)+" ");
        System.out.print(getNumber(10)+" ");
    }

    public static int getNumber(int n){
        if (n==0){
            return 0;
        }else  if(n==1){
            return 1;
        }else{
            return getNumber(n-1)+getNumber(n-2);
        }
    }
}
