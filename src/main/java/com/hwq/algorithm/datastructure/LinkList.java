package com.hwq.algorithm.datastructure;

/**
 * 链表，相当于火车
 * Created by hwq on 2019/9/2.
 */
public class LinkList {
    //头节点，相当于火车头
    private Node first;

    public LinkList(){

    }

    /**
     * 插入一个节点，在头节点后进行插入
     * @param value
     */
    public void insertFirst(long value){
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;

    }
    /**
     *删除一个节点，在头节点后进行删除
     */
    public Node deleteFirst(){
        Node tmp = first;
        first =  tmp.next;
        return tmp;
    }

    /**
     * 显示列表
     */
    public void display(){
        Node current = first;
        while (current!=null){
            current.display();
            current = current.next;
        }
    }

    /**
     * 查找
     * @param value
     * @return
     */
    public Node find(long value){
        Node current = first;
        while (current.data !=value){
            if (current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 删除方法，根据数据域来进行删除
     */
    public Node delete(long value){
        Node current = first;
        Node previous = first;
        while (current.data !=value){
            if (current.next == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
       if(current==first){
           first =  first.next;
       }else{
           previous.next = current.next;
       }
       return current;
    }

}
