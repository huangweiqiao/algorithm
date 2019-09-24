package com.hwq.algorithm;

/**
 * 希尔排序
 * 一、希尔排序是基于插入排序，并添加了一些新的特性，从而大大的提高插入排序的执行效率，
 * 二、插入排序的缺陷，多次的移动，假如一个很小的数据在靠右端的位置上，那么要将该数据排序到正确的位置上，
 * 则所有的中间数据都需要向右移动一位。
 * 三、希尔排序的优点：希尔排序通过加大插入排序中元素之间的间隔，并对这些间隔的元素进行插入排序，
 * 从而使得数据可以大幅度的移动，当完成该间隔的排序后，希尔排序会减少数据的间隔再进行排序，依次进行下去
 *
 * 间隔的计算
 * 间隔h的初始值为1，通过h=3*h+1来循环计算，直到该间隔大于数组的大小时停止，最大间隔为不大于数组大小的最大值
 *
 * 间隔的减少
 * 可以通过公式 h=(h-1)/3来计算
 *
 * Created by hwq on 2019/9/10.
 */
public class ShellSort {

    public static void main(String[] args) {
        long [] arr = {10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8};
        sort(arr);
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void sort(long [] arr){
        int count = 0;
        //初始化一个间隔
        int h = 1;
        //计算最大间隔
        while(h < arr.length ){
            h = 3*h+1;
        }
        while(h >0 ){
            //进行插入排序
            long insertValue; //要插入的值
            //一开始就是将i=h,就是要和前面h的数据进行比较
            for (int i=h;i<arr.length;i++){
                insertValue = arr[i];
                int j=i;
                while(j>h-1 && arr[j-h]>=insertValue){
                    arr[j] = arr[j-h];
                    j-=h;
                    count++;
                }
                arr[j] = insertValue;
                count++;
            }
            //减小间隔
            h = (h -1)/3;
        }
        System.out.println("移动了"+count+"次");
    }
}
