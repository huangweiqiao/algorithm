package com.hwq.algorithm.datastructure;

/**
 * 节点，相当于车厢
 * Created by hwq on 2019/9/2.
 */
public class Node {
    //车厢里装的数据
    public long data;
    //与他相连的车厢
    public Node next;
    //前一个节点
    public Node preVious;

    public Node(long data){
        this.data = data;
    }

    /**
     * 显示方法
     */
    public void display(){
        System.out.print(data+ " ");
    }
}
