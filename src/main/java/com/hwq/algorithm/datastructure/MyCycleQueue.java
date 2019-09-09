package com.hwq.algorithm.datastructure;

/**
 * 循环队列
 * Created by hwq on 2019/9/1.
 */
public class MyCycleQueue {
    private long [] arr;
    //有效数据的大小
    private int elenments;
    //队头
    private int front;
    //队尾
    private int end;

    public MyCycleQueue(){
        arr = new long[10];
        elenments = 0;
        front = 0;
        end = -1;
    }

    public MyCycleQueue(int maxsize){
        arr = new long[maxsize];
        elenments = 0;
        front = 0;
        end = -1;
    }

    /**
     * 插入数据到队尾
     * @param value
     */
    public void insert(long value){
        if(end == arr.length-1){
            end = -1;
        }
        arr[++end] = value;
        elenments++;
    }

    /**
     * 从对头删除数据
     */
    public long remove(){
        long value = arr[front++];
        if (front == arr.length){
            front = 0;
        }
        elenments--;
        return value;
    }

    /**
     * 查看数据
     * @return
     */
    public long peek(){
        return arr[front];
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        return elenments==0;
    }

    /**
     * 是否已经满了
     * @return
     */
    public boolean isFull(){
        return elenments == arr.length;
    }

}
