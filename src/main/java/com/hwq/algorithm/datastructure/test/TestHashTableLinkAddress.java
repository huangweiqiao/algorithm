package com.hwq.algorithm.datastructure.test;

import com.hwq.algorithm.datastructure.HashTableLinkAddress;
import com.hwq.algorithm.datastructure.HashTableOpenAddress;
import com.hwq.algorithm.datastructure.Info;

/**
 * Created by hwq on 2019/10/23.
 */
public class TestHashTableLinkAddress {

    public static void main(String[] args) {
        HashTableLinkAddress ht = new HashTableLinkAddress();
        System.out.println(ht.hashCode("a"));
        System.out.println(ht.hashCode("ct"));

        ht.insert(new Info("a","张三"));
        ht.insert(new Info("ct","李四"));


        System.out.println(ht.find("a").getName());
        System.out.println(ht.find("ct").getName());

        System.out.println(ht.delete("a").getName());
        //这里会抛异常，因为前面已经删掉了
        System.out.println(ht.find("a").getName());

    }
}
