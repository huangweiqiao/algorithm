package com.hwq.algorithm.datastructure;

/**
 * Created by hwq on 2019/9/2.
 */
public class TestLinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(34);
        linkList.insertFirst(24);
        linkList.insertFirst(67);
        linkList.insertFirst(22);
        linkList.display();
/*        linkList.deleteFirst();
        System.out.println();
        linkList.display();
        System.out.println();
        Node findNode = linkList.find(34);
        if (findNode!=null){
            findNode.display();
        }*/
        System.out.println();
        Node deleteNode = linkList.delete(24);
        if (deleteNode!=null){
            deleteNode.display();
        }
    }
}
