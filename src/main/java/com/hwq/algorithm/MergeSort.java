package com.hwq.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 归并排序
 * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好得多，因为始终都是O(nlogn)的时间复杂度，
 * 代价是需要额外的内存空间。归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法的一个非常典型的应用。
 * 归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列间有序。
 * 若将两个有序表合并成一个有序表，称为2-路归并
 *
 * 首先把长度为n的输入序列分为两个长度为 n/2的子序列
 * 然后对两个子序列分别采用归并排序
 * 再将两个排好的子序列合并成一个最终的排序序列。
 * Created by hwq on 2019/10/13.
 */
public class MergeSort {

    public static void main(String[] args) {
        int [] array = new int[]{10,1,8,5,98,24,0,77,23,29,25};
        array = mergeSort(array);
        display(array);
    }

    public static int [] mergeSort(int [] array){
        if(array.length<2){
            return array;
        }
        int mid = array.length/2;
        int [] left = Arrays.copyOfRange(array,0,mid);
        int [] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    public static int [] merge(int [] left,int [] right){
        int [] result = new int [left.length+right.length];
        for (int i=0,j=0,index=0;index<result.length;index++){
            if(i >= left.length){
                result[index]=right[j++];
            }else if(j >= right.length){
                result [index] = left[i++];
            }else if(left[i] > right[j]){
                result[index]=right[j++];
            }else{
                result [index] = left[i++];
            }
        }
        return result;
    }


    public static void  display(int [] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

}
