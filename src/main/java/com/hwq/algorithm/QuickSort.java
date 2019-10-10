package com.hwq.algorithm;

/**
 * 一、快速排序的思想
 * 快速排序通过将一个数组划分成两个子数组，然后通过递归调用自身，为每一个子数组进行快速排序来实现。
 * 二、如何划分
 * 设定关键字，将比关键字小的数据放在一组，比关键字大的放在另一组
 * 三、如何自动设定关键字
 * 设置数组最左端的数据为关键字
 * Created by hwq on 2019/9/26.
 */
public class QuickSort {

    public static void main(String[] args) {
        long [] arr = new long[]{59,10,99,25,66,92,23,88};
        sort( arr,0,arr.length-1);
        display(arr);
    }

    /**
     * 划分数组
     */
    public static int partition(long arr[],int left,int right){
        long point = arr[left];
        int leftPtr = left;
        int rightPtr = right;
        while (leftPtr!=rightPtr){
            //循环 将比关键字大的留在右端
            while (leftPtr < rightPtr && arr[rightPtr] > point){
                rightPtr--;
            }
            if(leftPtr<rightPtr){
                arr[leftPtr] = arr[rightPtr];
                leftPtr++;
            }
            //循环 将比关键字小的留在左端
            while (leftPtr < rightPtr && arr[leftPtr] < point){
                leftPtr++;
            }
            if(leftPtr < rightPtr){
                arr[rightPtr]=arr[leftPtr];
                rightPtr--;
            }
            arr[leftPtr] = point;
        }
        arr[leftPtr] = point;
        return leftPtr;
    }


    public static void sort(long arr[],int left,int right){
        if(right-left<=0){
            return;
        }else{
            int point = partition(arr,left,right);
            sort(arr,left,point-1);
            sort(arr,point+1,right);
        }

    }

    public static void  display(long [] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
