package com.hwq.algorithm;

import com.hwq.algorithm.datastructure.MyOrderArray;

/**
 * 二分查找法
 * Created by hwq on 2019/8/31.
 */
public class BinarySearch {

    public static void main(String[] args) {
        //二分查找前要确保数组中的数据是有序的。
        MyOrderArray ma = new MyOrderArray();
        ma.insert(2);
        ma.insert(3);
        ma.insert(8);
        ma.insert(6);
        ma.insert(9);
        ma.display();
        System.out.println(binarySearch(ma,10));
    }

    /**
     * 二分查找
     * @param ma
     * @param value
     * @return
     */
    public static int binarySearch(MyOrderArray ma,long value){
        int middle = 0;
        int low = 0;
        int pow = ma.elements;
        while(true){
            middle = (pow+low)/2;
            if (ma.arr[middle]==value){
                return middle;
            }else if (low > pow){
                return -1;
            }else{
                if(ma.arr[middle] > value){
                    pow = middle -1;
                }else{
                    low = middle + 1;
                }
            }
        }
    }
}
