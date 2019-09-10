package com.hwq.algorithm;

/**
 * 三角数  1 3 6 10 15 21 28 36 45 55
 * Created by hwq on 2019/9/9.
 */
public class Triangle {

    public static void main(String[] args) {
        testGetNumber();
        System.out.println();
        testRecursion();
    }

    public static void testGetNumber(){
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

    public static void testRecursion(){
        System.out.print(recursion(10)+" ");
    }

    public static int getNumber(int n){
        int total = 0;
        while(n>0){
            total = total + n;
            n--;
        }
        return total;
    }

    public static int  recursion(int n){
        if(n>0){
            return n+recursion(n-1);
        }
       return 0;
    }

}
