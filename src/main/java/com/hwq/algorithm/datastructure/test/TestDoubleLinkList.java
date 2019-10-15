package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.DoubleLinkList;

/**
 * Created by hwq on 2019/9/9.
 */
public class TestDoubleLinkList {

    public static void main(String[] args) {
        DoubleLinkList dll = new DoubleLinkList();
        dll.insertLast(45);
        dll.insertLast(56);
        dll.insertLast(23);

        dll.display();
        while (!dll.isEmpty()){
            dll.deleteLast();
            System .out.println();
            dll.display();
        }
    }
}
