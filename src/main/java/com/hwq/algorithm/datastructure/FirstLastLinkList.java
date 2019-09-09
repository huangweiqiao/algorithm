package com.hwq.algorithm.datastructure;

/**
 * 双端链表
 * Created by hwq on 2019/9/4.
 */
public class FirstLastLinkList {
    //头节点
    private Node first;
    //尾结点
    private Node last;

    public FirstLastLinkList(){}

    /**
     * 插入一个节点，在头节点后进行插入
     * @param value
     */
    public void insertfirst(long value){
        Node node = new Node(value);
        if(isEmpty()){
            last = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 插入一个节点，在尾节点后进行插入
     * @param value
     */
    public void insertLast(long value){
        Node node = new Node(value);
        if(isEmpty()){
            first = node;
        }else{
            last.next = node;
        }
        last = node;
    }

    public Node deleteFirst(){
        Node temp = first;
        if( first.next ==null){
            last = null;
        }
        first = temp.next;
        return temp;
    }

    public boolean isEmpty(){
        return first == null;
    }


    public void display(){
        Node current = first;
        while(current!=null){
            current.display();
            current = current.next;
        }
    }

}
