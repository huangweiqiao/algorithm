package com.hwq.algorithm;

/**
 * 插入排序，
 * 通过构建有序序列（第一个数据可以当着是已经有序的序列），对于未排序数据（有序序列后的第一个数据），
 * 在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，通常采用in-place排序（即只需用
 * 到0(1)的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 *
 * 关键就是找到插入点，一个序列中从第二个值开始，假设他前面的值都是有序。
 *
 * 1、从第一个元素开始，该元素可以认为已经被排序
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 3、如果已排序元素大于新元素，将已排序元素移到下一个位置
 * 4、重复步骤3，直到找到已排序的元素小于或等于新元素的位置
 * 5、将新元素插入到该位置后
 * 6、重复步骤2~5
 *
 * Created by hwq on 2019/8/31.
 */
public class InsertSort {
    public static void sort(long []arr){
        long insertValue; //要插入的值
        //一开始就是将i=1,就是要和前面的数据进行比较，如果i=0了，前面都没数据没办法比较
        for (int i=1;i<arr.length;i++){
            insertValue = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>=insertValue){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = insertValue;
        }
    }

    public static void  display(long [] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        long [] arr = new long[]{59,10,99,25,66,92,88};
        sort(arr);
        display(arr);
    }
}
