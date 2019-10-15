package com.hwq.algorithm.datastructure;

/**
 * 有序数组
 * Created by hwq on 2019/8/31.
 */
public class MyOrderArray {
    public long [] arr;
    //有效数据的长度
    public int elements;

    public MyOrderArray(){
        arr = new long[50];
    }

    public MyOrderArray(int maxsize){
        arr = new long[maxsize];
    }

    /**
     *添加数据
     * @param value
     */
    public void insert(long value){
         int i;
         for (i=0;i<elements;i++){
             if(arr[i]>value){
                 break;
             }
         }

         for(int j=elements;j>i;j--){
             arr[j] = arr[j-1];
         }
         arr[i] = value;
        elements++;
    }

    /**
     * 显示数据
     */
    public void display(){
        System.out.print("[");
        for (int i=0;i<elements;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public int search(long value){
        int i;
        for ( i=0;i<elements;i++){
            if(value == arr[i]){
                break;
            }
        }
        if(i==elements){
            return -1;
        }
        return i;
    }

    /**
     * 二分查找法
     * @param value
     * @return
     */
    public int binarySearch(long value){
        int middle = 0;
        int low = 0;
        int pow = elements;
        while(true){
            middle = (pow+low)/2;
            if (arr[middle]==value){
                return middle;
            }else if (low > pow){
                return -1;
            }else{
                if(arr[middle] > value){
                    pow = middle -1;
                }else{
                    low = middle + 1;
                }
            }
        }
    }


    public long get(int index){
        if (index >= elements ||
                index <0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void delete(int index){
        if (index >= elements ||
                index <0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            for(int i=index ;i<elements;i++){
                arr[i]=arr[++i];
            }
            elements--;
        }
    }

    public void change(int index,int newValue){
        if (index >= elements ||
                index <0){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index]=newValue;
    }

}
