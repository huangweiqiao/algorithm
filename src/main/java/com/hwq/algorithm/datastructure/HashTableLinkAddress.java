package com.hwq.algorithm.datastructure;

import java.math.BigInteger;

/**
 * Created by hwq on 2019/10/19.
 */
public class HashTableLinkAddress {
    private HashTableLink [] arr;

    public HashTableLinkAddress(){
        arr = new HashTableLink[100];
    }

    public HashTableLinkAddress(int maxSize){
        arr = new HashTableLink[maxSize];
    }

    public void insert(Info info){
        //获取关键字
        String key = info.getKey();
        //关键字所自定的哈希数
        int hashVal = hashCode(key);
        if(arr[hashVal]==null){
            arr[hashVal]=new HashTableLink();
        }
        arr[hashVal].insertFirst(info);
    }

    public Info find(String key){
        //关键字所自定的哈希数
        int hashVal = hashCode(key);
        return arr[hashVal].find(key).info;
    }

    public Info delete(String key){
        //关键字所自定的哈希数
        int hashVal = hashCode(key);
        return  arr[hashVal].delete(key).info;
    }

    public int hashCode(String key){
       BigInteger hashValue = new BigInteger("0");
        /* for (int i=key.length()-1;i>=0;i--){
            int letter = key.charAt(i)-96;
            hashValue+=letter;
        }*/
        BigInteger pow27 = new BigInteger("1");;
        for (int i=key.length()-1;i>=0;i--){
            int letter = key.charAt(i) - 96;
            BigInteger letterB = new BigInteger(letter+"");
            hashValue = hashValue.add(letterB.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(27+""));
        }
        return hashValue.mod(new BigInteger(arr.length+"")).intValue();
    }
}
