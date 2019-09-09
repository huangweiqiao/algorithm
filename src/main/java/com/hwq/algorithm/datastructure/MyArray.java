package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/8/31.
 */
public class MyArray {
    private long [] arr;
    //有效数据的长度
    private int elements;

    public MyArray(){
        arr = new long[50];
    }

    public MyArray(int maxsize){
        arr = new long[maxsize];
    }

    /**
     *添加数据
     * @param value
     */
    public void insert(long value){
        arr[elements] = value;
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
