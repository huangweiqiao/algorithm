package com.hwq.algorithm;

/**
 * 选择排序
 * Created by hwq on 2019/8/31.
 */
public class SelectSort {
    public static void sort(long [] arr){
        int k=0;//k很关键，用来记录最小数据的位置
        long temp = 0;
        //i 表示的是已经排好序的位置，也就是说已经循环的趟数
        for (int i=0;i<arr.length-1;i++){
            k = i;//后面数最开始就是要和i位置的数据进行比较，所以每一趟循环之后k的初始值就是i
            for(int j=i;j<arr.length;j++){ // j = i,表示i以前的数据已经拍好序了，不需要参与比较，这里和冒泡不同，冒泡是从后往前循环。
                if(arr[j] < arr[k]){
                    k = j; // 总是要指向最小数据的位置
                }
            }
            //交换数据,相对冒泡排序这种排序数据交换的次数就要少了，这里一个循环只交换一次，而冒泡会交换多次，所以效率改方法效率比冒泡要高点
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
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
