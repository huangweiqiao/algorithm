package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.HashTable;
import com.hwq.algorithm.datastructure.Info;

/**
 * Created by hwq on 2019/10/19.
 */
public class TestHashTable {

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert(new Info("zhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsan","张三"));
        ht.insert(new Info("lisi","李四"));
        ht.insert(new Info("wangwu","王五"));


        System.out.println(ht.find("zhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsan").getName());
        System.out.println(ht.find("lisi").getName());
        System.out.println(ht.find("wangwu").getName());
    }
}
