package com.hwq.algorithm.datastructure;

/**
 * 双向链表
 * Created by hwq on 2019/9/4.
 */
public class DoubleLinkList {
    //头节点
    private Node first;
    //尾结点
    private Node last;

    public DoubleLinkList(){}

    /**
     * 插入一个节点，在头节点后进行插入
     * @param value
     */
    public void insertfirst(long value){
        Node node = new Node(value);
        if(isEmpty()){
            last = node;
        }else{
            first.preVious = node;
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
            node.preVious = last;
        }
        last = node;
    }

    public Node deleteFirst(){
        Node temp = first;
        if( first.next ==null){
            last = null;
        }else{
            first.next.preVious = null;
        }
        first = temp.next;
        return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        if( first.next ==null){
            first = null;
        }else{
            last.preVious.next = null;
        }
        last = last.preVious;
        return last;
    }

    /**
     * 删除方法，根据数据域来进行删除
     */
    public Node delete(long value){
        Node current = first;
        while (current.data !=value){
            if (current.next == null){
                return null;
            }
            current = current.next;
        }
        if(current==first){
            first =  first.next;
        }else{
            current.preVious.next = current.next;
        }
        return current;
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
