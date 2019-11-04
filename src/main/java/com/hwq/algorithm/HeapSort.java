package com.hwq.algorithm;

/**
 * 堆排序
 * 通过子节点找父节点
 * 父节点索引 = (i-1)/2
 * 通过父节点找子节点
 * 左子节点 = 2 * i +1
 * 右子节点 = 2 * i +2
 *
 * 大顶堆中的 父节点 必须大于等于 其左右子节点
 * Created by hwq on 2019/11/4.
 */
public class HeapSort {

    public static void main(String [] args){
        int [] arr = new int[]{20,5,16,9,1,17,8,6,18,4};
        //1、初始化大顶堆
        initHeap(arr);
        int size = arr.length;
        while (size > 1){
            //2、固定最大值
            swap(arr,0,size-1);
            size --;
            //3、对剩下的数据再次构造大顶堆
            buildBigTopHeap(arr,0,size);
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    //初始化大顶堆，（通过将新插入的数据上升）
    private static  void initHeap(int [] arr){
        for (int i=0;i<arr.length;i++){
            //当前插入的索引
            int currentIndex = i;
            //父节点索引
            int fatcherIndex = (currentIndex - 1)/2;
            /**
             * 如果当前插入的值大于其父节点值则交换值，并且将索引指向父节点
             * 然后继续和上面的父节点值比较，直到不大于父节点，则退出循环
             */
            while (arr[currentIndex] > arr[fatcherIndex]){
                //交换当前节点与父节点值
                swap(arr,currentIndex,fatcherIndex);
                currentIndex = fatcherIndex;
                fatcherIndex = (currentIndex -1)/2;
            }
        }
    }

    //将剩下的数据构成大根堆（通过顶端的数下降）
    private static void buildBigTopHeap(int [] arr,int index,int size){
        int left = 2 * index + 1;
        int right = 2 * index +2;
        while (left < size){
            int largestIndex;
            //判断孩子中较大的值的索引（要确保右孩子在size范围内）
            if (arr[left] < arr[right] && right < size){
                largestIndex = right;
            }else{
                largestIndex = left;
            }
            //比较父节点与较大孩子节点的值，并确定最大值的索引
            if (arr[index] > arr[largestIndex]){
                largestIndex = index;
            }
            //如果父节点的索引是最大值节点的索引，那就认为已经是大顶堆，退出循环
            if (index ==largestIndex){
                break;
            }
            //父节点不是最大值，与孩子中较大的值交换
            swap(arr,largestIndex,index);
            //将索引指向孩子中较大的值的索引
            index = largestIndex;
            //重新计算交换之后的孩子的索引
            left = 2 * index + 1;
            right = 2 * index + 2;
        }
    }

    private static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
