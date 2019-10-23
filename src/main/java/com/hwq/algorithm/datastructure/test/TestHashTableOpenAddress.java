package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.HashTable;
import com.hwq.algorithm.datastructure.HashTableOpenAddress;
import com.hwq.algorithm.datastructure.Info;

/**
 * Created by hwq on 2019/10/22.
 */
public class TestHashTableOpenAddress {
    public static void main(String[] args) {
        HashTableOpenAddress ht = new HashTableOpenAddress();
        ht.insert(new Info("a","张三"));
        ht.insert(new Info("ct","李四"));
        ht.insert(new Info("b","王五"));


        System.out.println(ht.find("a").getName());
        System.out.println(ht.find("ct").getName());
        System.out.println(ht.find("b").getName());
    }
}
