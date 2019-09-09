package com.hwq.algorithm;

/**
 * 冒泡排序
 * Created by hwq on 2019/8/31.
 */
public class BubbleSort {
    public static void sort(long [] arr){
        //i表示已经排序的趟数
        for (int i=0;i<arr.length-1;i++){
            long temp = 0;
            //j从后往前，说明要从最后一个数开始找，将最小的数据往前移，j>i 结束的原因是前面已经排了的就没必要再进行比较了
            for(int j=arr.length-1;j>i;j--){
                if (arr[j] < arr[j-1]){
                    //如果后面的数比前面的数据小则交换数据
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
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
