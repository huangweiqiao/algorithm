package com.hwq.algorithm;

/**
 * 插入排序，关键就是找到插入点，一个序列中从第二个值开始，假设他前面的值都是有序。
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
