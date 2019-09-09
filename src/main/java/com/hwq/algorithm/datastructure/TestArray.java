package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/8/31.
 */
public class TestArray {
    public static void main(String [] args){
        MyOrderArray ma = new MyOrderArray();
        ma.insert(2);
        ma.insert(3);
        ma.insert(9);
        ma.insert(6);
        ma.insert(8);
        ma.display();
        System.out.println();
        System.out.println(ma.binarySearch(6));

    }


}
