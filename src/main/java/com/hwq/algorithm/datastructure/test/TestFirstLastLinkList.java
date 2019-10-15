package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.FirstLastLinkList;

/**
 * Created by hwq on 2019/9/9.
 */
public class TestFirstLastLinkList {
    public static void main(String[] args) {
        FirstLastLinkList fll  = new FirstLastLinkList();
        fll.insertLast(1);
        fll.insertLast(2);
        fll.insertLast(3);
        fll.insertLast(4);
        fll.insertLast(5);
        fll.display();
        System.out.println();
        fll.deleteFirst();
        fll.display();
    }
}
